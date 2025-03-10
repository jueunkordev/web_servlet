<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 내용확인</title>
<style>
.data1{
	width:400px;
	height:30px;
	line-height:30px;
	border-bottom: 1px solid gray;
	display: inline-block;
}
.n{
	display:flex;
	flex-direction: row;
	justify-content: flex-start;
	align-content: center;
}
.data2{
	border:1px solid gray;
	width:800px;
	height:400px;
	overflow-y:auto; 
}
</style>
</head>
<body>
	<div class="n">등록일 : <span class="data1"></span></div><br>
	<div class="n">제목 : <span class="data1"></span></div><br>
	<div class="n">글쓴이 : <span class="data1"></span></div><br>
	<div class="n">조회수 : <span class="data1"></span></div><br>
	<div class="n">내용 : <div class="data2"></div></div><br>
	<div class="n">첨부파일 : <span class="data1"></span></div><br>
	<input type="button" value="글목록" onclick="notice_info(1)">
	<input type="button" value="글수정" onclick="notice_info(2)">
	<input type="button" value="글삭제" onclick="notice_info(3)">
</body>
<script>
function notice_info(p) {
	switch (p) {
	case 1:
		location.href='./notice_list.do';
		break;
	case 2:
		location.href='./notice_modify.do';
	case 3:
		if(confirm("해당 게시물을 삭제 시 복구되지 않습니다."))
		location.href='./notice_delete.do';
	default:
		break;
	}
}
</script>
</html>




