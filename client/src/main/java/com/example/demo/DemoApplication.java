package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController    
@EnableAutoConfiguration
public class DemoApplication {
    @Value("${content}")
    String content;
    
    @RequestMapping("/")    
    String home() {    
    	return content;
    } 
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
