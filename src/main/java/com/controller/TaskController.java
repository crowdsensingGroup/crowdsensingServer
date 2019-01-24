package com.controller;

import com.pojo.Task;
import com.pojo.TaskCompletion;
import com.pojo.TaskGroup;
import com.pojo.UserAcceptance;
import com.service.TaskCompletionService;
import com.service.TaskGroupService;
import com.service.TaskService;
import com.service.UserAcceptanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskGroupService taskGroupService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private UserAcceptanceService userAcceptanceService;

    @Autowired
    private TaskCompletionService taskCompletionService;

    @RequestMapping("toReleaseTask")
    public String toReleaseTask(Model model) {
        List<TaskGroup> list = taskGroupService.queryAllTaskGroup();
        model.addAttribute("list", list);
        return "releaseTask/releaseTask";
    }

    @RequestMapping("/releaseTask")
    public String releaseTask(Task task) {
        taskService.addTask(task);
        return "redirect:/task/allTask";
    }

    @RequestMapping("allTask")
    public String toAllTask(Model model) {
        List<Task> list = taskService.queryAllTask();
        model.addAttribute("list", list);
        return "monitorTask/queryTask";
    }

    @RequestMapping("queryByCondition")
    public String queryByCondition(String taskGroupName, String status, Model model) {
        List<Task> list = taskService.queryTaskByCondition(taskGroupName, status);
        model.addAttribute("list", list);
        return "monitorTask/queryTask";
    }

    @RequestMapping(value = "/getTask")
    @ResponseBody
    public Map<String, Object> getTask(float latitude, float longitude) {
        Task task = taskService.getTask();
        Map<String, Object> results = new HashMap<String, Object>();
        results.put("latitude", task.getLatitude());
        results.put("longitude", task.getLongitude());
        results.put("taskType", task.getTaskType());
        results.put("taskId", task.getId());
        return results;
    }

    @RequestMapping(value = "/acceptTask")
    @ResponseBody
    public Map<String, Object> acceptTask(float latitude, float longitude, int taskId) {
        UserAcceptance userAcceptance = new UserAcceptance();

        Random random = new Random();
        float latOffset = random.nextInt(50 + 50 + 1) - 50;
        float lngOffset = random.nextInt(50 + 50 + 1) - 50;
        userAcceptance.setAcceptLatitude(latitude + latOffset / 10000);
        userAcceptance.setAcceptLongitude(longitude + lngOffset / 10000);

        userAcceptance.setTaskId(taskId);
        userAcceptance.setTravelDistance(50 + new Random().nextInt(1200));
        userAcceptanceService.addUserAcceptance(userAcceptance);
        Task task = taskService.queryTaskById(taskId);
        task.setStatus("已接受");
        taskService.updateTask(task);
        Map<String, Object> results = new HashMap<String, Object>();
        results.put("result", "success");
        return results;
    }

    @RequestMapping(value = "/completeTask")
    @ResponseBody
    public Map<String, Object> completeTask(String completionDatetime, String submissionDatetime, int taskId, String taskData) {
        TaskCompletion taskCompletion = new TaskCompletion();
        taskCompletion.setTaskId(taskId);
        taskCompletion.setCompletionDatetime(completionDatetime);
        taskCompletion.setSubmissionDatetime(submissionDatetime);
        taskCompletion.setTaskData(taskData);
        taskCompletionService.addTaskCompletion(taskCompletion);
        Task task = taskService.queryTaskById(taskId);
        task.setStatus("已完成");
        taskService.updateTask(task);
        Map<String, Object> results = new HashMap<String, Object>();
        results.put("result", "success");
        return results;
    }

    /*@RequestMapping(value = "/getTask")
    @ResponseBody
    public Map<String, Object> getTask(String latitude, String longitude) {
        System.out.println("---------收到消息：" + latitude + "," + longitude + "---------");
        String result = "fail";
        Map<String, Object> results = new HashMap<String, Object>();
        results.put("result", result);
        return results;
    }*/
}
