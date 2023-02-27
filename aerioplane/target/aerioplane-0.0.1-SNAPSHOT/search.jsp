<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
		data-bs-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<a href="index.jsp">Home</a>



	<form action="searchbyId" method="get">
		<input type="search" name="id"> <input type="submit"
			value="search"> <br>
	</form>
	<h4 style="color: green;">Name :${dto.name} Country
		Name:${dto.country} BatchNo :${dto.batchNo} Id :${dto.id}</h4>





</body>
</html>