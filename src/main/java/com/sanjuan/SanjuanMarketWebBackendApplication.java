package com.sanjuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.sanjuan")
public class SanjuanMarketWebBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SanjuanMarketWebBackendApplication.class, args);
	}
}
