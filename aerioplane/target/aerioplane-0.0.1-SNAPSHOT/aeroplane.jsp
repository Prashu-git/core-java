<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
	
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
	<a href="search.jsp">fetch By Id</a>
	<a href="index.jsp">home Page</a>


	<form action="aero" method="post">

		<table>

			<c:forEach items="${erros}" var="a">
				<span style="color: green">${a.message}</span>
				<br>
			</c:forEach>
			
			<tr> <td>Id :</td>
			<td> <input type="number" name="id"></td>
			</tr>
			

			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>


			<tr>
				<td>Batch No :</td>
				<td><select name="type">
						<option value="">SELECT</option>
						<c:forEach items="${batchNo}" var="p">
							<option value="${p}">${p}</option>
						</c:forEach>
				</select></td>
			</tr>

			<tr>
				<td>country</td>
				<td><select name="country">
						<option value="">SELECT</option>
						
						
						<c:forEach items="${country}" var="a">
							<option value="${a}">${a}</option>
						</c:forEach>
				</select></td>
			</tr>


			<tr>
				<td><input type="submit" value="save" /></td>
			</tr>


		</table>


	</form>




</body>
</html>