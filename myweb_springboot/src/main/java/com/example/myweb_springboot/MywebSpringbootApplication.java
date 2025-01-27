package com.example.myweb_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MywebSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebSpringbootApplication.class, args);
	}

}
