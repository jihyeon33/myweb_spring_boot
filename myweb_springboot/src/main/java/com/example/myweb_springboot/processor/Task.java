package com.example.myweb_springboot.processor;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task {
    private static final Logger logger = LoggerFactory.getLogger(Task.class);

    public static void doTest(){

        logger.info("doTest 호출");

        //5분단위 체크
        //최초가격 저장 , 5% 상승 가격 저장(t_price, flag: up)
        //5분후 체크 :
        // if t_price, flag==up 라면 -> 전액 매도, 5%하락 가격 저장(t_price set, flag: down)
        // if t_price, flag==down 라면 -> 전액 매수, 5%상승 가격 저장(t_price set, flag: up)



    }
}
