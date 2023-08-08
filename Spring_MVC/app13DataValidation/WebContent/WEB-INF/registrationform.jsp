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
<h2>User Registration Page</h2>
<form:form method="post" action="reg" commandName="user">
<center>
  <table>
     <tr>
        <td>User Name</td>
        <td><form:input path="uname"/></td>
        <td><form:errors path="uname"/></td>
     </tr>
     <tr>
        <td>Password</td>
        <td><form:input path="upwd"/></td>
        <td><form:errors path="upwd"/></td>
     </tr>
     <tr>
        <td>Age</td>
        <td><form:input path="uage"/></td>
        <td><form:errors path="uage"/></td>
     </tr>
     <tr>
        <td>Email</td>
        <td><form:input path="uemail"/></td>
        <td><form:errors path="uemail"/></td>
     </tr>
     <tr>
        <td>Mobile Number</td>
        <td><form:input path="umobile"/></td>
        <td><form:errors path="umobile"/></td>
     </tr>
     <tr>
        <td><input type="submit" value="Registration"/></td>
     </tr>
  </table>
</center>
</form:form>
</body>
</html>