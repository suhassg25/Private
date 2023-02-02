<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="margin-left: 300px; margin-top: 200px ">
<table border="2px" >
<thead> <tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
<th>Role</th>
<th>Phone</th>
<th>Delete</th>
<th>Edit</th>
</tr>

</thead>
<c:forEach items="${slist}" var="employee">
<tr>
<td>${employee.id}</td>
<td>${employee.name}</td>
<td>${employee.email}</td>
<td>${employee.password}</td>
<td>${employee.role}</td>
<td>${employee.phone}</td>
<td> <a href="delete?id=${employee.id}"> DELETE </a> </td>
<td> <a href="edit?id=${employee.id}"> EDIT </a> </td>
</tr>


</c:forEach>

</table>
</body>
</html>