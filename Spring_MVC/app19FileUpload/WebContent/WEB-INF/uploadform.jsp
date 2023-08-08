<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center">File Upload Form</h2>
<form action="upload" method="post" enctype="multipart/form-data">  
  <table border="1" align="center">
    <tr>
      <td>File1</td>
      <td>
        <input type="file" name="files"/>
      </td>
    </tr>
    <tr>
      <td>File2</td>
      <td>
        <input type="file" name="files"/>
      </td>
    </tr>
    <tr>
      <td>File3</td>
      <td>
        <input type="file" name="files"/>
      </td>
    </tr>
    <tr>
      <td>
        <input type="submit" value="Upload"/>
        
      </td>
    </tr>
  </table>
</form>

</body>
</html>