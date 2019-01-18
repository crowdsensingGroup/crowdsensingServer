package com.dao;

import com.pojo.TaskGroup;

import java.util.List;

/**
 * Created by 胡煜家 on 2018/6/28.
 */
public interface TaskGroupDao {
    int addTaskGroup(TaskGroup taskGroup);

    int deleteTaskGroupById(int id);

    int updateTaskGroup(TaskGroup taskGroup);

    List<TaskGroup> queryAllTaskGroup();
}
