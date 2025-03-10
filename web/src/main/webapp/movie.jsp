<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% 
    String cname = (String)request.getAttribute("cname");
	String ctel = (String)request.getAttribute("ctel"); 
	String cmovie = (String)request.getAttribute("cmovie"); 
	String cday = (String)request.getAttribute("cday"); 
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>예매 결과</title>
</head>
<body>
    <h4>예매 완료</h4>
    <p>고객명: <%= cname %></p>
    <p>연락처: <%= ctel %></p>
    <p>선택 영화: <%= cmovie %></p>
    <p>예매 날짜: <%= cday %></p>
    <input type="button" value="확인" onclick="go()">
    <br>
</body>
<script>
function go() {
	//history.go(-2);
}
</script>
</html>








