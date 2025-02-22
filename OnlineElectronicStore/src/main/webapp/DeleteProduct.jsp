<%@page import="pack1.ProductBean"%>
<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="LoginStyle.css"/>
</head>
<body>
<center>
<div>
<h2>
   <%
   AdminBean abean=(AdminBean)session.getAttribute("abean");
   ProductBean pbean=(ProductBean)request.getAttribute("pbean");
   out.println("Hello "+abean.getFname()+" you have succesfully removed "+"<mark>"+pbean.getPname()+"</mark>"+" from store<br><br>");

   %>
     <a href="AddProduct.html">Add Product</a><br><br>
      <a href="View1">View Product</a><br><br>
      <a href="Logout">Logout</a><br><br>

</h2>

</div>
</body>
</html>