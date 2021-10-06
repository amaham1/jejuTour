<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>

<html>
<head>
    <title><decorator:title /> | 춘천시 City of ChunCheon</title>

</head>
<body>
<div id="wrap">
    <%@ include file="header.jsp" %>
    <%@ include file="sidebar.jsp" %>
    <div style="width:500px;min-height:500px;padding:61px 25px 22px 275px;">
        <decorator:body />
    </div>

</div>




</body>
</html>
