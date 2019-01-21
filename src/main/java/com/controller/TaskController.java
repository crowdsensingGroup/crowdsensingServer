package com.controller;

import com.pojo.Task;
import com.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @RequestMapping("toReleaseTask")
    public String toReleaseTask() {
        return "releaseTask/releaseTask";
    }


    @RequestMapping("toQueryTask")
    public String toQueryTask(Model model) {
        List<Task> list =taskService.queryAllTask();
        model.addAttribute("list",list);
        return "monitorTask/queryTask";
    }


    @RequestMapping("toTaskCompletionRate")
    public String toTaskCompletionRate() {
        return "monitorSystem/taskCompletionRate";
    }

    @RequestMapping("toUserAcceptanceRate")
    public String toUserAcceptanceRate() {
        return "monitorSystem/userAcceptanceRate";
    }

    @RequestMapping(value = "/getTask")
    @ResponseBody
    public Map<String, Object> getTask(String latitude, String longitude) {
        System.out.println("---------收到消息，用户维度：" + latitude + ",用户经度：" + longitude + "---------");
        Map<String, Object> results = new HashMap<String, Object>();
        //此处从数据库中取任务
        results.put("latitude", 32.0801);
        results.put("longitude", 118.652);
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
