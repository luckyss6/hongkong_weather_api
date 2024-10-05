package com.example.demo.demos.response;

import lombok.Data;

import java.util.Date;

@Data
public class SeaTemp {
    private String  place;
    private Integer value;
    private String unit;
    private Date recordTime;
}
