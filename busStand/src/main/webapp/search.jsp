<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="index.jsp"> Home </a>

	<form action="searchbyId" method="get">

		<input type="search" name="id"> <input type="submit" value="search"><br>
		
		
		<h1>Searching Details</h1>	<br>
		<h3>BusNumber :${dto.bus_No}</h3>
		<br>
		<h3>BusDepo:${dto.depo}</h3>
		<br>
		<h3>BusMainStop:${dto.main_Stop}</h3>
		<br>
		<h3>BusLastStop :${dto.last_Stop}</h3>
		<br>
	</form>

</body>
</html>