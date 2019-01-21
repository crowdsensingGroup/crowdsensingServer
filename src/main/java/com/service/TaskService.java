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

    List<Task> queryAllTask();

    List<Task> queryTaskByTaskGroupId(int id);

    List<Task> queryTaskByTaskGroupName(String  name);

    List<Task> queryTaskByStatus(String status);
}
