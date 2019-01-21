package com.dao;

import com.pojo.ChartData;

import java.util.List;

public interface ChartDataDao {
    List<ChartData> queryAllCompletionRation();
    List<ChartData> queryAllAcceptanceRation();

}
