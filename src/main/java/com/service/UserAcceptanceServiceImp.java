package com.service;

import com.dao.UserAcceptanceDao;
import com.pojo.UserAcceptance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAcceptanceServiceImp implements UserAcceptanceService{
    @Autowired
    private UserAcceptanceDao userAcceptanceDao;

    @Override
    public List<UserAcceptance> queryUserAcceptanceByTaskId(int taskId) {
        return userAcceptanceDao.queryUserAcceptanceByTaskId(taskId);
    }
}
