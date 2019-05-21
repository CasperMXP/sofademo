package org.chilam.sofademo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "Hello SOFABoot";
    }
    
}