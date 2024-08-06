package com.example.location;

import com.example.person.repository.EnableEurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class LocationApplication {
	public static void main(String[] args) {
		SpringApplication.run(LocationApplication.class, args);
	}
}