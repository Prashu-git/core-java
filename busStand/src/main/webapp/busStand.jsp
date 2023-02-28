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

	<a href="index.jsp"> Home </a>



	<h1>BusStand saved operation</h1>

	<form action="bus_Stand" method="post">

		<table>

			<c:forEach items="${erros}" var="a">
				<span style="color: green">${a.message}</span>
				<br>
			</c:forEach>

			<!-- <tr>
				<td>Id :</td>
				<td><input type="number" name="id"></td>
			</tr>
 -->

			<tr>
				<td>Bus_Number :</td>
				<td><input type="text" name="bus_No"></td>
			</tr>

			<tr>
				<td>Depo_Name :</td>
				<td><input type="text" name="depo"></td>
			</tr>
			<tr>

				<td>Bus_Main_Stop :</td>
				<td><input type="text" name="main_Stop"></td>
			</tr>
			<tr>

				<td>Bus_Last_Stop :</td>
				<td><input type="text" name="last_Stop"></td>
			</tr>

			<!-- BusNumber<input type="text" name="BusNumber" />
		 BusDepo <input	type="text" name="BusDepo" />
		  BusMainStop <input type="text" name="BusMainStop" />
		   BusLastStop <input type="text" name="BusLastStop"> 
		   <input type="submit" value="Send" /> -->
		   
		   <tr>
				<td><input type="submit" value="save" /></td>
			</tr>

		</table>

	</form>

</body>
</html>