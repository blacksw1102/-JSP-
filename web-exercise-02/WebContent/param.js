function check() {
	if(document.frm.name.value == "") {
		alert("이름을 입력해주세요.");
		document.frm.name.focus();
		return false;
	} else if(document.frm.regnum1.value == "" || document.frm.regnum2.value == "") {
		alert("주민등록번호를 입력해주세요.");
		document.frm.name.regnum1.focus();
		return false;
	} else if(document.frm.id.value == "") {
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	} else if(document.frm.pwd.value == "") {
		alert("비밀번호를 입력해주세요.");
		document.frm.pwd.focus();
		return false;
	}  else if(isNaN(Number(document.frm.pwd.value))) {
		alert("비밀번호를 숫자로 입력해주세요.");
		document.frm.pwd.focus();
		return false;
	} else if(document.frm.pwdConfirm.value == "") {
		alert("비밀번호 확인을 입력해주세요.");
		document.frm.pwdConfirm.focus();
		return false;
	}  else if(isNaN(Number(document.frm.pwdConfirm.value))) {
		alert("비밀번호 확인을 숫자로 입력해주세요.");
		document.frm.pwdConfirm.focus();
		return false;
	} else if(document.frm.pwd.value != document.frm.pwdConfirm.value) {
		alert("비밀번호와 비밀번호 확인이 일치하지 않습니다.");
		document.frm.pwdConfirm.focus();
		return false;
	} else if(document.frm.email1.value == "" || document.frm.email2.value == "") {
		alert("이메일을 입력해주세요.");
		document.frm.email1.focus();
		return false;
	} else if(document.frm.addrnum.value == "") {
		alert("우편번호를 입력해주세요.");
		document.frm.addrnum.focus();
		return false;
	} else if(document.frm.addr1.value == "" || document.frm.addr2.value == "") {
		alert("주소를 입력해주세요.");
		document.frm.addr1.focus();
		return false;
	} else if(document.frm.tel.value == "") {
		alert("핸드폰번호를 입력해주세요.");
		document.frm.tel.focus();
		return false;
	} else if(document.frm.job.value == "") {
		alert("직업을 선택해주세요.");
		document.frm.job.focus();
		return false;
	} else if(document.frm.chk_email[0].checked == false && document.frm.chk_email[1].checked == false) {
		alert("메일/SMS 정보 수신를 선택해주세요.");
		return false;
	} else
		return true;
}