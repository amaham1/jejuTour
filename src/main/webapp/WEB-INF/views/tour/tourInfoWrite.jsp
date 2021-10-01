<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge, chrome=1">
    <title>TourInfoWrite</title>
    <script type="text/javascript" src="<c:url value='/resources/js/plugins/jquery-3.5.1.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/tourInfoWrite.js'/>"></script>
</head>
<body>
    <form id="TourInfoWrite" name="TourInfoWrite" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="text" name="tour_place_name" id="tour_place_name" />
        <input type="text" name="tour_place_explanation" id="tour_place_explanation"/>

    </form>
    <button id="save">저장</button>
</body>
</html>
