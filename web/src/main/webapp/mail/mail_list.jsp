<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
ArrayList<ArrayList<String>> mail = (ArrayList<ArrayList<String>>)request.getAttribute("result");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보낸 메일함</title>
</head>
<body>
<p>총 메일 갯수 : <%=mail.size() %></p>
<table border="1" cellpadding="0" cellspacing="0">
<thead>
<tr>
<th width="50">번호</th>
<th width="500">받는 사람</th>
<th width="100">받는 사람 이메일</th>
<th width="100">제목</th>
<th width="150">등록일</th>
</thead>
<tbody>
<%
int f;
int total = mail.size();	//리스트 출력번호를 총 데이터 갯수로 처리 (원래 이렇게 안함)
for(f=0; f<mail.size(); f++){
%>
<tr height="30" align="center">
<td><%=total %></td>
<td align="left" ><%=mail.get(f).get(1) %></td>
<td><%=mail.get(f).get(2) %></td>
<td><%=mail.get(f).get(3) %></td>
<td><%=mail.get(f).get(5).substring(0,10)%></td>
</tr>
<%
total--;
//원래 번호 이렇게 안하는데 임시방편 
}
%>
</tbody>


</table>


</body>
<script>
</script>
</html>








