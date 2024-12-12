package com.springservice.first_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@RestController
	class HelloController {

		@GetMapping("/")
		public String hello() {
			String message = System.getenv("MESSAGE");
			if (message == null || message.isEmpty()) {
				message = "Hello, Spring Boot!";
			}
			return message;
		}
	}
}
