package com.example.demo_student_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoStudentServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoStudentServiceApplication.class, args);
		System.out.println("Server is running on port: 8100");
	}

}
