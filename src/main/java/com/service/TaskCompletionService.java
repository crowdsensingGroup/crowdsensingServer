package com.service;

import com.pojo.TaskCompletion;

import java.util.List;

/**
 * Created by 胡煜家 on 2019/1/22.
 */
public interface TaskCompletionService {
    List<TaskCompletion> queryTaskCompletionByTaskId(int taskId);
}
