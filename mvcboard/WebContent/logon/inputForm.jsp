<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="color.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>회원가입</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var fullAddr = ''; // 최종 주소 변수
                var extraAddr = ''; // 조합형 주소 변수

                // 사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    fullAddr = data.roadAddress;

                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    fullAddr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 조합한다.
                if(data.userSelectedType === 'R'){
                    //법정동명이 있을 경우 추가한다.
                    if(data.bname !== ''){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있을 경우 추가한다.
                    if(data.buildingName !== ''){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 조합형주소의 유무에 따라 양쪽에 괄호를 추가하여 최종 주소를 만든다.
                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('zipcode').value = data.zonecode; //5자리 새우편번호 사용
                document.getElementById('address1').value = fullAddr;

                // 커서를 상세주소 필드로 이동한다.
                document.getElementById('address2').focus();
            }
        }).open();
    }
</script>
<script language="javascript">
function checkIt() {
    var userinput = eval("document.userinput");
    if(!userinput.id.value) {
        alert("ID를 입력하세요");
        return false;
    }
    
    if(!userinput.passwd.value ) {
        alert("비밀번호를 입력하세요");
        return false;
    }
    if(userinput.passwd.value != userinput.passwd2.value)
    {
        alert("비밀번호를 동일하게 입력하세요");
        return false;
    }
   
    if(!userinput.username.value) {
        alert("사용자 이름을 입력하세요");
        return false;
    }
    if(!userinput.jumin1.value  || !userinput.jumin2.value )
    {
        alert("주민등록번호를 입력하세요");
        return false;
    }
}   
function openConfirmid(userinput) {
	if (userinput.id.value == "") {
		alert("아이디를 입력하세요");
		return;
	}
	url = "/mvcboard/logon/confirmId.do?id=" + userinput.id.value ;
	open(url, "confirm", "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=550, height=200");
    }
</script>
</head>
<body bgcolor="${bodyback_c }">

<form method="post" action="/mvcboard/logon/inputPro.do" name="userinput" onsubmit="return checkIt()">
<table width="600" border="1" cellspacing="0" cellpadding="3" align="center">
	<tr>
		<td colspan="2" height="39" align="center" bgcolor="${value_c } ">
		<font size="+1"><b>회원가입</b></font>
		</td>
	</tr>
	<tr>
		<td width="200" bgcolor="${value_c }"><b>아이디 입력</b></td>
		<td width="400" bgcolor="${value_c }">&nbsp;</td>
	</tr>
	<tr>
		<td width="200">사용자</td>
		<td width="400">
		<input type="text" name="id" size="10" maxlength="12">
		<input type="button" name="confirm_id" value="ID중복확인" OnClick="openConfirmid(this.form)">
		</td>
	</tr>
	<tr>
		<td width="200">비밀번호</td>
		<td width="400">
		<input type="password" name="passwd" size="15" maxlength="12">
		</td>
	</tr>
	<tr>
		<td width="200">비밀번호 확인</td>
		<td width="400">
		<input type="password" name="passwd2" size="15" maxlength="12">
		</td>
	</tr>
	
	<tr>
		<td width="200" bgcolor="${value_c }"><b>개인정보 입력</b></td>
		<td width="400" bgcolor="${value_c }">&nbsp;</td>
	</tr>
	<tr>
		<td width="200">사용자이름</td>
		<td width="400">
			<input type="text" name="name" size="15" maxlength="10">
		</td>
	</tr>
	<tr>
		<td width="200">주민등록번호</td>
		<td width="400">
		<input type="text" name="jumin1" size="7" maxlength="6">
		<input type="text" name="jumin2" size="7" maxlength="7">
		</td>
	</tr>
	<tr>
		<td width="200">주소</td>
		<td width="400">
		<input type="text" id="zipcode" name="zipcode" placeholder="우편번호">
		<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
		<input type="text" id="address1" name="address1" placeholder="주소">
		<input type="text" id="address2" name="address2" placeholder="상세주소">
	</tr>
	<tr>
		<td width="200">Email</td>
		<td width="400">
		<input type="text" name="email" size="40" maxlength="30">
	</tr>
	<tr>
		<td width="200">Blog</td>
		<td width="400">
		<input type="text" name="blog" size="60" maxlength="50">
	</tr>
	<tr>
		<td colspan="2" align="center" bgcolor="${value_c }">
		<input type="submit" name="confirm" value="등   록" >
        <input type="reset" name="reset" value="다시입력">
        <input type="button" value="가입안함" onclick="document.location.href='/mvcboard/logon/main.do'">
        </td>
	</tr>
</table>
</form>
</body>
</html>