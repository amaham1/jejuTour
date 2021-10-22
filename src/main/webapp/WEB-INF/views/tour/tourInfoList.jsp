<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="UTF-8">
	<script>
		$(document).ready(function () {
			$("#d_table").DataTable();
		});
	</script>
	<title></title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<section>
	<table style="border: 1px solid #ebebeb;">
		<colgroup>
			<col style="width:100px">
			<col>
			<col>
			<col>
			<col>
			<col>
			<col>
		</colgroup>
		<thead>
			<tr>
				<th style="width:100px">Rownum</th>
				<th style="width:100px">관광지</th>
				<th>주소</th>
				<th>소개</th>
				<th>전화번호</th>
				<th>생성 날짜</th>
				<th>업데이트 날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="TourList" items="${tourInfoList}">
				<tr>
					<td>${TourList.ROWNUM}</td>
					<td>${TourList.title}</td>
					<td>${TourList.address}</td>
					<td>${TourList.introduction}</td>
					<td>${TourList.phoneno}</td>
					<td>${TourList.create_dt}</td>
					<td>${TourList.update_dt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</section>

</body>
</html>
