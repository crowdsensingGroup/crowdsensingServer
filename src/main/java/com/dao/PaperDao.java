package com.dao;

import com.pojo.Paper;

import java.util.List;

/**
 * Created by 胡煜家 on 2018/6/28.
 */
public interface PaperDao {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
