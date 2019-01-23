package com.dao;

import com.pojo.TaskCompletion;

import java.util.List;

/**
 * Created by 胡煜家 on 2019/1/22.
 */
public interface TaskCompletionDao {
    List<TaskCompletion> queryTaskCompletionByTaskId(int taskId);

    int addTaskCompletion(TaskCompletion taskCompletion);
}
