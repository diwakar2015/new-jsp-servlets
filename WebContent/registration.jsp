<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Welcome to Employee Management Software Version 1.0</h1>
		<h3>Register yourself</h3>
		<form action="RegisterServlet" method="post">
			Full Name: <input type="text" name="name">  </input>
			 </br>
		Username: <input type="text" name="username"></input> </br>
			  Password <input
				type="password" name="password"></input> </br> E-Mail <input type="text"
				name="email"></input> </br></br> <input type="submit" value="Register"></input>
		</form>
	</center>
</body>

</html>