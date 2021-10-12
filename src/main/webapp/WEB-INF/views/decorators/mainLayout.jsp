<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript" src="<c:url value='/resources/js/plugins/jquery-3.5.1.min.js'/>"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/plugins/datatables.min.js"></script>
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
            <div style="width:200px; height:100%;">
                <decorator:body />
            </div>
        </div>
        <div style="display:block; width: 10%; height: 500px; background: green; float: left"><p>Test</p></div>
    </div>
    <c:out value="${scripts}" escapeXml="fales" />
    </body>

</html>
