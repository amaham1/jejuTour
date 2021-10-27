<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge, chrome=1">
    <script type="text/javascript" src="<c:url value='/resources/js/tour/tourInfoWrite.js'/>"></script>
</head>
<body>
    <form id="TourInfoWrite" name="TourInfoWrite" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        <input type="text" name="alltag" id="alltag" /><p>alltag</p>
        <input type="text" name="contentscd" id="contentscd"/><p>contentscd</p>
        <input type="text" name="title" id="title" /><p>title</p>
        <input type="text" name="region1cd" id="region1cd"/><p>region1cd</p>
        <input type="text" name="address" id="address" /><p>address</p>
        <input type="text" name="introduction" id="introduction"/><p>introduction</p>
        <input type="text" name="latitude" id="latitude" /><p>latitude</p>
        <input type="text" name="longitude" id="longitude"/><p>longitude</p>
        <input type="text" name="phoneno" id="phoneno" /><p>phoneno</p>
        <input type="text" name="imgpath" id="imgpath"/><p>imgpath</p>
        <input type="text" name="thumbnailpath" id="thumbnailpath" /><p>thumbnailpath</p>
    </form>
    <button id="save">저장</button>
</body>
</html>
