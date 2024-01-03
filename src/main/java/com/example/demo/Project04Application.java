package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//서블릿 자동등록
@ServletComponentScan

@SpringBootApplication
public class Project04Application {

	public static void main(String[] args) {
		SpringApplication.run(Project04Application.class, args);
	}

}
