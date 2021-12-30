package com.stackroute.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/secondservice/")
public class SecondController {
    @GetMapping("consumer")
    public String message(){
        return "hey i am second service";
    }
}
