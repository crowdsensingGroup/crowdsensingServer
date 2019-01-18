package com.dao;

import com.pojo.Task;

import java.util.List;

/**
 * Created by 胡煜家 on 2018/6/28.
 */
public interface TaskDao {
    int addTask(Task task);

    int deleteTaskById(int id);

    int updateTask(Task task);

    List<Task> queryAllTask();

    List<Task> queryTaskByTaskGroupId(int id);

    List<Task> queryTaskByTaskGroupName(int id);

    List<Task> queryTaskByStatus(String status);
}
