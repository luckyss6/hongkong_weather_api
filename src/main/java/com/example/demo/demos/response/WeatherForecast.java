package com.example.demo.demos.response;

import lombok.Data;

@Data
public class WeatherForecast{
    private String forecastDate;
    private String week;
    private String forecastWind;
    private String forecastWeather;
    private Value forecastMaxtemp;
    private Value forecastMintemp;
    private Value forecastMaxrh;
    private Value forecastMinrh;
    private Integer ForecastIcon;
    private String PSR;
}

