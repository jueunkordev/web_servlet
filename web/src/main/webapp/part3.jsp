<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String mid = (String) request.getAttribute("mid");
String mname = (String) request.getAttribute("mname");
String memail = (String) request.getAttribute("memail");
String mtel = (String) request.getAttribute("mtel");
String image = (String) request.getAttribute("image");
// substring(문자배열 0부터 시작, 문자열 1부터)
// String mtel2 = mtel.substring(3,8);
// length : 원시배열 , length() : 문자열 , size() : 클래스 배열
if(mtel.length() == 11){
	mtel = mtel.substring(0,3) + "****" + mtel.substring(7,11);
}
else if(mtel.length() == 10){
	mtel = mtel.substring(0,3) + "****" + mtel.substring(6,10);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 완료 페이지</title>
</head>
<body>

	<p>회원가입이 완료 되었습니다.</p>
	아이디 :<%=mid%><br> 
	고객명 :<%=mname%><br>
	이메일 :<%=memail%><br>
	휴대폰 번호 :<%=mtel%><br>
	<%
	//엑박 핸들링
	if (image != "") {
	%>
	<img src="./user/<%=image%>" style="width: 100px; height: 100ps;">
	<!-- 이미지 출력 -->
	<%
}
%>
</body>
</html>