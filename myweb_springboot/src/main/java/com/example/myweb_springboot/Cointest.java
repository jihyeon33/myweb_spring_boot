package com.example.myweb_springboot;

import com.example.myweb_springboot.service.coin.Current_market_price_inquiry_service;
import com.example.myweb_springboot.vo.coin.TickerVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Cointest {
    private static final Logger logger = LoggerFactory.getLogger(Cointest.class);
    public static void main(String[] args) {
        logger.info("[Cointest] 호출");

        TickerVo coin  = new TickerVo();
        Current_market_price_inquiry_service Current_market_price_inquiry_service = new Current_market_price_inquiry_service();
        List<TickerVo> coin_list =  Current_market_price_inquiry_service.current_price_information_per_item();
        logger.info("-------------------------------------------");
        for(int i =0;i<coin_list.size();i++){
            TickerVo vo = coin_list.get(i);
            logger.info("{}. Market : {} Trade_price: {} ", i, vo.getMarket(), vo.getTrade_price());
        }
        logger.info("-------------------------------------------");
    }
}
