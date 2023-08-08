<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="loginForm" action="<c:url value='j_spring_security_check'/>" method="post">
  <table>
    <tr>
      <td>User Name:</td>
      <td>
        <input type="text" name="username" />
      </td>
    </tr>
     <tr>
      <td>Password:</td>
      <td>
        <input type="password" name="password" />
      </td>
    </tr>
    <tr>
      <td>
        <input type="submit" value="SUBMIT"/>
      </td>
    </tr>
    <tr>
      <td>
         <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      </td>
    </tr>
  </table>
</form>

</body>
</html>