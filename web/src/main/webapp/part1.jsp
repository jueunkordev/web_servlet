<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 [약관동의]</title>
</head>
<body>
	<form id="frm" action="./part2.do">
		<p> 회원가입 약관</p>
		<input type="checkbox" id="all" name="checkok" onclick='all_check(this.checked)' />전체선택<br>
		<input type="checkbox" name="agree" value="Y0" onclick="ag_check()" />서비스 이용약관 동의 (필수)<br>
		<input type="checkbox" name="agree" value="Y1" onclick="ag_check()" />개인정보 수집 및 이용 (필수)<br>
		<input type="checkbox" name="agree" value="Y2" onclick="ag_check()" />이메일 정보 수신 약관 (필수)<br>
		<input type="checkbox" name="agree" value="Y3" onclick="ag_check()" />광고성 정보 수신 (선택)<br>
		<input type="button"value="회원가입" onclick="go_page()" /><br>
	</form>
</body>
<script>
function go_page() {
	if(frm.agree[0].checked==true &&frm.agree[1].checked==true &&frm.agree[2].checked==true){
		frm.submit();
	}
	else{
		alert("필수 조건은 무조건 동의하셔야만 회원가입이 진행됩니다.");
	}
}


var all_check = function(z) {
	var ob = frm.agree; // form태그 안에서 agree라는 name 명을 가진 오브젝트 
	var ea = ob.length;
	console.log(ob);
	console.log(ea);
	var w = 0;
	do{
		ob[w].checked = z;
		w++;
	}while(w<ea);
}

var ag_check = function(){ // 하나라도 false일 경우 전체선택을 해제
	var ob = frm.agree;
	var ea = ob.length;
	var w = 0;
	var count = 0; // count 변수 초기화 추가

	while (w < ea) {
		if(ob[w].checked){ // 올바른 조건식으로 수정
			count++;
		}
		w++;
	}
	if(ea == count){
		document.getElementById("all").checked = true;
	}
	else{
		document.getElementById("all").checked = false;
	}
} 
</script>
</html>










