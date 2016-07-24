<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management System</title>
</head>
<body>
	<%
		String status = request.getParameter("status");
		String msg = "";
		if (status != null) {
			if (status.equalsIgnoreCase("invalid"))
				msg = "Invalid login credentials proivided!! Please try again.";
		}
	%>
	<center>
		<h1>Welcome to Employee Management Software Version 1.0</h1>
		<h3>Authenticate yourself</h3>
		<form action="LoginServlet" method="post">

			Username: <input type="text" name="username"></input> </br> Password <input
				type="password" name="password"></input> </br> <input type="submit"
				value="Login"></input>
		</form>
		Not a user? <a href="registration.jsp"> Register</a>

		<p>
			<font color="red"> <%=msg%></font>
		</p>
	</center>

</body>
</html>