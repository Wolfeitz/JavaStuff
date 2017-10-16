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

        edu.tccd.whappapi.business.gidget g = new edu.tccd.whappapi.business.gidget();
        return new AccessModule(g.isAllowed(colleagueid, module), colleagueid, module);
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

    @RequestMapping("hasAccess/byMod")
    public ArrayList<AccessModule> checkModuleAccess(@RequestParam(value = "mod") String module) {
        /* determine all access to a module based upon mod identifier */
        ArrayList<AccessModule> list = new ArrayList<>();
        list.add(new AccessModule(true, 1000001, module));
        list.add(new AccessModule(true, 1000002, module));
        list.add(new AccessModule(true, 1000003, module));
        list.add(new AccessModule(true, 1000004, module));
        list.add(new AccessModule(true, 1000005, module));
        list.add(new AccessModule(true, 1000006, module));
        return list;
    }

    @RequestMapping("grantAccess")
    public AccessModule grantAccess(@RequestParam(value = "cid") Integer colleagueid, @RequestParam(value = "mod") String module)    {

        //module used for granting access to resources
        return new AccessModule(true, 1111, "not yet implemented");
        //this needs to be logged
    }

    @RequestMapping("removeAccess")
    public AccessModule revokeAccess(@RequestParam(value = "cid") Integer colleagueid, @RequestParam(value = "mod") String module)    {

        //module used for granting access to resources
        return new AccessModule(false, 1212, Thread.currentThread().getStackTrace()[1].getMethodName());
        //this needs to be logged
    }


}