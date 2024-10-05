package com.example.demo.demos.response;

import lombok.Data;

import java.util.Date;

@Data
public class WeatherFND {
    private String generalSituation;
    private Date updateTime;
    private SeaTemp seaTemp;
//    private SoilTemp[] soilTemp;
    private WeatherForecast[] weatherForecast;
}

