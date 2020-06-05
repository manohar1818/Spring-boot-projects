package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProjApplication.class, args);
		// This is used to create spring container called context
		
		Alien a = context.getBean(Alien.class);
		
		a.toShow();
		
	}

}