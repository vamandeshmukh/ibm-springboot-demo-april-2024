package com.ibm.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	
	LOG 

	public static void main(String[] args) {
		LOG.info("Starting...");
		SpringApplication.run(App.class, args);
		LOG.info("Started.");
	}

}
