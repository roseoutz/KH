<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = (String)request.getAttribute("id");
	String passwd = (String)request.getAttribute("passwd");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
function windowclose(){
	self.close();
}
</script>
</head>
<body>
<table width = "450" height = "35">
	<tr>
		<td align = "left">
		<b>아이디/비밀번호 찾기</b>
		</td></tr>
</table>
<table width = "440">
	<thead>검색된 아이디/비밀번호 입니다.<br><br><br></thead>
	<tr>
		<td align = "left">아이디 : <%=id %></td></tr>
	<tr>
		<td align = "left">비밀번호 : <%=passwd %></td></tr>
</table>

<table width = "450">
	<tr>
		<td align = "center">
			<hr/><br/><input type = "button" value = "닫기" onclick = "windowclose()"/>
		</td>
	</tr>
</table>
</body>
</html>