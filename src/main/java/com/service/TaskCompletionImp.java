package com.service;

import com.dao.ChartDataDao;
import com.dao.TaskCompletionDao;
import com.pojo.TaskCompletion;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 胡煜家 on 2019/1/22.
 */
@Service
public class TaskCompletionImp implements TaskCompletionService {
    @Resource
    private TaskCompletionDao taskCompletionDao;

    @Override
    public List<TaskCompletion> queryTaskCompletionByTaskId(int taskId) {
        return taskCompletionDao.queryTaskCompletionByTaskId(taskId);
    }
}
