// 게시물 등록 시 체크하는 함수
function mailok(){
	if(frm.to_name.value==""){
		alert("담당자 성함을 입력하셔야 합니다.");
		frm.submit.focus();
	}
	else if(frm.to_mail.value==""){
		alert("회신받을 메일주소를 입력하셔야 합니다.");
		frm.writer.focus();
	}
	else if(frm.subject.value==""){
		alert("제목을] 입력하셔야 합니다.");
		frm.pw.focus();
	}
	else if(frm.content.value==""){
		alert("내용을 입력하셔야 합니다.");
		frm.pw.focus();
	}
	else{
		frm.submit();
	}
}