<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detail</title>
</head>
<body>
<div>
   <table border="1">
      <tr>
        <td>User Name</td>
        <td>${user.uname}</td>
      </tr>
       <tr>
        <td>User Password</td>
        <td>${user.upwd}</td>
      </tr>
       <tr>
        <td>User Age</td>
        <td>${user.uage}</td>
      </tr>
       <tr>
        <td>User Email</td>
        <td>${user.uemail}</td>
      </tr>
       <tr>
        <td>User Date of Birth</td>
        <td>${user.udob}</td>
      </tr>
       <tr>
        <td>User Mobile</td>
        <td>${user.umobile}</td>
      </tr>
       <tr>
   </table>
</div>


</body>
</html>