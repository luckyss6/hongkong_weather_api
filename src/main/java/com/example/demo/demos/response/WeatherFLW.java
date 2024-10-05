package com.example.demo.demos.response;

import lombok.Data;

import java.util.Date;

@Data
public class WeatherFLW {
    private String generalSituation; // 概况
    private String tcInfo; // 热带气旋资讯
    private String fireDangerWarning; // 火灾危险警告信息
    private String forecastPeriod; // 预测时段
    private String forecastDesc; // 预测内容
    private String outlook; // 展望
    private Date updateTime; // 更新时间
}
