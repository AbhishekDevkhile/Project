<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.pathlock.Model.Product,java.util.ArrayList" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Products for user</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

<h4 align="right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>



  <h1 align="center">Products</h1>
  <input class="form-control" id="myInput" type="text" placeholder="Search..">
  <br>
  <table class="table table-bordered table-striped">
    <thead>
    
<h2 align="right"><a href="viewcart">View Cart</a></h2>
<table class="table table-bordered" border="2">
<tr>
<th>Product_ID</th>
<th>Product_Name</th>
<th>Product_Price</th>
<th>Product_Color</th>
<th>Action</th>
</tr>
    </thead>
    <tr>
    <tbody id="myTable">
<c:forEach  var="p1" items="${prodUserlist}">
<tr>
<td>${p1.getProductId()}</td>
<td>${p1.getProductName()}</td>
<td>${p1.getProductPrice()}</td>
<td>${p1.getProductColor()}</td>
<td><a href="cart?id=${p1.getProductId()}">Add to Cart</a>
</tr>
</c:forEach>
    </tbody>
  </table>
  

<script>

$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
</body>
</html>