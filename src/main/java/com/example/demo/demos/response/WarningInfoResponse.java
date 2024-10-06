package com.example.demo.demos.response;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class WarningInfoResponse {
    private List<Detail> details;
}

@Data
class Detail {
    private List<String> contents;
    private String warningStatementCode;
    private String subtype;
    private Date updateTime;
}
