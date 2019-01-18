package com.service;

import com.dao.TaskGroupDao;
import com.pojo.TaskGroup;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 胡煜家 on 2018/6/28.
 */
@Service
public class TaskGroupServiceImp implements TaskGroupService {
    @Resource
    private TaskGroupDao taskGroupDao;

    @Override
    public int addTaskGroup(TaskGroup taskGroup) {
        return taskGroupDao.addTaskGroup(taskGroup);
    }

    @Override
    public int deleteTaskGroupById(int id) {
        return taskGroupDao.deleteTaskGroupById(id);
    }

    @Override
    public int updateTaskGroup(TaskGroup taskGroup) {
        return taskGroupDao.updateTaskGroup(taskGroup);
    }

    @Override
    public List<TaskGroup> queryAllTaskGroup() {
        return taskGroupDao.queryAllTaskGroup();
    }
}
