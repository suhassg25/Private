<%@page import="com.ty.dao.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<% List<Student> std=(List) request.getAttribute("student");%>

<body>
<table border="2px">
<tr> 
<th>ID</th>
<th>NAME</th>
<th>PHONE</th>
<th>EMAIL</th>
<th>PASSWORD</th>
</tr>
<% for(Student s:std){ %>
<tr>
<td><%=s.getId()%></td>
<td><%=s.getName() %></td>
<td><%=s.getPhonenumber() %></td>
<td><%=s.getEmail() %></td>
<td><%=s.getPassword() %></td>
<td> <a href="view?id=<%=s.getId() %>">view</a></td>
<td> <a href="delete?id=<%=s.getId() %>">delete</a></td>
</tr>
<%} %>
</table>
</body>
</html>