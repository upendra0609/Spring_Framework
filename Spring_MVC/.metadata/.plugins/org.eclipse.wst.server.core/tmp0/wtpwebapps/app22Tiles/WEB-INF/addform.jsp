<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br/><br/><br/>

<form:form method="POST" action="add" commandName="student">
  <center>
    <table>
      <tr>
         <td>Student Id:</td>
         <td>
           <form:input path="sid"/>
         </td>
      </tr>
      <tr>
         <td>Student Name:</td>
         <td>
           <form:input path="sname"/>
         </td>
      </tr>
      <tr>
         <td>Student Address:</td>
         <td>
           <form:input path="saddr"/>
         </td>
      </tr>
      <tr>
        <td>
          <input type="submit" value="ADD"/>
        </td>
      </tr>
    </table>
  </center>
</form:form>

</body>
</html>