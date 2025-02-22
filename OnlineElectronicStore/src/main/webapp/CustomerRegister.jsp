<%@page import="pack1.CustomerBean"%>
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
       CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
       out.println("Welcome "+cbean.getFname()+"..!<br><br>");
       out.println("you are succesfully registered. click on login to proceed<br><br>");
     
     %>
     <a href="CustomerLogin.html">Login</a><br><br>
     <a href="Logout">Logout</a><br><br>
  </h2>

</div>
</body>
</html>