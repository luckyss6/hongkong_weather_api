package com.example.demo.demos.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WarnSumResponse {
    @JsonProperty("WFIRE")
    private Warn wfire;
    @JsonProperty("WFROST")
    private Warn wfrost;
    @JsonProperty("WHOT")
    private Warn whot;
    @JsonProperty("WCOLD")
    private Warn wclod;
    @JsonProperty("WMSGNL")
    private Warn wmsgnl;
    @JsonProperty("WRAIN")
    private Warn wrain;
    @JsonProperty("WFNTSA")
    private Warn wfntsa;
    @JsonProperty("WL")
    private Warn wl;
    @JsonProperty("WTCSGNL")
    private Warn wtcsgnl;
    @JsonProperty("WTMW")
    private Warn wtmw;
    @JsonProperty("WTS")
    private Warn wts;
}

@Data
class Warn {
    private String name;
    private String code;
    private String type;
    private String actionCOde;
    private Date issueTime;
    private Date updateTime;
}
