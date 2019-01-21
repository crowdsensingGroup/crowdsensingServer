package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 胡煜家 on 2019/1/21.
 */
@Controller
public class SystemController {
    @RequestMapping("toHome")
    public String toReleaseTask(Model model) {
        return "home/home";
    }
}
