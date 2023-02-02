<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<center>
<body style="margin: 2px,2px,2px,2px; padding: 5px;">
	<form:form action="save" modelAttribute="emp"  >
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
			</tr>
			<tr>
				<td><form:input path="name" /></td>
			</tr>
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
				<td><form:label path="age">Age</form:label></td>
			</tr>
			<tr>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td><form:label path="salary">Salary</form:label></td>
			</tr>
			<tr>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td><form:select path="status">Status
				<form:option value="true" id="true"  > Active </form:option>
				<form:option value="false" id="false" > Inactive </form:option>
				
				</form:select>		</td>
			</tr> 
			

			<hr>
			<tr>
				<td><input type="submit" value="SubmiT"></td>
			</tr>

		</table>
	</form:form>

</body>
</center>
</html>