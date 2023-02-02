<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="signup" method="post">
<table>
<tr>
<td> <label>NAME</label>
<td><input type="text" placeholder="ENTER YOUR NAME" name="name"></td>
</td>
</tr>
<tr>
<td> <label>Phone</label>
<td><input type="tel" placeholder="ENTER YOUR NUMBER" name="number"></td>
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
<td><input type="submit" value="SUBMIT">
</td>
</tr>
</table>
</form>
<% String str=(String)request.getAttribute("message"); 
if(str!=null){ %> 
 <%=str %> <% }
%>
</body>
</html>