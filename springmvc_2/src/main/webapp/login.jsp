<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="margin-left: 300px; margin-top: 200px ">
<form:form action="loginemployee" modelAttribute="employee">
<table>
<tr> <td> <form:label path="email">EMAIL :</form:label>
 </td>
<td><form:input path="email"/>  </td>
</tr>

<tr> <td> <form:label path="password">PASSWORD :</form:label>
 </td>
<td><form:input path="password"/> </td>
</tr>
</table>
<input type="submit" value="SUBMIT">
</form:form>
</body>
</html>