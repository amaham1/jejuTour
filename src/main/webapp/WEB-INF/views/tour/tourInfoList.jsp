<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>
	Hello world!  
</h1>
<section>
	<table border="1">
		<colgroup>
			<col style="width:55px">
			<col>
		</colgroup>
		<thead>
			<tr>
				<th>Rownum</th>
				<th>Tour name</th>
				<th>Create dt</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="TourList" items="${tourInfoList}">
				<tr>
					<td>${TourList.ROWNUM}</td>
					<td>${TourList.tour_place_name}</td>
					<td>${TourList.create_dt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</section>


</body>
</html>
