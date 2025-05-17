package com.sayantan.firstservice.controller;

import com.sayantan.firstservice.service.SecondServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstServiceController {
    @Autowired
    private SecondServiceClient secondServiceClient;
    @GetMapping("/caller")
    public String caller(){
        return secondServiceClient.getCalling();
    }
    @GetMapping("/calling")
    public String calling(){
        return "Hi I am First Service";
    }
}
