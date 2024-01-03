<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="com.example.demo.repository.MemberRepository" %>  <!-- MemberRepository를 import -->
<%@ page import="com.example.demo.entity.Member" %>		     		<!-- Member 엔티티를 import -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
 <% 
   /*  WebApplicationContext를 가져옵니다. */
    WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(application);
    
	/* 컨텍스트를 통해 MemberRepository 빈을 가져옵니다. */
    MemberRepository repository = ctx.getBean(MemberRepository.class);
	
	/* <!--  요청 메세지에서 사용자가 전달한 파라미터 꺼내기 --> */
		String username = request.getParameter("username");  
		String password = request.getParameter("password");  
		
		/* <!-- 회원 추가  (<- Member 클래스) --> */
		Member member = Member.builder()/*  <!-- .no는 자동입력(auto_increament)라서 생략 --> */
				.userId(username).password(password)
				.build();
		
		Member newMember = repository.save(member); /*  <!-- 위에서 생성한 객체 전달 --> */
		/* <!--  ㄴ member : 등록(save) 전 / newMember : 등록 후
			 -> db에 저장됨 --> */ 
 %>        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>
		<%= newMember.getNo()%> 번 회원을 등록했습니다!
	</p>
</body>
</html>






