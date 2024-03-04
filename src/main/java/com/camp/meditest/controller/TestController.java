package com.camp.meditest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/test")
public class TestController {

@PostMapping
    public void getMyApp()
    {
        String MyApp="My First App";
        System.out.println(MyApp);
    }
}
