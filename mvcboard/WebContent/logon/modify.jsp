<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="color.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title> 정보 수정 </title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="${bodyback_c }">
<table width="500" cellpadding="0" cellspacing="0" align="center">
	<tr>
		<td>
		<form name="myform" action="/mvcboard/logon/modifyForm.do" method="post">
		<input type="hidden" name="id" value="${sessionScope.memId }">
		<input type="submit" value="회원정보 수정">
		</form>
		</td>
		<td>
		<form name="myform" action="/mvcboard/logon/deleteForm.do" method="post">
		<input type="hidden" name="id" value="${sessionScope.memId }">
		<input type="submit" value="회원 탈퇴">
		</form>
		</td>
		<td>
		<form name="mtform" action="/mvcboard/logon/main.do" method="post">
		<input type="submit" value="메인으로">
		</form>
		</td>
	</tr>
</table>
</body>
</html>