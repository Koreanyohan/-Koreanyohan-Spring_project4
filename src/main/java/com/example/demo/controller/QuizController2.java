package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz")
public class QuizController2 {

	@GetMapping("/q2")
	public String q2() {
		return "jsp/QuizController_2";
	}	
	
}
