package com.example.myweb_springboot.processor;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskScheduler {
    @Scheduled(cron ="0 25/1 20-21 * * MON" ) //매일 5시부터 6시까지 10분간격으로 실행
    public static void task5(){
        Task.doTest();
    }
}
