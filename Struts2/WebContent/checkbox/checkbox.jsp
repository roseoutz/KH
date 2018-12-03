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


<br>
<s:form action="checkbox">
<s:checkbox name="male" value="true" label="남"/>
<s:checkbox name="female" value="true" label="여"/>
<s:submit/>
</s:form>
</body>
</html>