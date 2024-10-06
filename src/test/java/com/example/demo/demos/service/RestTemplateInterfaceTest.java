package com.example.demo.demos.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.demos.response.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestTemplateInterfaceTest {

    @Autowired
    private WeatherService weatherService;

    @Test
    public void testFLW(){
        FlwResponse flw = weatherService.getFlw();
        String string = JSON.toJSONString(flw);
        System.out.println(string);
    }

    @Test
    public void testFLWWithLang(){
        FlwResponse flw = weatherService.getFlw(WeatherService.SC);
        System.out.println("flw = " + flw);
    }

    @Test
    public void testFND(){
        FndResponse fnd = weatherService.getFnd();
        System.out.println(JSON.toJSONString(fnd));
    }

    @Test
    public void testFNDWithLang(){
        FndResponse fnd = weatherService.getFnd(WeatherService.EN);
        System.out.println(JSON.toJSONString(fnd));
    }

    @Test
    public void testRHRREAD(){
        RhrReadResponse rhrread = weatherService.getRhrRead();
        System.out.println(JSON.toJSONString(rhrread));
    }

    @Test
    public void testSwt(){
        SwtResponse swt = weatherService.getSwt();
        System.out.println(JSON.toJSONString(swt));
    }

    @Test
    public void testLang(){
        SwtResponse errorLang = weatherService.getSwt("error lang");
        System.out.println(errorLang);
    }

    @Test
    public void testWarningInfo(){
        WarningInfoResponse warningInfo = weatherService.getWarningInfo();
        System.out.println(JSON.toJSONString(warningInfo));
    }

    @Test
    public void testWarnSum(){
        WarnSumResponse warnSum = weatherService.getWarnSum();
        System.out.println(JSON.toJSONString(warnSum));
    }
}