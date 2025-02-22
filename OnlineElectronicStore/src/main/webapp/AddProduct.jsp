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
         String msg=(String)request.getAttribute("msg"); 
         
         out.println("Mr."+abean.getFname()+" "+msg+"<br><br>");

%>
  <a href="AddProduct.html">Add Product</a><br><br>
      <a href="View1">View Product</a><br><br>
      <a href="Logout">Logout</a><br><br>
</h2>
</div>
</body>
</html>