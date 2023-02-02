<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String str=(String)request.getAttribute("msg"); 
if(str!=null){ %> 
 <%=str %> <% }
%>

<form action="signup" method="get">
<table>

<tr>
<td> <label>NAME</label>
<td><input type="text" placeholder="ENTER YOUR EMAIL" name="email"></td>
</td>
</tr>
<tr>
<td> <label>PASSWORD</label>
<td><input type="password" placeholder="ENTER YOUR PASSWORD" name="password"></td>
</td>

<tr>
<td> <label>Gender</label>
<td><input type="text" placeholder="ENTER YOUR GENDER" name="gender"></td>
</td>
</tr>
<tr>
<td><input type="submit" value="SUBMIT" style="color: red">
</td>
</tr>

</table>
</form>

</body>
</html>