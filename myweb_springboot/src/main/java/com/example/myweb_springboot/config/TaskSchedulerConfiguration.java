package com.example.myweb_springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

@Configuration
@EnableScheduling
public class TaskSchedulerConfiguration implements SchedulingConfigurer {
    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        ThreadPoolTaskScheduler threadPool = new ThreadPoolTaskScheduler();

        int n = Runtime.getRuntime().availableProcessors(); // core 갯수
        threadPool.setPoolSize(n + 1); // 쓰레드 풀 갯수 설정
        threadPool.initialize(); // 쓰레드 풀 초기화

        taskRegistrar.setTaskScheduler(threadPool); // 스케줄러에서 쓰레드풀 사용
    }
}
