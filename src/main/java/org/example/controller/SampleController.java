package org.example.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    Log log = LogFactory.getLog("sample");

    @GetMapping("/hello")
    public String hello(){
        log.info("get /hello");
        return "Hello, this is a spring RESTful API";
    }
}
