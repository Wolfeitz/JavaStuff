package edu.tccd.whappapi.userauthorization;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class hasAccessModule {
    private Boolean isPermitted = false;
    private Integer colleagueId = 0;
    private String module = "";

//    public hasAccessModule(boolean isPermitted) {
//        this.isPermitted = isPermitted;
//    }
//    public hasAccessModule(boolean isPermitted, int colleagueId) {
//        this.isPermitted = isPermitted;
//        this.colleagueId = colleagueId;
//    }

    public hasAccessModule(boolean isPermitted, int colleagueId, String module) {
    this.isPermitted = isPermitted;
    this.colleagueId = colleagueId;
    this.module = module;
    }


    public Boolean getPermitted() {
        return isPermitted;
    }

    public Integer getColleagueId () {
        return colleagueId;
    }

    public String getmodule () {
        return module;
    }
}
