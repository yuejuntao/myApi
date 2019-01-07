package com.dh.yjt.myApi.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloApi(){
        return "==============================helloApi";
    }
}
