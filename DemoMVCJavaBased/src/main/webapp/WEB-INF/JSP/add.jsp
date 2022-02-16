<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>ADD NEW STUDENT RECORD</h1>
<FORM method="get" action="save" >
<table>
<tr>
<th>Name:</th>
<td> <input type="text" name="sname"></td>
</tr>
<tr>
<th>Percent</th>
<td><input type="text" name="percent"></td>
</tr>
<tr>
<th>City</th>
<td><input type="text" name="city"></td>
</tr>
<tr>
<td colspan="2">
<input type="submit" value="submit">
</td>
</tr>
</table>
</FORM>
</body>
</html>