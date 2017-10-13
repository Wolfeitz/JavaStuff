package edu.tccd.whappapi.userauthorization;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/accessControl")
public class AccessModuleController {
    //private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    //public AccessModule isAllowed(int colleagueid, String module) {
    @RequestMapping("hasAccess")
    public AccessModule checkAccess(@RequestParam(value = "cid") Integer colleagueid, @RequestParam(value = "mod") String module) {
        /* determine access based upon colleagueID & module
        query API here */
        if(colleagueid == 0){ module = "mmenu";}
        return new AccessModule(isAllowed(colleagueid, module), colleagueid, module);
    }

    @RequestMapping("hasAccess/byUser")
    public ArrayList<AccessModule> checkUserAccess(@RequestParam(value = "cid") Integer colleagueid) {
        /* determine all access based upon colleagueID */
        //if(colleagueid == 0){ module = "mmenu";}
        ArrayList<AccessModule> list = new ArrayList<>();
        list.add(new AccessModule(true, colleagueid, "AAAA"));
        list.add(new AccessModule(true, colleagueid, "BBBB"));
        list.add(new AccessModule(true, colleagueid, "CCCC"));
        list.add(new AccessModule(true, colleagueid, "DDDD"));
        list.add(new AccessModule(true, colleagueid, "EEEE"));
        list.add(new AccessModule(true, colleagueid, "FFFF"));
        return list;
    }

    @RequestMapping("grantAccess")
    public AccessModule grantAccess(@RequestParam(value = "cid") Integer colleagueid, @RequestParam(value = "mod") String module)    {

        //module used for granting access to resources
        return new AccessModule(true, 1111, "not yet implemented");
    }

    @RequestMapping("removeAccess")
    public AccessModule revokeAccess(@RequestParam(value = "cid") Integer colleagueid, @RequestParam(value = "mod") String module)    {

        //module used for granting access to resources
        return new AccessModule(false, 1212, Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    private Boolean isAllowed(int cid, String mod){
        //we would be using the cid and mod against the db here
        return (cid % 2 == 0);
    }
}