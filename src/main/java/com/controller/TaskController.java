package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/task")
public class TaskController {
    @RequestMapping("toReleaseTask")
    public String toReleaseTask() {
        return "releaseTask";
    }

    @RequestMapping("toTaskQuery")
    public String toTaskQuery() {
        return "taskQuery";
    }

    @RequestMapping("toTaskCompletionRate")
    public String toTaskCompletionRate() {
        return "taskCompletionRate";
    }

    @RequestMapping("toUserAcceptanceRate")
    public String toUserAcceptanceRate() {
        return "userAcceptanceRate";
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