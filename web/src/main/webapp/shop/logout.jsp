<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// out.print 적용했을 때 null로 출력이 될 경우(session) => 연산기호
   HttpSession hs = request.getSession();
   hs.invalidate();
   out.print("<script>"
				+ "alert('로그아웃 되셨습니다.');"
		    + "location.href='./login.jsp';"
				+ "</script>");
   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>