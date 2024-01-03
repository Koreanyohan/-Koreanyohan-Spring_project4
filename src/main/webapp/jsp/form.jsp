<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<form action="/jsp/save.jsp" method="post"> <!-- action="주소 url" method="삭제추가 등등" -->     

		이름 : <input type="text" name="username"/>    <!-- 입력필드1 -->
		암호 : <input type="text" name="password"/>    <!-- 입력필드2 -->
	
		<button type="submit"> 전송 </button>      <!-- submit은 form태그와 짝궁 -->
	</form>

</body>
</html>
