package com.example.promoservice.start;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@Slf4j
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.example.promoservice"})
public class PromoServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(PromoServiceApp.class, args);
	}

}
