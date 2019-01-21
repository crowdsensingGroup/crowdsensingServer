package com.controller;

import com.pojo.ChartData;

import com.pojo.TaskGroup;
import com.service.ChartDataService;

import com.utils.ChartUtils;
import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.List;

/**
 * Created by 胡煜家 on 2019/1/21.
 */
@Controller
@RequestMapping("/chartData")
public class ChartDataController {

    @Autowired
    private ChartDataService chartDataService;

    //显示柱状图
    @RequestMapping(value = "/toTaskCompletionRate")
    public ModelAndView toTaskCompletionRate(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) throws Exception {
        modelMap.put("chartURL", ChartUtils.getChartURL(getTaskCompletionRateDataSet(),request));
        return new ModelAndView("monitorSystem/taskCompletionRate", modelMap);

    }

    @RequestMapping(value = "/toUserAcceptanceRate")
    public ModelAndView touserAcceptanceRate(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) throws Exception {

        modelMap.put("chartURL",ChartUtils.getChartURL(getuserAcceptanceRateDataSet(),request));
        return new ModelAndView("monitorSystem/userAcceptanceRate", modelMap);

    }





    // 获取一个演示用的组合数据集对象
    private  CategoryDataset getTaskCompletionRateDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<ChartData> lists = chartDataService.queryAllCompletionRation();

        for (ChartData taskCompletionRate:lists) {
            dataset.addValue(taskCompletionRate.getProportion(), "", taskCompletionRate.getTaskGroupName());
        }
        return dataset;
    }

    // 获取一个演示用的组合数据集对象
    private  CategoryDataset getuserAcceptanceRateDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<ChartData> lists = chartDataService.queryAllAcceptanceRation();
        for(ChartData userAcceptanceRate:lists){
            dataset.addValue(userAcceptanceRate.getProportion(), "",userAcceptanceRate.getTaskGroupName());
        }
        return dataset;
    }
}
