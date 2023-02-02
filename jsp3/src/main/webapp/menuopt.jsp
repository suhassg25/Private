<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String log=(String)request.getAttribute("log"); 
if(log!=null){ %> 
 <%=log %> <% }
%>

<table>
<tr>
<td > </td>
<td > <a href="createmenu.jsp"> <button> CREATE MENU</button> </a> </td>
<td></td>
<td> <a href=""> <button> UPDATE MENU</button> </a></td>
</tr>
</table>



</body>
</html>