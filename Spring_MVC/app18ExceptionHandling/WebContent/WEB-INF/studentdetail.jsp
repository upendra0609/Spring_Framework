<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center">Student Details</h2>
<table align="center" border="1">
  <tr>
     <td>Student Id</td>
     <td>${student.sid}</td>
  </tr>
   <tr>
     <td>Student Name</td>
     <td>${student.sname}</td>
  </tr>
   <tr>
     <td>Student Marks</td>
     <td>${student.smarks}</td>
  </tr>
   <tr>
     <td>Student Email</td>
     <td>${student.semail}</td>
  </tr>
   <tr>
     <td>Student Mobile</td>
     <td>${student.smobile}</td>
  </tr>
</table>

</body>
</html>