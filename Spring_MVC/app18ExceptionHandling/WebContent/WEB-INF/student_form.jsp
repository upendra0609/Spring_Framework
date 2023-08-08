<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center">Student Registration Form</h2>
<form:form action="reg" method="post" commandName="student">
<center>
<table align="center">
   <tr>
      <td>Student Id:</td>
      <td><form:input path="sid"/></td>
   </tr>
   <tr>
      <td>Student Name:</td>
      <td><form:input path="sname"/></td>
   </tr>
   <tr>
      <td>Student Marks:</td>
      <td><form:input path="smarks"/></td>
   </tr>
   <tr>
      <td>Student Email:</td>
      <td><form:input path="semail"/></td>
   </tr>
   <tr>
      <td>Student Mobile No:</td>
      <td><form:input path="smobile"/></td>
   </tr>
   <tr>
      <td>
        <button>Register</button>
      </td>
   </tr>
</table>
</center>
</form:form>


</body>
</html>