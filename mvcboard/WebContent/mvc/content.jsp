<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="color.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="javascript">
function checkIt(){
	if(document.commentform.commentt.value==""){
		alert("������ �Է����ּ���");
		document.commentform.commentt.focus();
		return false;
	}
	if(document.commentform.commenter.value==""){
		alert("�ۼ��ڸ� �Է����ּ���");
		document.commentform.commenter.focus();
		return false;
	}
		
	if(document.commentform.passwd.value==""){
		alert("��й�ȣ�� �Է����ּ���");
		document.commentform.passwd.focus();
		return false;
	}
}
</script>
<style type='text/css'>
<!--
a:link {
	color:black;
	text-decoration:none;
}
a:visited {
	text-decoreation:underline;
}
a:active {
	text-decroration:underline;
	background-image:url('text_dottdeline.gif');
	background-repeat:repeat-x;
	background-position:50% 100%;
}
-->
</style>
<style>
<!--
@font-face {
font-family:����;
src:url();
}
body, td, a, div, p, pre, input, textarea {
font-family:����;
font-size:9pt;
}
-->
</style>
</head>
<body bgcolor="${bodyback_c }">
<center><b>�۳��� ����</b>
<br>
<form>
<table width="500" border="1" cellpadding="0" cellspacing="0" align="center">
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c }">�۹�ȣ</td>
		<td align="center" width="125" align="center">${article.num }</td>
		<td align="center" width="125" bgcolor="${value_c }">��ȸ��</td>
		<td align="center" width="125" align="center">${article.readcount }</td>
	</tr>
	<tr height="30">
	<td align="center" width="125" bgcolor="${value_c }">�ۼ���</td>
		<td align="center" width="125" align="center">${article.writer }</td>
		<td align="center" width="125" bgcolor="${value_c }">�ۼ���</td>
		<td align="center" width="125" align="center">${article.reg_date }</td>
	</tr>
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c }">������</td>
		<td align="center" width="375" align="center" colspan="3">${article.subject }</td>
	</tr>
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c }">�۳���</td>
		<td align="center" width="375" align="left" colspan="3"><pre>${article.content }</pre></td>
	</tr>
	<tr height="30">
		<td colspan="4" bgcolor="${value_c }" align="right">
		<input type="button" value="�ۼ���" onclick="document.location.href='/mvcboard/mvc/updateForm.do?num=${article.num }&pageNum=${pageNum }'">
		<input type="button" value="�ۻ���" onclick="document.location.href='/mvcboard/mvc/deleteForm.do?num=${article.num }&pageNum=${pageNum }'">
		<input type="button" value="��۾���" onclick="document.location.href='/mvcboard/mvc/writeForm.do?num=${article.num }&ref=${article.ref }&re_step=${article.re_step }&re_level=${article.re_level }'">
		<input type="button" value="�۸��" onclick="document.location.href='/mvcboard/mvc/list.do?pageNum=${pageNum}'">
		</td>
	</tr>
</table>
</form>

<form name="commentform" action="/mvcboard/mvc/commentPro.do" method="post">
<table width="500" border="1" cellpadding="0" cellspacing="0" align="center">
	<tr bgcolor=${value_c } align=center>
		<td>�ڸ�Ʈ �ۼ�</td>
		<td colspan="2">
		<textarea name="commentt" rows="6" cols="40"></textarea>
		</td>
		<td align="center">�ۼ���<br>
		<input type="text" name="commenter" size="10"><br>
		<input type="hidden" name="num" value="${article.num }">
		��й�ȣ<br>
		<input type="password" name="passwd" size=10><p>
		<input type="submit" value="�ڸ�Ʈ�ޱ�">
		</td>
	</tr>
	<tr bgcolor=${value_c } align=center>
		<td>�ۼ���</td>
		<td colspan="2">����</td>
		<td>�ۼ�${count }</td>
	</tr>
	<c:if test="${count==0 }">
	<tr bgcolor=${value_c } align=center>
		<td colspan="4">����� �������� �ʽ��ϴ�.</td>
	</tr>
	</c:if>
</table>
</form>
</body>
</html>
