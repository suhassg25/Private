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
<form:form action="log" modelAttribute="emp"> <table>
<tr>
<td><form:label path="email">Email</form:label></td>
			</tr>
			<tr>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><form:label path="dob">DOB</form:label></td>
			</tr>
			<tr>
				<td><form:input path="dob" /></td>
			</tr>
			<tr>
				<td> <input type="submit" value="Login" style="background-color: blue;"> </td>
			</tr>
			
</table>
</form:form>
</body>

</html>