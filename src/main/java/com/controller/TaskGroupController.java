package com.controller;

import com.pojo.TaskGroup;
import com.service.TaskGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/taskGroup")
public class TaskGroupController {
    @Autowired
    private TaskGroupService taskGroupService;

    @RequestMapping("toRelease")
    public String toReleaseTaskGroup() {
        return "releaseTask/releaseTaskGroup";
    }


    @RequestMapping("toAllTaskGroup")
    public String list(Model model) {
        List<TaskGroup> list = taskGroupService.queryAllTaskGroup();
        model.addAttribute("list", list);
        return "monitorTask/queryTaskGroup";
    }
}
