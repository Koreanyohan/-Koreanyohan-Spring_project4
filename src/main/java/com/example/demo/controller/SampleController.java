package com.example.demo.controller;
// 1월 3일 MVC 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/sample") // 중간경로.   :  URL =  ~~/중간경로/마지막경로
public class SampleController {

	
	@GetMapping("/ex1") // 마지막경로      즉, /sample/ex1이라는 요청 오면 ex1에 따른 값 반환
	public String ex1() {
		
		return "/jsp/ex1";  // 화면의 경로 - 즉, jsp중간경로의 ex1을 반환하겠다.
		// ㄴ application.properties파일에 spring.mvc.view.suffix=.jsp 입력했기때문에 확장자 .jsp생략한 것이다.
		
	}	
}

//  localhost:8080/sample/ex1 검색하면  jsp/ex1.jsp 열린다.
