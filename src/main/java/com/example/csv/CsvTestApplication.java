package com.example.csv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsvTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsvTestApplication.class, args);
		System.out.print("Server is running on port 8080!");
		
	}

}
