package com.batesdotgov.springng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringNgApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringNgApplication.class, args);
	}
}
