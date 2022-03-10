<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.pathlock.Model.Product,java.util.ArrayList" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <meta charset="utf-8">
<!DOCTYPE html>
<html lang="en">
<head>

</head>
<body >

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    
      <a class="navbar-brand" href="add">Add Products</a>
      <span style="color:white;text-align:right;position:relative;left:1150px;font-Size:25px; ">Hello ${username}</span>
    </div>
    
  </div>
</nav>
<h4 align="right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>
    
    <h1 style="color:black;text-align:center;position:relative;font-Size:50px; ">Product</h1>
    
</div>
<h4 align="center" >
<input id="myInput" type="text" placeholder="Search Products..." size=35">
</h4>
  <br>
<form>
<div class="container">          
  <table class="table table-bordered">
    <thead>
      <tr>
<th>Product_ID</th>
<th>Product_Name</th>
<th>Product_Price</th>
<th>Product_Color</th>
<th>Stock_In_Hand</th>


<th>Action</th>
 <tbody id="myTable">
      </tr>
<c:forEach  var="p1" items="${prodlist}">
<tr>
<td>${p1.getProductId()}</td>
<td>${p1.getProductName()}</td>
<td>${p1.getProductPrice()}</td>
<td>${p1.getProductColor()}</td>
<td>${p1.getStockinHand()}</td>

<td><a href="edit?id=${p1.getProductId()}">Edit</a>
<a href="delete?id=${p1.getProductId()}">Delete</a>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>

<h4 align="center" >
    <a class="btn btn-primary" style="align-self: center" href=" " role="button">Back</a>
    </h4>
</form>
</body>
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
</html>
