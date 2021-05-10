package com.gradmanagement.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.gradmanagement"})
public class GradManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradManagementApplication.class, args);
	}

}


