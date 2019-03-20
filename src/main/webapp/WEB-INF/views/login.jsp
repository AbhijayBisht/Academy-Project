<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Login.html" method="post">
  <div class="imgcontainer">
  
  </div>

  <div class="container">
    <label for="userId"><b>UserId</b></label>
    <input type="text" placeholder="Enter UserId" name="userId" required>
	<br>
    <label for="password"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
	<br>
	<label for="userType"><b>UserType</b></label>
    <input type="text" placeholder="Enter UserType" name="userType" required>
	<br>
    <label for="userStatus"><b>UserStatus</b></label>
    <input type="text" placeholder="Enter UserStatus" name="userStatus" required>
	<br>
	
    <button type="submit">Submit</button>
   
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Reset</button>
  </div>
</form>

</body>
</html>