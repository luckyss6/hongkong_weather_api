package com.example.demo.demos.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.demos.response.WeatherFLW;
import com.example.demo.demos.response.WeatherFND;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Objects;

@Service
public class WeatherService {
    private final String URL = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php";

    // language
    public static String EN = "en"; // 英文
    public static String TC = "tc"; // 繁体中文
    public static String SC = "sc"; // 简体中文

    @Autowired
    private RestTemplate restTemplate;

    // 本港地区天气预报
    public WeatherFLW getFLW(String language) {
        ResponseEntity<JSONObject> resp = restTemplate.
                getForEntity(URL + "?dataType=flw&lang=" + language, JSONObject.class);
        return Objects.requireNonNull(resp.getBody()).toJavaObject(WeatherFLW.class);
    }

    // 九天天气预报
    public WeatherFND getFND(String language){
        ResponseEntity<JSONObject> resp = restTemplate.
                getForEntity(URL + "?dataType=fnd&lang=" + language, JSONObject.class);
        return Objects.requireNonNull(resp.getBody()).toJavaObject(WeatherFND.class);
    }

    // 本港地区天气报告
    public String getRHRREAD(String language) {
        return "";
    }
}
