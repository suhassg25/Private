<%@page import="com.ty.dao.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% Student str=(Student)request.getAttribute("id"); 
if(str!=null){ %> 
 <%=str.getEmail() %>
  <%=str.getName() %>
   <%=str.getPhonenumber() %>
       <% }%>


</body>
</html>