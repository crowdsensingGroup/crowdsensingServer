package com.service;

import com.dao.ChartDataDao;
import com.pojo.ChartData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;



@Service
public class ChartDataServiceImp implements ChartDataService {
    @Resource
    private ChartDataDao chartDataDao;

    @Override
    public List<ChartData> queryAllCompletionRation() {
        return chartDataDao.queryAllCompletionRation();
    }

    @Override
    public List<ChartData> queryAllAcceptanceRation() {
        return chartDataDao.queryAllAcceptanceRation();
    }
}
