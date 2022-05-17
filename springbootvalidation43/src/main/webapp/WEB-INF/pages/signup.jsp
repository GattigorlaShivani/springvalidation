<!DOCTYPE html>
<%@ page language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign up Form</title>
<style>
.error
{
color:#ff0000;
font-style:italic;
font-weight:bold;
}
</style>
</head>
<body>
<h1>signup Form</h1>
<form:form action="signupform" modelAttribute="signupBean" method="post">
<table>
<tr>
<td><form:label path="mobile">Mobile#</form:label></td>
<td><form:input path="mobile" type="number" /></td>
<td><form:errors path="mobile" cssClass="error"></form:errors></td>
</tr>

<tr>
<td><form:label path="email">email#</form:label></td>
<td><form:input path="email" type="email" /></td>
<td><form:errors path="email" cssClass="error"></form:errors></td>
</tr>


<tr>
<td><form:label path="aadhar">Aadhar#</form:label></td>
<td><form:input path="aadhar" type="number" /></td>
<td><form:errors path="aadhar" cssClass="error"></form:errors></td>
</tr>

<tr><td>
<input type="submit" value="signup">
</td></tr>
</table>
</form:form>
</body>
</html>