<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
ex5 List

<table border="1">

	<tr>
		<th>번호</th>
		<th>이름</th>
		<th>내용</th>
		<th>날짜</th>
		<th>조회수</th>
	</tr>
	
	<c:forEach var="item" items="${data }">
	<tr>
		<td><a href="detail.do?id=${item.id}">${item.id }</a></td>
		<td>${item.name }</td>
		<td>${item.contents }</td>
		<td>${item.dt }</td>
		<td>${item.cnt }</td>
		</tr>
	</c:forEach>
	
</table>

</body>
</html>