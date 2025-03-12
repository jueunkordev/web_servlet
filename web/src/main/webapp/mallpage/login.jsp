<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Shop Bag</title>
	    <meta charset="utf-8" />
	    <link href="./index.css" rel="stylesheet" />
	    <link href="./menu.css?v=1" rel="stylesheet"/>
	    <link href="./index.css" rel="stylesheet" />
    	<link href="./subpage.css" rel="stylesheet" />
	</head>
<body>
	<!-- 상단 로고, 메뉴 -->
		<%@ include file="./top.jsp" %> <%-- jsp 주석 --%>
	<!-- 상단 로고, 메뉴 -->
	<main>
		<%@ include file="./login_view.jsp" %>
	</main>
	<!-- copyright 및 푸터 -->
	<footer>
	    <%@ include file="./footer.jsp" %>
	</footer>
	<!-- copyright 및 푸터 -->
</body>
</html>