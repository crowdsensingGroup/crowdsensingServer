package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 胡煜家 on 2019/1/21.
 */
@Controller
@RequestMapping("/userAcceptance")
public class UserAcceptanceController {


    @RequestMapping("queryByCondition")
    public String queryByCondition(String taskGroupName, String status, Model model) {
        return "monitorTask/userAcceptance";
    }
}
