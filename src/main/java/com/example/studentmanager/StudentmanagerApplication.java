package com.example.studentmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  
public class StudentmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagerApplication.class, args);
	}

	// BÀI 1: HELLO API
	@GetMapping("/hello")
	public String hello() {
		return "Hello Spring Boot API";
	}
}
