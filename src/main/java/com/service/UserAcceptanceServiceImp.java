package com.service;

import com.dao.UserAcceptanceDao;
import com.pojo.UserAcceptance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserAcceptanceServiceImp implements UserAcceptanceService{
    @Resource
    private UserAcceptanceDao userAcceptanceDao;

    @Override
    public List<UserAcceptance> queryUserAcceptanceByTaskId(int taskId) {
        return userAcceptanceDao.queryUserAcceptanceByTaskId(taskId);
    }
}
