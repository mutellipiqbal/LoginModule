<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>

<style>

input[type=submit] {
  width: 5%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>

</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //this works for http 1.1. If your have lower version, add this:
	response.setHeader("Pragma", "no-cache"); //for proxy server;
	response.setHeader("Expires","0");
	
	if (session.getAttribute("username") == null && session.getAttribute("password")==null) {
		response.sendRedirect("registerAndLogin1.jsp");
	}

	%>
	
Welcome ${username};

	<a href="videos.jsp">Click here for videos</a><br>
	
	<form action="logout">
	<input type="submit" value="Logout">
	</form>
	

</body>
</html>