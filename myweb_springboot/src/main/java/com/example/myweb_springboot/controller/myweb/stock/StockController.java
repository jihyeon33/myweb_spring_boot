package com.example.myweb_springboot.controller.myweb.stock;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/stock")
public class StockController {
    @RequestMapping(value = "/test")   //동작함
    public ModelAndView test() throws Exception{
        ModelAndView mav = new ModelAndView("/myweb/stock/test");
        return mav;
    }

    @RequestMapping(value = "/main")   //동작함
    public ModelAndView mainPage() throws Exception{
        ModelAndView mav = new ModelAndView("/myweb/stock/main");
        return mav;
    }
}
