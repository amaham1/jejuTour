<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
	<meta charset="UTF-8">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/tour/tourInfoList.js"></script>
	<title></title>
</head>
<body>
	<h1>
		Hello world!
	</h1>
	<section>
		<table style="border: 1px solid #ebebeb;" id="d_table">

			<colgroup>
				<col>
				<col>
				<col>
				<col>
				<col>
				<col>
				<col>
			</colgroup>
			<thead>
				<tr>
					<th>Rownum</th>
					<th>관광지</th>
					<th>주소</th>
					<th>소개</th>
					<th>전화번호</th>
					<th>생성 날짜</th>
					<th>업데이트 날짜</th>
				</tr>
			</thead>
			<tbody>
			<%-- JS 안타고 바로 이용할때
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
			--%>
			</tbody>
		</table>
		<button type="button" id="bbbtt">클릭22</button>
	</section>
</body>
</html>
