package com.example.demo.demos.service;

import com.example.demo.demos.response.WeatherFLW;
import com.example.demo.demos.response.WeatherFND;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Service
public class WeatherService {
    private final static String URL = "https://data.weather.gov.hk/weatherAPI/opendata/weather.php";

    private final static String FLW = "flw";
    private final static String FND = "fnd";
    private final static String RHR_READ = "rhrread";
    private final static String WARN_SUM =  "warnsum";
    private final static String WARNING_INFO = "warningInfo";
    private final static String SWT = "swt";

    public final static String SC = "sc";
    public final static String TC = "tc";
    public final static String EN = "en";

    private final static Set<String> LANG_SET = new HashSet<>(Arrays.asList(SC, TC, EN));

    @Autowired
    private RestTemplate restTemplate;

    private Boolean assertLang(String lang){
        return LANG_SET.contains(lang);
    }

    private String combineURL(String lang, String dataType){
        return URL + String.format("?dataType=%s&lang=%s",dataType , lang);
    }

    // 本港地区天气预报
    public WeatherFLW getFlw(){
        return restTemplate.getForObject(combineURL(TC, FLW), WeatherFLW.class);
    }

    public WeatherFLW getFlw(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, FLW), WeatherFLW.class);
    }

    // 九天天气预报
    public WeatherFND getFnd(){
        return restTemplate.getForObject(combineURL(TC, FND), WeatherFND.class);
    }

    public WeatherFND getFnd(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, FND), WeatherFND.class);
    }

    // 本港地区天气报告
    public String getRhrRead(){
        return restTemplate.getForObject(combineURL(TC, RHR_READ), String.class);
    }

    public String getRhrRead(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, RHR_READ), String.class);
    }

    // 天气警告一览
    public String getWarnSum(){
        return restTemplate.getForObject(combineURL(TC, WARN_SUM), String.class);
    }

    public String getWarnSum(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, WARN_SUM), String.class);
    }

    // 详细天气警告信息
    public String getWarningInfo(){
        return restTemplate.getForObject(combineURL(TC, WARNING_INFO), String.class);
    }

    public String getWarningInfo(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, WARNING_INFO), String.class);
    }

    // 特别天气提示
    public String getSwt(){
        return restTemplate.getForObject(combineURL(TC, SWT), String.class);
    }

    public String getSwt(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, SWT), String.class);
    }
}
