package com.example.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*// 1월 3일
* 사용자에게 회원가입 페이지를 보내주는 '서블릿'
* */


@WebServlet(name="FormServlet", urlPatterns="/servlet/form") //(이름 / url주소)
public class FormServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//응답 메세지 만들기
	resp.setContentType("text/html");	// html타입으로 보낼거라서
	resp.setCharacterEncoding("utf-8"); // 한글 입력할거라 인코딩 타입 utf-8
	
	
	// html 내용 작성
    PrintWriter w = resp.getWriter();
    w.write("<!DOCTYPE html>\n" +
            "<html>\n" +
            "<body>\n" +
            "<form action=\"/servlet/save\" method=\"post\">\n" +
            "    이름: <input type=\"text\" name=\"username\" />\n" +
            "    암호: <input type=\"text\" name=\"password\" />\n" +
            "    <button type=\"submit\">전송</button>\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>\n");
	}	
}










