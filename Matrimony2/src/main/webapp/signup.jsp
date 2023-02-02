<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<center>
<body>
<% String str=(String)request.getAttribute("msg"); 
if(str!=null){ %> 
 <%=str %> <% }
%>

<form action="signup" method="post">
<table>
<tr>
<td> <label>NAME</label>
<td><input type="text" placeholder="ENTER YOUR NAME" name="name"></td>
</td>
</tr>
<tr>
<td> <label>Address</label>
<td><input type="text" placeholder="ENTER YOUR Address" name="address"></td>
</td>
</tr>
<tr>
<td> <label>Phone</label>
<td><input type="tel" placeholder="ENTER YOUR NUMBER" name="phone"></td>
</td>
</tr>
<tr>
<td>  <label>AGE</label> 
<td><input type="number" placeholder="ENTER YOUR AGE" name="age"></td>
</td>
</tr>
<tr>
<td> <label>EMAIL</label>
<td><input type="text" placeholder="ENTER YOUR EMAIL" name="email"></td>
</td>
</tr>
<tr>
<td> <label>PASSWORD</label>
<td><input type="password" placeholder="ENTER YOUR PASSWORD" name="password"></td>
</td>
</tr>
<tr>
<td> <label for="gender">GENDER</label> <br>
<td> 
	<select name="gender">
	<option >Male</option>
	<option  >Female</option>

	</select>
</td>
</td>
</tr>
<tr>
<td> <label>Qualification</label>
<td><input type="text" placeholder="ENTER YOUR Qualification" name="qualification"></td>
</td> </tr>
<tr><td> <label>Disabilities</label>
<td><input type="text" placeholder="ENTER YOUR DISABILITIES" name="disabilities"></td>
</td> </tr>
<tr><td> <label>Height</label>
<td><input type="number(5,2)" placeholder="ENTER YOUR Height" name="height"></td>
</td>
</tr>
<tr>
<td><input type="submit" value="SUBMIT">
</td>
</tr>
</table>
</form>
</body>
</center>
</html>