package com.service;

import com.dao.TaskDao;
import com.pojo.Task;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TaskServiceImp implements TaskService {
    @Resource
    private TaskDao taskDao;

    @Override
    public int addTask(Task task) {
        return taskDao.addTask(task);
    }

    @Override
    public int deleteTaskById(int id) {
        return taskDao.deleteTaskById(id);
    }

    @Override
    public int updateTask(Task task) {
        return taskDao.updateTask(task);
    }

    @Override
    public List<Task> queryAllTask() {
        return taskDao.queryAllTask();
    }

    @Override
    public List<Task> queryTaskByTaskGroupId(int id) {
        return taskDao.queryTaskByTaskGroupId(id);
    }

    @Override
    public List<Task> queryTaskByTaskGroupName(String name) {
        return taskDao.queryTaskByTaskGroupName(name);
    }

    @Override
    public List<Task> queryTaskByStatus(String status) {
        return taskDao.queryTaskByStatus(status);
    }
}
