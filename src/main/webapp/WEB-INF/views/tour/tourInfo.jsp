<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge, chrome=1">
<body>
    <div id="map" style="width:500px;height:400px;"></div>
    <script>
        var container = document.getElementById('map');
        var options = {
            center: new kakao.maps.LatLng(33.450701, 126.570667),
            level: 3
        };

        var map = new kakao.maps.Map(container, options);
    </script>

</body>

