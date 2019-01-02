<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="semi.member.model.vo.*" %>
<% 
	Member loggedInMember = (Member)session.getAttribute("loggedInMember"); 
%>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>You Can't Escape..</title>
<link href="https://fonts.googleapis.com/css?family=Do+Hyeon" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Amatic+SC" rel="stylesheet">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/common/header.css" />
<script src="<%=request.getContextPath()%>/js/jquery-3.3.1.js"></script>
</head>
<body>
	<header>
		<div id="top">
			<div id="myMenu">
			<%if(loggedInMember == null) {%>
<<<<<<< HEAD
				<a href="#">로그인</a>
=======
				<a href="">LOGIN</a>
>>>>>>> e14b6f57b63cf6d435a42488992e0ab7162cbd69
			<%}else{ %>
				<a href="#">MY PAGE</a>
				<a href="#">LOGOUT</a>
			<%} %>
			</div>
		</div>
		<div id="logo">Escape, if you can.</div>
		<div id="menu">
			<ul>
				<li><a href="">HOME</a></li>
				<li><a href="">NOTICE</a></li>
				<li><a href="">RANKING</a></li>
				<li><a href="">SOLVE</a></li>
				<li><a href="<%=request.getContextPath()%>/board/free/freeBoardList">FREE</a></li>
			</ul>
		</div>
		<div id="game-start">
			<button class="snip1535">ENTER GAME</button>
		</div>
	</header>
