<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta name="_csrf_parameter" content="${_csrf.parameterName}" />
        <meta name="_csrf_header" content="${_csrf.headerName}" />
        <meta name="_csrf" content="${_csrf.token}" />
        <script type="text/javascript" src="<c:url value='/resources/js/plugins/jquery-3.5.1.min.js'/>"></script>
        <link rel="stylesheet" href="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.css"/>
        <script src="https://cdn.datatables.net/t/bs-3.3.6/jqc-1.12.0,dt-1.10.11/datatables.min.js"></script>
        <script type="text/javascript" src="<c:url value='//dapi.kakao.com/v2/maps/sdk.js?appkey=73cd49d3c8df14c99e4a9a532f19c52a'/>"></script>

        <title><decorator:title /> 제주조아 </title>
        <decorator:head />
    </head>
    <body>
    <div style="width: 100%">
        <div style="width: 10%; height: 500px; background: red; float: left"></div>

        <div style="width: 80%; height: 500px; float: left">
            <div style="position: relative; width: 100%; background: blue">
                <%@ include file="header.jsp" %>
            </div>

            <div style="position: relative; left: 50%;">
                <%@ include file="sidebar.jsp" %>
            </div>
            <div style="height:100%;">
                <decorator:body />
            </div>
        </div>
        <div style="display:block; width: 10%; height: 500px; background: green; float: left"><p>Test</p></div>
    </div>
    <c:out value="${scripts}" escapeXml="fales" />
    </body>

</html>
