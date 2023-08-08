<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table style="width:100%; height:100%">
  <tr style="height:20%">
     <td colspan="2" align="center">
       <tiles:insertAttribute name="header"/>
     </td>
  </tr>
  <tr style="height:65%">
     <td style="width:20%" align="center">
       <tiles:insertAttribute name="menu"/>
     </td>
     <td style="width:80%" align="center">
       <tiles:insertAttribute name="body"/>
     </td>
  </tr>
  <tr style="height:15%">
     <td colspan="2" align="center">
       <tiles:insertAttribute name="footer"/>
     </td>
  </tr>

</table>

</body>
</html>