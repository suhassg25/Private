<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2px" >
<thead> <tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Delete</th>
<th>Edit</th>
</tr>

</thead>
<c:forEach items="${slist}" var="student">
<tr>
<td>${student.id}</td>
<td>${student.name}</td>
<td>${student.email}</td>
<td>${student.password}</td>
<td> <a href="delete?id=${student.id}"> DELETE </a> </td>
<td> <a href="edit?id=${student.id}"> EDIT </a> </td>
</tr>


</c:forEach>

<h1>hi..    ${name} Browser Welcomes you</h1>
</table>
</body>
</html>