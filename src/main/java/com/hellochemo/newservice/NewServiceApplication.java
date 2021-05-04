package com.hellochemo.newservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hellochemo"})
public class NewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewServiceApplication.class, args);
	}

}

