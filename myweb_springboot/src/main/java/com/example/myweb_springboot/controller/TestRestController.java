package com.example.myweb_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping(value = "/testValue2",method = RequestMethod.GET)
    public String getTestValue2(){
        String testvalue="레스트컨트롤러 : 리스폰스바디 + 컨트롤러";
        return testvalue;
    }
}
