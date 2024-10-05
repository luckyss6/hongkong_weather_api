package com.example.demo.demos.service;

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
        WeatherFLW resp = weatherService.getFLW(WeatherService.TC);
        System.out.println("resp = " + resp);
    }

    @Test
    public void testFND(){
        WeatherFND fnd = weatherService.getFND(WeatherService.SC);
        System.out.println("fnd = " + fnd);
    }
}