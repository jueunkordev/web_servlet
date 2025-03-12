function ajax_file(){
   var mfile = document.getElementById("mfile");
   if(mfile.value==""){
      alert("파일 첨부를 하셔야 합니다.");
   }else{
      this.ajax_post(mfile);
   }
}

function ajax_post(mfile){
   var http,result;
   var formdata = new FormData(); // form 형태의 태그를 이용하는 방식과 동일
   formdata.append("mfile",mfile.files[0]);
   http = new XMLHttpRequest();
   http.onreadystatechange = function() {
      if (http.readyState == 4 && http.status == 200) {
      console.log(this.response);
      }
   }
      //post전송
   http.open("POST","./ajax_fileok.do", true);
   //http.setRequestHeader("content-type","multipart/form-data") //Formdata함수 사용시 헤더때릴 필요 x
   http.send(formdata);  // Formdata 함수의 값을 send 함수에 인자값으로 적용하여 전송 
}


