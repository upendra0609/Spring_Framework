<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">
<h2>
<spring:message code="title1"></spring:message>
</h2>

<h3>
<spring:message code="title2"></spring:message>
</h3>

<table border="1">
    <tr>
       <td>
          <spring:message code="uname"></spring:message>
       </td>
       <td>${user.uname}</td>
    </tr>
    <tr>
       <td>
          <spring:message code="upwd"></spring:message>
       </td>
       <td>${user.upwd}</td>
    </tr>
    <tr>
       <td>
          <spring:message code="uemail"></spring:message>
       </td>
       <td>${user.uemail}</td>
    </tr>
    <tr>
       <td>
          <spring:message code="umobile"></spring:message>
       </td>
       <td>${user.umobile}</td>
    </tr>
</table>

</div>

</body>
</html>