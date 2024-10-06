package com.example.demo.demos.response;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SwtResponse {
    private List<Swt> swt;
}

@Data
class Swt {
    private String desc;
    private Date updateTime;
}
