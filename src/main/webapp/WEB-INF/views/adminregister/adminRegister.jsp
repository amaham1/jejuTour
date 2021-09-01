<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge, chrome=1">
    <title>환영쓰</title>
    <script type="text/javascript" src="<c:url value='/resources/js/plugins/jquery-3.5.1.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/adminRegister.js'/>"></script>
</head>
<body>
    <input type="hidden" name="adminIdDupleCheckFlag" id="adminIdDupleCheckFlag" value="">
    <form id="adminRegisterForm" name="adminRegisterForm" method="post">
        <input type="text" name="admin_id" id="admin_id" placeholder="아이디"> <button type="button" id="adminIdDupleCheck" >중복확인</button>
        <input type="text" name="admin_name" id="admin_name" placeholder="이름">
        <input type="text" name="admin_pwd" id="admin_pwd" placeholder="비밀번호">
    </form>
    <button id="adminRegister">
        가입하기
    </button>
</body>
</html>
