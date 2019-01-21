package com.service;

import com.pojo.ChartData;

import java.util.List;

public interface ChartDataService {

    List<ChartData> queryAllCompletionRation();
    List<ChartData> queryAllAcceptanceRation();

}
