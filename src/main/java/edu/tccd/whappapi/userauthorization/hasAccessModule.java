package edu.tccd.whappapi.userauthorization;

public class hasAccessModule {
    private final boolean isPermitted;
    private int colleagueId;
    private String module;

    public hasAccessModule(boolean isPermitted) {
        this.isPermitted = isPermitted;
    }
    public hasAccessModule(boolean isPermitted, int colleagueId) {
        this.isPermitted = isPermitted;
        this.colleagueId = colleagueId;
    }

    public hasAccessModule(boolean isPermitted, int colleagueId, String module) {
    this.isPermitted = isPermitted;
    this.colleagueId = colleagueId;
    this.module = module;
    }


    public boolean getPermitted() {
        return isPermitted;
    }

    public int getColleagueId () {
        return colleagueId;
    }

    public String getmodule () {
        return module;
    }
}
