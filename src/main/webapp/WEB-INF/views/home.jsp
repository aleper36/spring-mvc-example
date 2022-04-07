<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<html> 
<head> <title>Home</title> </head> 
<body> 
<h1>Cambio fecha</h1> 
<P>The time on the server is ${serverTime}.</p> 
<form action="user" method="post"> 
<input type="text" name="userName"><br>
<P>Añadir dias a la fecha actual: </p> 
<input type="number" name="dias"><br>
<input type="submit" value="Login"> 
</form> 
</body> 
</html>
