package com.example.myweb_springboot.processor;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskScheduler {
    @Scheduled(cron ="0 25/1 20-21 * * MON" ) //매주 월요일 8시 25분 부터 9시까지 1분간격으로 실행
    public static void task1(){
        Task.doTest();
    }
}
