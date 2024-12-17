<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	ul li {list-style: none;}
</style>
</head>
<body>
	<h2>오늘의 TOP 상한가 종목</h2>
	<table>
		<tbody>
			<tr>
				<th>순위</th>
				<th>종목명</th>
				<th>현재가</th>
				<th>전일비</th>
				<th>등락률</th>
				<th>거래량</th>
				<th>시가</th>
				<th>고가</th>
				<th>저가</th>
			</tr>
			<c:forEach var="stock" items="${crawlerList}">
			<tr>
				<th><img src="${stock.stockRank}" alt=""></th>
				<th>${stock.stockName}</th>
				<th>${stock.stockPrice}</th>
				<th>${stock.stockPrevPrice}</th>
				<th>${stock.fluctuationRate}</th>
				<th>${stock.tradingVolume}</th>
				<th>${stock.stockOpen}</th>
				<th>${stock.stockHigh}</th>
				<th>${stock.stockLow}</th>
				<th>${stock.stockDay}</th>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>