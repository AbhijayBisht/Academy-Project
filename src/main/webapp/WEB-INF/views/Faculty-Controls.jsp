<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Faculty</title>
</head>
<body>
	Welcome Faculty!!
	<form action="action_page.php" method="post">
  <div class="container">
    <label for="Faculty_Id"><b>Faculty_Id</b></label>
    <input type="text" placeholder="Faculty_Id" name="Faculty_Id" required>
	<br>
    <label for="Faculty_Name"><b>Faculty_Name</b></label>
    <input type="text" placeholder="Faculty_Name" name="Faculty_Name" required>
	<br>
    <label for="Qualification"><b>Qualification</b></label>
    <input type="text" placeholder="Qualification" name="Qualification" required>
	<br>
	<br>
    <button type="submit">Submit</button>
   <br>
	<input type="reset">
  </div>

  <div class="container" style="background-color:#f1f1f1">
    
  </div>
</form>
	
</body>
</html>