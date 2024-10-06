package com.example.demo.demos.response;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RhrReadResponse {
    private Date iconUpdateTime;
    private Date updateTime;
    private String tcmessage;
    private String mintempFrom00To09;
    private String rainfallFrom00To12;
    private String rainfallLastMonth;
    private String rainfallJanuaryToLastMonth;
    private Humidity humidity;
    private Temperature temperature;
    private Uvindex uvindex;
    private List<Integer> icon;
    private List<String> warningMessage;
    private RainFall rainfall;
}

@Data
class RainFall {
    private Date startTime;
    private Date endTime;
    private List<RainFallData> data;
}

@Data
class RainFallData {
    private String unit;
    private String place;
    private Integer max;
    private String main;
}

@Data
class Uvindex {
    private String recordDesc;
    private List<UvindexData> data;
}

@Data
class UvindexData {
    private String place;
    private Integer value;
    private String desc;
}

@Data
class Temperature {
    private Date recordTime;
    private List<TemperatureData> data;
}

@Data
class TemperatureData {
    private String place;
    private Integer value;
    private String unit;
}

@Data
class Humidity {
    private Date recordTime;
    private List<HumidityData> data;
}

@Data
class HumidityData {
    private String unit;
    private Integer value;
    private String place;
}
