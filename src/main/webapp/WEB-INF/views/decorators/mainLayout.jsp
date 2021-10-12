<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html>
    <head>
        <title><decorator:title /> 제주조아 </title>
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
    </body>
</html>
