<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="color.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>ID�ߺ�Ȯ��</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="${bodyback_c }">
<c:if test="${check==1 }">
<table width="270" border="0" cellspacing="0" cellpadding="5">
	<tr bgcolor="${title_c }">
		<td height="39">${id }�� �̹� ������� ���̵� �Դϴ�.</td>
	</tr>
</table>
<form name="checkForm" method="post" action="/mvcboard/logon/confirmId.do">
<table width="270" border="0" cellspacing="0" cellpadding="5">
	<tr>
		<td bgcolor="${value_c }" align="center">
		�ٸ� ���̵� �Է����ּ���<p>
		<input type="text" size="10" maxlength="12" name="id">
		<input type="submit" value="id�ߺ�Ȯ��">
		</p>
	</td>
</table>
</form>
</c:if>
<c:if test="${check == -1}"> 
<table width="270" border="0" cellspacing="0" cellpadding="5">
  <tr bgcolor="${title_c}"> 
    <td align="center"> 
      <p>�Է��Ͻ� ${id} �� ����Ͻ� �� �ִ� ID�Դϴ�. </p>
      <input type="button" value="�ݱ�" onclick="setid()">
    </td>
  </tr>
</table>
</c:if>
</body>
</html>
<script language="javascript">
<!--
  function setid()
    {		
    	opener.document.userinput.id.value="${id}";
	self.close();
   }
-->
</script>
