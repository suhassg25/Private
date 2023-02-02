<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form:form action="savestudent" modelAttribute="student">

<table>
<tr> <td><form:label path="name">NAME :</form:label> </td>
<td><form:input path="name"/> </td>
</tr>
<tr> <td> <form:label path="school">SCHOOL :</form:label>
 </td>
<td><form:input path="school"/> </td>
</tr>

<tr> <td> <form:label path="email">EMAIL :</form:label>
 </td>
<td><form:input path="email"/>  </td>
</tr>

<tr> <td> <form:label path="password">PASSWORD :</form:label>
 </td>
<td><form:input path="password"/> </td>
</tr>

<tr> <td> <form:label path="phone">PHONE NUMBER :</form:label>
 </td>
<td><form:input path="phone"/> </td>
</tr>
</table>

<input type="submit" value="SUBMIT">
</form:form>

</body>
</html>