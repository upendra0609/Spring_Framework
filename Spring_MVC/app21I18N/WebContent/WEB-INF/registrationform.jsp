<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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

<form:form method="post" action="reg" commandName="user">
<center>
  <table>
     <tr>
       <td>
          <spring:message code="uname"></spring:message>
       </td>
       <td>
          <form:input path="uname"/>
       </td>
     </tr>
     <tr>
       <td>
          <spring:message code="upwd"></spring:message>
       </td>
       <td>
          <form:password path="upwd"/>
       </td>
     </tr>
     <tr>
       <td>
          <spring:message code="uemail"></spring:message>
       </td>
       <td>
          <form:input path="uemail"/>
       </td>
     </tr>
     <tr>
       <td>
          <spring:message code="umobile"></spring:message>
       </td>
       <td>
          <form:input path="umobile"/>
       </td>
     </tr>
     <tr>
     <td>
        <button>Register</button>
     </td>
     </tr>
  </table>
</center>
</form:form>

</div>

</body>
</html>