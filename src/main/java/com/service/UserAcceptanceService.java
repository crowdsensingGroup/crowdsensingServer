package com.service;

import com.pojo.UserAcceptance;

import java.util.List;

public interface UserAcceptanceService {
    List<UserAcceptance> queryUserAcceptanceByTaskId(int taskId);

    int addUserAcceptance(UserAcceptance userAcceptance);
}
