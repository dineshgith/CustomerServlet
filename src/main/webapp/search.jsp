<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/customerservlet/search.do" ,method="GET">
		<tr>
			<td><label>Enter Customer Id</label></td>
			<td><input type="text" name="customerId"></td>
		</tr>
		<tr>
			<td colspan="1"><button type="submit" value="submit">Search</button></td>
		</tr>
		<a href="/customerservlet/registration.html">Register!</a>&nbsp <a
			href="/customerservlet/index.jsp">Home!</a><br></br>

		<div>
			<c:out value="${ customer.customerId}"></c:out>
			<br></br>
			<c:out value="${ customer.title}"></c:out>
			<br></br>
			<c:out value="${ customer.firstName}"></c:out>
			<br></br>
			<c:out value="${ customer.middleName}"></c:out>
			<br></br>
			<c:out value="${ customer.lastName}"></c:out>
			<br></br>
			<c:out value="${ customer.suffix}"></c:out>
			<br></br>
			<c:out value="${ customer.email}"></c:out>
			<br></br>
			<c:out value="${ customer.company}"></c:out>
			<br></br>
			<c:out value="${ customer.displayName}"></c:out>
			<br></br>
			<c:out value="${ customer.printOnCheckAs}"></c:out>
			<br></br>
			<c:out value="${ customer.billingStreet}"></c:out>
			<br></br>
			<c:out value="${ customer.billingCity}"></c:out>
			<br></br>
			<c:out value="${ customer.billingState}"></c:out>
			<br></br>
			<c:out value="${ customer.billingZip}"></c:out>
			<br></br>
			<c:out value="${ customer.billingCountry}"></c:out>
			<br></br>
			<c:out value="${ customer.shippingStreet}"></c:out>
			<br></br>
			<c:out value="${ customer.shippingCity}"></c:out>
			<br></br>
			<c:out value="${ customer.shippingState}"></c:out>
			<br></br>
			<c:out value="${ customer.shippingZip}"></c:out>
			<br></br>
			<c:out value="${ customer.shippingCountry}"></c:out>
			<br></br>
			<c:out value="${ customer.otherDetails}"></c:out>
			<br></br>
		</div>
</body>
</html>