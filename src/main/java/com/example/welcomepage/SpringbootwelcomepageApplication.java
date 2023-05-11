package com.example.welcomepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringbootwelcomepageApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootwelcomepageApplication.class, args);
		
		System.out.println("my application started running...");
	}

}
