<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:bean id="bean" name="test.InfoVO"/>
Struts2 Action

<form method=post action=/Struts2/register.action>
<table border=0 cellpadding=1 cellspacing=1 bgcolor=#22232>
	<tr height=30 bgcolor=#ffffff>
		<td width=100 align=right>이름</td>
		<td widht=300 align=left>
			<input type=text name=bean.name>
		</td>
	</tr>
	<tr height=30 bgcolor=#ffffff>
		<td width=100 align=right>성별</td>
		<td widht=300 align=left>
			<input type=radio name=bean.sex value="F">
			<input type=radio name=bean.sex value="W">
		</td>
	</tr>
	<tr height=30 bgcolor=#ffffff>
		<td width=100 align=right>전화번호</td>
		<td widht=300 align=left>
			<input type=text name=bean.phone>
		</td>
	</tr>
	<tr height=30 bgcolor=#ffffff>
		<td width=100 align=right>생년월</td>
		<td widht=300 align=left>
			<input type=text name=bean.birth>
		</td>
	</tr>
	<tr height=30 bgcolor=#ffffff>
		<td width=100 align=right>개인정보동의</td>
		<td widht=300 align=left>
			<input type=radio name=bean.perdata value="true">
			<input type=radio name=bean.perdata value="false">
		</td>
	</tr>
	<tr>
	<td>
	<input type=submit>
	</td>
	</tr>
</table>

</form>
</body>
</html>