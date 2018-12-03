<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
   
<!DOCTYPE html>
<html>
	<head>
		<title>Generic Page - Industrious by TEMPLATED</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="is-preload">
		<header id="header">
			<tiles:insertAttribute name="menu"/>
			<tiles:insertAttribute name="heading"/>
		</header>
			<tiles:insertAttribute name="main"/>
			<tiles:insertAttribute name="footer"/>
			
				<!-- Scripts -->		
	</body>	
</html>