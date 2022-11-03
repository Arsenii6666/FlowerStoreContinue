package com.Flower_store.Lab_7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Lab7Application {
	public static void main(String[] args) {
		String s="sdf";
		SpringApplication.run(Lab7Application.class, s);
	}
}
