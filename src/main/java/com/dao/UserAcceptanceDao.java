package com.dao;

import com.pojo.UserAcceptance;

import java.util.List;

/**
 * Created by 胡煜家 on 2019/1/21.
 */
public interface UserAcceptanceDao {
    List<UserAcceptance> queryUserAcceptanceByTaskId(int taskId);

    int addUserAcceptance(UserAcceptance userAcceptance);
}
