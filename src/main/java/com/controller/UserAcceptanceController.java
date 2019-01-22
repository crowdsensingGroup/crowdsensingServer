package com.controller;

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


    @RequestMapping("/userAcceptance")
    public String queryByTaskId(int taskId ,Model model) {

        List<UserAcceptance> listUser = userAcceptanceService.queryUserAcceptanceByTaskId(taskId);

        model.addAttribute("listUser",listUser);
        return "monitorTask/userAcceptance";
    }
}
