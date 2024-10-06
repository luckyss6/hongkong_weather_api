package com.example.demo.demos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FndResponse {
    private String generalSituation;
    private Date updateTime;
    private SeaTemp seaTemp;
    private List<SoilTemp> soilTemp;
    private List<WeatherForecast> weatherForecast;
}

@Data
class SeaTemp {
    private String  place;
    private Float value;
    private String unit;
    private Date recordTime;
}

@Data
class SoilTemp {
    private String place;
    private Float value;
    private String unit;
    private Date recordTime;
    private Depth depth;
}

@Data
class Depth {
    private String unit;
    private Float value;
}

@Data
class WeatherForecast{
    private String forecastDate;
    private String week;
    private String forecastWind;
    private String forecastWeather;
    private Value forecastMaxtemp;
    private Value forecastMintemp;
    private Value forecastMaxrh;
    private Value forecastMinrh;
    private Integer ForecastIcon;
    @JsonProperty("PSR")
    private String psr;
}

@Data
class Value {
    private Integer value;
    private String unit;
}