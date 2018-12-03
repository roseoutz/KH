<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="color.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="javascript">
function checkIt(){
	if(document.commentform.commentt.value==""){
		alert("내용을 입력해주세요");
		document.commentform.commentt.focus();
		return false;
	}
	if(document.commentform.commenter.value==""){
		alert("작성자를 입력해주세요");
		document.commentform.commenter.focus();
		return false;
	}
		
	if(document.commentform.passwd.value==""){
		alert("비밀번호를 입력해주세요");
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
font-family:굴림;
src:url();
}
body, td, a, div, p, pre, input, textarea {
font-family:굴림;
font-size:9pt;
}
-->
</style>
</head>
<body bgcolor="${bodyback_c }">
<center><b>글내용 보기</b>
<br>
<form>
<table width="500" border="1" cellpadding="0" cellspacing="0" align="center">
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c }">글번호</td>
		<td align="center" width="125" align="center">${article.num }</td>
		<td align="center" width="125" bgcolor="${value_c }">조회수</td>
		<td align="center" width="125" align="center">${article.readcount }</td>
	</tr>
	<tr height="30">
	<td align="center" width="125" bgcolor="${value_c }">작성자</td>
		<td align="center" width="125" align="center">${article.writer }</td>
		<td align="center" width="125" bgcolor="${value_c }">작성일</td>
		<td align="center" width="125" align="center">${article.reg_date }</td>
	</tr>
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c }">글제목</td>
		<td align="center" width="375" align="center" colspan="3">${article.subject }</td>
	</tr>
	<tr height="30">
		<td align="center" width="125" bgcolor="${value_c }">글내용</td>
		<td align="center" width="375" align="left" colspan="3"><pre>${article.content }</pre></td>
	</tr>
	<tr height="30">
		<td colspan="4" bgcolor="${value_c }" align="right">
		<input type="button" value="글수정" onclick="document.location.href='/mvcboard/mvc/updateForm.do?num=${article.num }&pageNum=${pageNum }'">
		<input type="button" value="글삭제" onclick="document.location.href='/mvcboard/mvc/deleteForm.do?num=${article.num }&pageNum=${pageNum }'">
		<input type="button" value="답글쓰기" onclick="document.location.href='/mvcboard/mvc/writeForm.do?num=${article.num }&ref=${article.ref }&re_step=${article.re_step }&re_level=${article.re_level }'">
		<input type="button" value="글목록" onclick="document.location.href='/mvcboard/mvc/list.do?pageNum=${pageNum}'">
		</td>
	</tr>
</table>
</form>

<form name="commentform" action="/mvcboard/mvc/commentPro.do" method="post">
<table width="500" border="1" cellpadding="0" cellspacing="0" align="center">
	<tr bgcolor=${value_c } align=center>
		<td>코멘트 작성</td>
		<td colspan="2">
		<textarea name="commentt" rows="6" cols="40"></textarea>
		</td>
		<td align="center">작성자<br>
		<input type="text" name="commenter" size="10"><br>
		<input type="hidden" name="num" value="${article.num }">
		비밀번호<br>
		<input type="password" name="passwd" size=10><p>
		<input type="submit" value="코멘트달기">
		</td>
	</tr>
	<tr bgcolor=${value_c } align=center>
		<td>작성자</td>
		<td colspan="2">내용</td>
		<td>작성${count }</td>
	</tr>
	<c:if test="${count==0 }">
	<tr bgcolor=${value_c } align=center>
		<td colspan="4">댓글이 존재하지 않습니다.</td>
	</tr>
	</c:if>
</table>
</form>
</body>
</html>
