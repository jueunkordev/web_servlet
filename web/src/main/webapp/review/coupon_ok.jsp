<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String) request.getAttribute("id");
	String coupon_n = (String) request.getAttribute("coupon_n");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠폰 등록 완료 페이지</title>
</head>
<body>
	<p4>쿠폰 등록 완료</p4><br>
	아이디 : <%=id%><br>
	쿠폰번호 : <%=coupon_n%><br>
	광고 수신 동의함
</body>
</html>