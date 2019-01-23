package com.service;


import com.pojo.Task;

import java.util.List;

/**
 * Created by howie on 2019/1/18.
 */
public interface TaskService {

    int addTask(Task task);

    int deleteTaskById(int id);

    int updateTask(Task task);

    Task getTask();

    Task queryTaskById(int id);

    List<Task> queryAllTask();

    List<Task> queryTaskByCondition(String taskGroupName, String status);
}
