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
    public String toRelease() {
        return "releaseTask/releaseTaskGroup";
    }

    @RequestMapping("/releaseTask")
    public String releaseTask(TaskGroup taskGroup) {
        taskGroupService.addTaskGroup(taskGroup);
        return "redirect:/taskGroup/toAllTaskGroup";
    }

    @RequestMapping("allTaskGroup")
    public String toAllTaskGroup(Model model) {
        List<TaskGroup> list = taskGroupService.queryAllTaskGroup();
        model.addAttribute("list", list);
        return "monitorTask/queryTaskGroup";
    }
}
