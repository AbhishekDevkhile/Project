<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="com.pathlock.Model.Product,java.util.ArrayList" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<!DOCTYPE html>
<html lang="en">
<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<title>Edit Admin</title>
<div class="container">
<h4 align="right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>
  <form action="update" >
   
    <div class="form-group">
      <label for="pwd">Product Name:</label>
      <input type="text" class="form-control" value="${product.getProductName()}" id="pwd"  name="pname">
    </div>
    <div class="form-group">
      <label for="id">Product Price:</label>
      <input type="text" class="form-control" value="${product.getProductPrice()}" id="id" name="price">
    </div>
    <div class="form-group">
      <label for="pwd">Product Color:</label>
      <input type="text" class="form-control" value="${product.getProductColor()}" id="pwd"  name="pcolor">
    </div>
 
    <button type="submit" class="btn btn-default">Submit</button>
    
    <h4 align="center" >
    <a class="btn btn-primary" style="align-self: center" href="productadmin" role="button">Back</a>
    </h4>
    
  </form>
</div>
</body>
</html>
</body>
</html>