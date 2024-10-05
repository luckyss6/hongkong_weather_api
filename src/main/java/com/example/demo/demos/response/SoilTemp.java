package com.example.demo.demos.response;

import lombok.Data;

import java.util.Date;

@Data
public class SoilTemp {
    private String place;
    private Integer value;
    private String unit;
    private Date recordTime;
    private Depth depth;
}

