<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// Controll에서 session을 받은 후 해당 session값을 문자열로 변환하여 HTML에 출력
	HttpSession se = (HttpSession)request.getAttribute("se");
	// String userid = se.getAttribute("id").toString(); toString() 은 에러처리 안 하면 500번 에러 떠부러
	String userid = (String)se.getAttribute("id");
	String usernm = (String)se.getAttribute("name");
	String usertel = (String)se.getAttribute("tel");
	if(userid == null){
		out.print("<script>alert('로그인 하여야만 됩니다');location.href='./login.html'</script>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=usernm%>님 환영합니다.<br>
	아이디 : <%=userid %><br>
	연락처 : <%=usertel %><br>
	<input type="button" value="로그아웃" onclick="logout()">
</body>
<script>
function logout(){
	if(confirm("로그아웃 하시겠습니까?")){
		location.href="./session3.do";
	}
}
</script>
</html>




