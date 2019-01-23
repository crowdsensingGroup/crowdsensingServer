package com.controller;

import com.pojo.Task;
import com.pojo.TaskCompletion;
import com.service.TaskCompletionService;
import com.service.TaskService;
import com.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;

/**
 * Created by 胡煜家 on 2019/1/21.
 */
@Controller
public class TaskCompletionController {

    @Autowired
    private TaskCompletionService taskCompletionService;

    @Autowired
    private TaskService taskService;

    @RequestMapping("taskCompletion")
    public String taskCompletion(int taskId, Model model) {
        List<TaskCompletion> list = taskCompletionService.queryTaskCompletionByTaskId(taskId);
        model.addAttribute("list", list);
        Task task = taskService.queryTaskById(taskId);
        model.addAttribute("task", task);
        return "monitorTask/taskCompletion";
    }

    /**
     * 处理图片显示请求
     *
     * @param fileName
     */
    @RequestMapping("/showPic/{fileName}.{suffix}")
    public void showPicture(@PathVariable("fileName") String fileName, @PathVariable("suffix") String suffix,
                            HttpServletResponse response) {
        File imgFile = new File("c:/files/" + fileName + "." + suffix);
        FileUtils.responseFile(response, imgFile);
    }


}
