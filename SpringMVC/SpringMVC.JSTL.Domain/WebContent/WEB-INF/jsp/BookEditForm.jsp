<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>${action }</legend>
		<form:form commandName="book"
			action="/SpringMVC.JSTL.Domain/Book/update" method="post">

			<p>
				<label for="category">Category:</label>
				<form:select id="category" items="${categories}" path="category.id"
					itemLabel="name" itemValue="id"></form:select>
			</p>
			<p>
				<label for="isdn">Isdn:</label>
				<form:input path="isdn" id="isdn" />
			</p>
			<p>
				<label for="author">Author:</label>
				<form:input path="author" id="author" />
			</p>
			<p>
				<label for="id">Id:</label>
				<form:input path="id" id="id" readonly="true" />
			</p>
			<p id="buttons">
				<button id="reset" type="reset">重置</button>
				<button id="submit" type="submit">提交</button>
			</p>

		</form:form>

	</fieldset>
</body>
</html>