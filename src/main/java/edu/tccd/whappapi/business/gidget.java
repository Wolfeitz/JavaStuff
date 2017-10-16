package edu.tccd.whappapi.business;

public class gidget {
    public Boolean isAllowed(int cid, String mod){
        //we would be using the cid and mod against the db here
        return (cid % 2 == 0);
    }
}
