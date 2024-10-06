package com.example.demo.demos.service;

import com.example.demo.demos.response.*;
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
    public FlwResponse getFlw(){
        return restTemplate.getForObject(combineURL(TC, FLW), FlwResponse.class);
    }

    public FlwResponse getFlw(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, FLW), FlwResponse.class);
    }

    // 九天天气预报
    public FndResponse getFnd(){
        return restTemplate.getForObject(combineURL(TC, FND), FndResponse.class);
    }

    public FndResponse getFnd(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, FND), FndResponse.class);
    }

    // 本港地区天气报告
    public RhrReadResponse getRhrRead(){
        return restTemplate.getForObject(combineURL(TC, RHR_READ), RhrReadResponse.class);
    }

    public RhrReadResponse getRhrRead(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, RHR_READ), RhrReadResponse.class);
    }

    // 天气警告一览
    public WarnSumResponse getWarnSum(){
        return restTemplate.getForObject(combineURL(TC, WARN_SUM), WarnSumResponse.class);
    }

    public WarnSumResponse getWarnSum(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, WARN_SUM), WarnSumResponse.class);
    }

    // 详细天气警告信息
    public WarningInfoResponse getWarningInfo(){
        return restTemplate.getForObject(combineURL(TC, WARNING_INFO), WarningInfoResponse.class);
    }

    public WarningInfoResponse getWarningInfo(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, WARNING_INFO), WarningInfoResponse.class);
    }

    // 特别天气提示
    public SwtResponse getSwt(){
        return restTemplate.getForObject(combineURL(TC, SWT), SwtResponse.class);
    }

    public SwtResponse getSwt(String lang){
        if (!assertLang(lang)) {
            throw new IllegalArgumentException("language parameter error");
        }
        return restTemplate.getForObject(combineURL(lang, SWT), SwtResponse.class);
    }
}
