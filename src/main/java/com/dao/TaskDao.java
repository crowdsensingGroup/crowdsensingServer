package com.dao;

import com.pojo.Task;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 胡煜家 on 2018/6/28.
 */
public interface TaskDao {
    int addTask(Task task);

    int deleteTaskById(int id);

    int updateTask(Task task);

    List<Task> queryAllTask();

    List<Task> queryTaskByCondition(@Param("taskGroupName") String taskGroupName, @Param("status")String status);
}
