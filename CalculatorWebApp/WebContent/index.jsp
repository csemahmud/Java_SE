<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
<style type="text/css">
	.exception{
		color: #ff0000;
	}
</style>
</head>
<body>
	<div>
		<c:if test="${not empty request}">
		<% 
		String firstNumber = request.getAttribute("firstNumber").toString();
		String secondNumber = request.getAttribute("secondNumber").toString();
		String result = request.getAttribute("result").toString(); 
		String exception = request.getAttribute("exception").toString(); 
		%>
		</c:if>
		<h1><i><u>Web Calculator</u></i></h1>
		<form action="calc_servlet.aspx" method="post">
			<table>
				<tr>
					<th><strong>Enter First Number</strong></th>
					<th><strong>:</strong></th>
					<th><input id="firstNumber" name="firstNumber" type="text" value="${firstNumber }" /></th>
				</tr>
				<tr>
					<th><strong>Enter Second Number</strong></th>
					<th><strong>:</strong></th>
					<th><input id="secondNumber" name="secondNumber" type="text"  value="${secondNumber }" /></th>
				</tr>
				<tr>
					<th><input name="operator" type="submit" value="Add" /></th>
					<th></th>
					<th><input name="operator" type="submit" value="Subtract" /></th>
				</tr>
				<tr>
					<th><input name="operator" type="submit" value="Multiply" /></th>
					<th></th>
					<th><input name="operator" type="submit" value="Divide" /></th>
				</tr>
				<tr>
					<th><input name="operator" type="submit" value="Modulous" /></th>
					<th></th>
					<th><input type="reset" value="Reset" /></th>
				</tr>
			</table>
		</form>
		<c:if test="${not empty result}">
			<p>
				<i>The Result is : </i>
				<strong>${result }</strong>
			<p/>
		</c:if>
		<c:if test="${not empty exception}">
			<p>
				<strong class="exception">
					Exception : ${exception }
				</strong>
			<p/>
		</c:if>
	</div>
</body>
</html>