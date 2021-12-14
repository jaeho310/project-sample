package com.example.projectsample.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public Object test() {
        return "testa";
    }

    @GetMapping("/abc")
    public Object test123() {
        return "testasdfa";
    }
}
