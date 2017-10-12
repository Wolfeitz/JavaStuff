package edu.tccd.whappapi.userauthorization;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hasAccessModuleController {
    //private static final String template = "Hello, %s!";
    //private final AtomicLong counter = new AtomicLong();

    //public hasAccessModule isAllowed(int colleagueid, String module) {
    @RequestMapping("/accessControl/hasAccessModule")
    public hasAccessModule required(Integer colleagueid, String module) {
        /* determine access based upon colleagueID & module
        query API here */
        return new hasAccessModule(false, 1234321, "Test module");
    }
}
