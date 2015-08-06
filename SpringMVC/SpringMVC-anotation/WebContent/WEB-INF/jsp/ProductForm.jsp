<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="gloable">
		<form action="/SpringMVC.anotation/product_save" >
			<fieldset>
				<legend>输入</legend>
				<p>
					<label for="name">名称：</label> <input type="text" id="name" name="name">
				</p>
				<p>
					<label for="price">价格：</label> <input type="text" id="price" name="price">
				</p>
				<p id="buttons">
					<input type="reset" value="重置"> 
					<input type="submit" value="提交">
				</p>

			</fieldset>

		</form>
	</div>
</body>
</html>