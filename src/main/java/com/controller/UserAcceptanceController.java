package com.controller;

import com.pojo.Task;
import com.pojo.UserAcceptance;
import com.service.TaskService;
import com.service.UserAcceptanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 胡煜家 on 2019/1/21.
 */
@Controller
public class UserAcceptanceController {

    @Autowired
    private UserAcceptanceService userAcceptanceService;

    @Autowired
    private TaskService taskService;


    @RequestMapping("userAcceptance")
    public String queryByTaskId(int taskId ,Model model) {
        Task task = taskService.queryTaskById(taskId);
        List<UserAcceptance> list = userAcceptanceService.queryUserAcceptanceByTaskId(taskId);
        model.addAttribute("task",task);
        model.addAttribute("list",list);
        return "monitorTask/userAcceptance";
    }
}
