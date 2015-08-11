<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>清单</title>
</head>
<body>
	<a href='<tags:url value="/Book/input"></tags:url>'> 添加数据tags</a>
	<a href='<c:url value="/Book/input"/>'> 添加数据</a>
	<p align="center">
	<fieldset >
		<legend>${action }</legend>
		<table align="center">
			<tr>
				<th>Category</th>
				<th>Isdn</th>
				<th>Author</th>
				<th></th>
			</tr>
			<c:forEach var="book" items="${ books }">
				<tr>
					<td>${ book.category.name }</td>
					<td>${ book.isdn }</td>
					<td>${ book.author }</td>
					<td><a href='<c:url value="/Book/edit/${book.id}" />'>编辑</a></td>
				</tr>
			</c:forEach>

		</table>
	</fieldset>
</body>
</html>