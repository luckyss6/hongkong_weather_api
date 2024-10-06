package com.example.demo.demos.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.demos.response.WeatherFLW;
import com.example.demo.demos.response.WeatherFND;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestTemplateInterfaceTest {

    @Autowired
    private WeatherService weatherService;

    @Test
    public void testFLW(){
        WeatherFLW flw = weatherService.getFlw();
        String string = JSON.toJSONString(flw);
        System.out.println(string);
    }

    @Test
    public void testFLWWithLang(){
        WeatherFLW flw = weatherService.getFlw(WeatherService.SC);
        System.out.println("flw = " + flw);
    }

    @Test
    public void testFND(){
        WeatherFND fnd = weatherService.getFnd();
        System.out.println(JSON.toJSONString(fnd));
    }

    @Test
    public void testFNDWithLang(){
        WeatherFND fnd = weatherService.getFnd(WeatherService.EN);
        System.out.println(JSON.toJSONString(fnd));
    }

    @Test
    public void testRHRREAD(){
        String rhrread = weatherService.getRhrRead();
        System.out.println(rhrread);
    }
}