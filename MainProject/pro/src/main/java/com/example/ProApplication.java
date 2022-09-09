package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller","com.example","com.example.repository","com.example.service"})
@EnableJpaRepositories(basePackages = { "com.example.repository"})
public class ProApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProApplication.class, args);
	}

}
