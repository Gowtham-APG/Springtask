package com.example.taskdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TaskdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(TaskdemoApplication.class, args);
	}
}

