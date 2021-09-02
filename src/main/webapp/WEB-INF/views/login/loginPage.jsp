<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge, chrome=1">
    <title>로그인쓰</title>
    <script type="text/javascript" src="<c:url value='/resources/js/plugins/jquery-3.5.1.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/loginpage.js'/>"></script>
</head>
<body>
<form id="loginForm" name="loginForm" method="post">
    <p>아아디: </p><input type="text" name="id" id="id" placeholder="아이디">
    <p>비밀번호: </p><input type="text" name="pwd" id="pwd" placeholder="비밀번호">
    <label for="userLogin">사용자</label><input type="radio" name="login_type" id="userLogin" value="userLogin">
    <label for="adminLogin">관리자</label><input type="radio" name="login_type" id="adminLogin" value="adminLogin" checked>
</form>
<button id="loginButton">
    로그인
</button>
<button id="moveRegisterPage">회원가입</button>
</body>
</html>
