<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>registerAndLogin</title>
<style>
input[type=text], select {
  width: 40%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width: 40%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 40%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

label {
        display: inline-block;
        width: 150px;
        
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



<div>
<h1 align="center">Registeration</h1>


	<form  align="center" action="register" method="post" >
		 <label for="fname">First Name: </label><br>
         <input required type="text" name="firstName" /><br>
         <label for="lname">Last Name: </label><br>
         <input required type="text" name="lastName" /><br>
         <label for="uname">User Name: </label><br>
         <input required minlength="3" maxlength="15" type="text" name="userName" /><br>
         <label for="pass">Password: </label><br>
         <input required type="password" minlength="5" maxlength="20" name="password" /><br>
         <label for="email">Email: </label><br>
         <input required type="text" name="email" /> <br>
         <label for="address">Address: </label><br>
         <input type="text"name="address" /><br>
         <input type="submit" value="Register"/><br>

	</form>

	<br>
	<hr size="2" width="90%" color="blue">  
	<br>
	
	<h1 style="text-align:center">Login</h1>
	
	
<form action="login" method="post" align="center">
		<label for="uname">User Name: </label><br>
		<input required type="text" name="uName" /> <br>
		<label for="pass">Password: </label><br>
		<input required type="password" name="pass" /><br> 
		<input type="submit" value="Sign in" />

	</form>
	
	<br>
</div>
</body>
</html>