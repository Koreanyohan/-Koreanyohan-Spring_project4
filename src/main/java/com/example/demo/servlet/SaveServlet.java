// 1월 3일
package com.example.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Member;
import com.example.demo.repository.MemberRepository;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 새로운 회원을 등록하는 서블릿
@WebServlet(name="SaveServlet", urlPatterns = "/servlet/save") // name은 다른 @webservlet 어노테이션에 등록된 name=""값이랑 중복 되면 안됨.
public class SaveServlet extends HttpServlet {

	@Autowired
	MemberRepository repository;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 요청 메세지에서 사용자가 전달한 파라미터 꺼내기
		String username = req.getParameter("username");  // FormServlet클래스 39행 보면 이름 :~ username
		String password = req.getParameter("password");  // FormServlet클래스 40행 보면 이름 :~ password
		
		//회원 추가  (<- Member 클래스)
		Member member = Member.builder() // .no는 자동입력(auto_increament)라서 생략
				.userId(username).password(password)
				.build();
		
		Member newMember = repository.save(member); // 위에서 생성한 객체 전달
		// ㄴ member : 등록(save) 전 / newMember : 등록 후
		// -> db에 저장됨
		
		// 응답 메세지 만들기
		resp.setContentType("text/html"); // 처리결과 html로 만들어서 보내기
		resp.setCharacterEncoding("utf-8");
		
		
		// html 내용 작성
        PrintWriter w = resp.getWriter();
        
        w.write("<html>\n" +
                "<body>\n" +
                newMember.getNo() + "번 회원을 등록 했습니다!\n" +
                "</body>\n" +
                "</html>");
        // 화면에 3번 회원을 등록했습니다 나옴
	}	
}

















