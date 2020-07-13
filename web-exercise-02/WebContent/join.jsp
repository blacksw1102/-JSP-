<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="param.js"></script>
</head>
<body>
<form name="frm" method="get" action="JoinServlet">
<table>
	<tr>
		<td>이름</td>
		<td>
			<label for="name"></label>
			<input type="text" id="name" name="name" value="성윤정">
		</td>
	</tr>
	<tr>
		<td>주민등록번호</td>
		<td>
			<input type="text" name="regnum1" value="890719">
			<input type="text" name="regnum2" value="1234567">
		</td>
	</tr>
	<tr>
		<td>아이디</td>
		<td>
			<input type="text" name="id" value="parksung">
		</td>
	</tr>
	<tr>
		<td>비밀번호</td>
		<td>
			<input type="password" name="pwd" value="1234">
		</td>
	</tr>
	<tr>
		<td>비밀번호 확인</td>
		<td>
			<input type="password" name="pwdConfirm" value="1234">
		</td>
	</tr>
	<tr>
		<td>이메일</td>
		<td>
			<input type="text" name="email1" value="parksung"> @
			<input type="text" name="email2" value="nate.com">
			<select name="email3">
				<option value="nate.com">nate.com</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>우편번호</td>
		<td>
			<input type="text" name="addrnum" value="321-212">
		</td>
	</tr>
	<tr>
		<td>주소</td>
		<td>
			<input type="text" name="addr1" value="서울시 송파구 잠실2동"> &nbsp;
			<input type="text" name="addr2" value="OO 아파트 OO동 OO호">
		</td>
	</tr>
	<tr>
		<td>핸드폰번호</td>
		<td>
			<input type="text" name="tel" value="010-1234-1234">
		</td>
	</tr>
	<tr>
		<td>직업</td>
		<td>
			<select name="job">
				<option value="">--직업을 선택하세요--</option>
				<option value="학생" selected>학생</option>
				<option value="컴퓨터인터넷">컴퓨터인터넷</option>
				<option value="언론">언론</option>
				<option value="공무원">공무원</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>메일/SMS 정보 수신</td>
		<td>
			<input type="radio" name="chk_email" value="yes" checked> 수신
			<input type="radio" name="chk_email" value="no"> 수신거부
		</td>
	</tr>
	<tr>
		<td>관심분야</td>
		<td>
			<input type="checkbox" name="interest" value="생두"> 생두
			<input type="checkbox" name="interest" value="원두"> 원두
			<input type="checkbox" name="interest" value="로스팅"> 로스팅
			<input type="checkbox" name="interest" value="핸드드립"> 핸드드립
			<input type="checkbox" name="interest" value="에스프레소"> 에스프레소
			<input type="checkbox" name="interest" value="창업"> 창업
		</td>
	</tr>
	<tr>
		<td colspan="2" style="text-align:center;padding-top:20px;">
			<input type="submit" value="회원가입" onclick="return check()">
			<input type="reset" value="취소">
		</td>
	</tr>
</table>
</form>
</body>
</html>