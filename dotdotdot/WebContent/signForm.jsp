<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Board</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="assets/css/main.css" />
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<a class="logo" href="index.html">Board</a>
				<nav>
					<a href="#menu">Menu</a>
				</nav>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="index.html">Home</a></li>
					<li><a href="elements.html">Elements</a></li>
					<li><a href="generic.html">Generic</a></li>
				</ul>
			</nav>

		<!-- Heading -->
			<div id="heading" >
				<h1>Generic Page</h1>
			</div>

		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<div class="content">
						<header>
							<h2>SingUp</h2>
						</header>
						<p>회원가입</p>
						<div class="table">
							<table width="250">
							<tr>
								<td width="100">ID</td>
								<td><input type="text" name="name" id="name" value="" placeholder="Name" /></td>
								<td colspan="4"><a href="#" class="button small">중복 확인</a></td>
							</tr>
							<tr>
								<td>PASSWORD</td>
								<td colspan="2"><input type="text" name="name" id="name" value="" placeholder="Name" /></td>
								<td>2PASSWORD</td>
								<td colspan="2"><input type="text" name="name" id="name" value="" placeholder="Name" /></td>
							</tr>
							<tr>
								<td>EMAIL</td>
								<td><input type="text" name="name" id="name" value="" placeholder="Name" /></td>
								<td colspan="2">
								<select name="emailoption">
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="direct">5</option>
								</select>
								<td colspan="2">
								<input type="text" id="name" value="" placeholder="Name">
								</td>		
							</tr>
							<tr>
								<td width="100">Tel No</td>
								<td><input type="text" name="name" id="name" value="" placeholder="Name" /></td>
								<td colspan="4"><a href="#" class="button small">중복 확인</a></td>
							</tr>
							<tr>
								<td colspan="6" align="center">
								<input type="submit" class="button">&nbsp;&nbsp;&nbsp;
								<input type="reset" class="button" value="다시작성">&nbsp;&nbsp;&nbsp;
								<input type="button" class="button" value="취소" onclick="#">
								</td>
							</tr>
							</table>
						</div>
					</div>
				</div>
			</section>

		<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<div class="content">
						<section>
							<h3>Accumsan montes viverra</h3>
							<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus ornare mi ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien lorem accumsan varius montes viverra nibh in adipiscing. Lorem ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia ante nunc ac gravida.</p>
						</section>
						<section>
							<h4>Sem turpis amet semper</h4>
							<ul class="alt">
								<li><a href="#">Dolor pulvinar sed etiam.</a></li>
								<li><a href="#">Etiam vel lorem sed amet.</a></li>
								<li><a href="#">Felis enim feugiat viverra.</a></li>
								<li><a href="#">Dolor pulvinar magna etiam.</a></li>
							</ul>
						</section>
						<section>
							<h4>Magna sed ipsum</h4>
							<ul class="plain">
								<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
								<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
								<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
								<li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
							</ul>
						</section>
					</div>
					<div class="copyright">
						&copy; Untitled. Photos <a href="https://unsplash.co">Unsplash</a>, Video <a href="https://coverr.co">Coverr</a>.
					</div>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

	</body>
</html>