<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>
	<h1>Details</h1>
	<form action="all" method="post">
		<pre>
First Name<input type="text" name="fname" />
Last Name<input type="text" name="lname" />
Email <input type="email" name="email" />
Gender 	
Male <input type="radio" name="gender" value="male" />
Female <input type="radio" name="gender" value="female" />
Other <input type="radio" name="gender" value="other" />
Reason<textarea rows="5" cols="25" name="reason"></textarea>
Address<textarea rows="5" cols="25" name="address"></textarea>
<input type="submit" value="Send" />
</pre>
	</form>
</body>
</html>