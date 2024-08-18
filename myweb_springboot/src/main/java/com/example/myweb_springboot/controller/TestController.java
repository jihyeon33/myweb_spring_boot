package com.example.myweb_springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {


    @RequestMapping(value = "/home")
    public String home(){
        return "index.html";
    }

    @RequestMapping(value = "/testValue",method = RequestMethod.GET)
    @ResponseBody
    public String getTestValue(){
        String testvalue="리퀘스트매핑 + 리스폰스바디";
        return testvalue;
    }


    @RequestMapping(value = "/test")
    public ModelAndView test() throws Exception{
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name","jihyeon");

        List<String> testList = new ArrayList<String>();
        testList.add("A");
        testList.add("b");
        testList.add("c");

        mav.addObject("list", testList);
        return mav;
    }
    @RequestMapping(value = "/test_t")
    public ModelAndView test2() throws Exception{
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name","jihyeon");

        List<String> testList = new ArrayList<String>();
        testList.add("A");
        testList.add("b");
        testList.add("c");

        mav.addObject("list", testList);
        mav.setViewName("test_t");
        return mav;
    }

}
