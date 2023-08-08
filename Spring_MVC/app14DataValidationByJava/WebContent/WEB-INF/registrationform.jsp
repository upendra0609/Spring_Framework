<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>

<div>
   <h2 align="center">Student Registration Form</h2>
</div>
<div>
<form:form method="post" action="reg" commandName="user">
  <center>
     <table>
        <tr>
          <td>User Name</td>
          <td><form:input path="uname"/></td>
          <td><form:errors path="uname"></form:errors></td>
        </tr>
        <tr>
          <td>Password</td>
          <td><form:input path="upwd"/></td>
          <td><form:errors path="upwd"></form:errors></td>
        </tr>
        <tr>
          <td>User Age</td>
          <td><form:input path="uage"/></td>
          <td><form:errors path="uage"></form:errors></td>
        </tr>
        <tr>
          <td>User Date of Birth</td>
          <td><form:input path="udob"/></td>
          <td><form:errors path="udob"></form:errors></td>
        </tr>
        <tr>
          <td>User Email Id</td>
          <td><form:input path="uemail"/></td>
          <td><form:errors path="uemail"></form:errors></td>
        </tr>
        <tr>
          <td>User Mobile</td>
          <td><form:input path="umobile"/></td>
          <td><form:errors path="umobile"></form:errors></td>
        </tr>
        <tr>
          <td>
            <input type="submit" value="Register"/>
          </td>
        </tr>
     </table>
  </center>
</form:form>
</div>

</body>
</html>