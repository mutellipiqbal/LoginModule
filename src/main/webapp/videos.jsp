<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Videos</title>
</head>
<body>
<%
    response.setHeader("Cache-control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Expires","0");
    
	if (session.getAttribute("username") == null && session.getAttribute("password")==null) {
		response.sendRedirect("registerAndLogin1.jsp");
	}

	%>
	<iframe width="560" height="315" src="https://www.youtube.com/embed/h0UTh4jpxjY" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	
</body>
</html>