package com.jihan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("info")
    public String getInfo(){
        return "Hello SpringBoot Info";
    }
}
