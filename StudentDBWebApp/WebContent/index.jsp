<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Students Management</title>
<style type="text/css">
	.success{
		color: #00ff00;
	}
	.error{
		.color: #ff0000;
	}
</style>
</head>
<body>
	<h1>This is a simple Student Management System</h1>
	<div>
		<c:if test="${not empty request}">
		<%
			String message = request.getAttribute("message").toString();
			String error = request.getAttribute("error").toString();
		%>
		</c:if>
		<c:if test="${not empty message }">
			<h3 class="success">${message }</h3>
		</c:if>
		<c:if test="${not empty error }">
			<h3 class="error">${error }</h3>
		</c:if>
		<h3>Student Form :</h3>
		<form action="index.aspx" method="post">
			<input type="hidden" id="student_id" name="student_id" value="" />
			<table>
				<tr>
					<th><strong>Full Name</strong></th>
					<th><strong>:</strong></th>
					<th><input type="text" id="name" name="name" value="" /></th>
				</tr>
				<tr>
					<th><strong>Registration No.</strong></th>
					<th><strong>:</strong></th>
					<th><input type="text" id="regNo" name="regNo" value="" /></th>
				</tr>
				<tr>
					<th><strong>CGPA</strong></th>
					<th><strong>:</strong></th>
					<th><input type="text" id="cgpa" name="cgpa" value="" /></th>
				</tr>
				<tr>
					<th><strong>Age</strong></th>
					<th><strong>:</strong></th>
					<th><input type="text" id="age" name="age" value="" /></th>
				</tr>
				<tr>
					<th><input type="reset" value="Reset" /></th>
					<th></th>
					<th><input type="submit" value="Save" /></th>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>