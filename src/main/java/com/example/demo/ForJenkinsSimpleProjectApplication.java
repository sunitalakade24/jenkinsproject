package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForJenkinsSimpleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForJenkinsSimpleProjectApplication.class, args);
	   System.out.println("Jenkins Deployment Success");
	
	}

}
