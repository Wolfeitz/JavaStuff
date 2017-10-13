package edu.tccd.whappapi.userauthorization;


public class AccessModule {
    private Boolean isPermitted;
    private Integer colleagueId;
    private String module;

//    public AccessModule(Boolean isPermitted) {
//        this.isPermitted = isPermitted;
//    }
//    public AccessModule(Boolean isPermitted, Integer colleagueId) {
//        this.isPermitted = isPermitted;
//        this.colleagueId = colleagueId;
//    }

    AccessModule(Boolean isPermitted, Integer colleagueId, String module) {
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

    public String getModule() {
        return module;
    }
}
