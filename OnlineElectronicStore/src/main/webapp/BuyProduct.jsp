<%@page import="pack1.ProductBean"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="pack1.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style type="text/css">
 	div{
		
		color: white;
	   }
	   table{
		  
		   border-color: white;
		   }
body{
		   background-color:rgb(81, 81, 81);
		   background-size: cover;
		   background-repeat: no-repeat;
		   height: 100vh;
		   background-position: center;
		   background-image:url(images/selectqnty.png);
	 }
	  @media (max-width: 400px) 
	 	 {
            body {
                background-size: cover;
                background-attachment: fixed;
                padding: 10px;
            }

            div {
                width: 95%;
                max-width: 350px;
                padding: 20px;
            }

            h2 {
                font-size:18px;
            }

            a {
                font-size: 14px;
                padding: 8px;
            }
        }
	 </style>
</head>
<body>
<center>
<div>
<h2>
    <%
      CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
      ProductBean pbean=(ProductBean)request.getAttribute("pbean");
      out.println("Hello "+cbean.getFname()+" confirm the  <mark>quantity</mark> required..!<br><br>");
      out.println("<u>Item selected</u>");
      
    %>
    <table  cellspacing="10" cellpadding="10" >
     <form action="pqnty" method="post">
     <tr>
         <td>Product Code :</td><td> <input type="text"  name="pcode" value="<%=pbean.getPcode()%>" readonly></td>
     </tr>
     <tr>
     <td>Product Name :</td><td>  <input type="text" value="<%=pbean.getPname()%>" readonly></td>
     </tr>
      <tr>
     <td>Product Company :</td><td>  <input type="text" value="<%=pbean.getPcompany()%>" readonly> </td>
     </tr>
      <tr>
      <td>Product Price :</td> <td> <input type="text" value="<%=pbean.getPprice()%>" readonly></td>
     </tr>
      <tr>
     <td>Available Qnty :</td><td> <input type="text" name="pqnty" value="<%=pbean.getPqnty()%>" readonly></td>
     </tr>
      <tr>
      <td>ReqProduct Qnty :</td> <td>  <input type="text"  value="0" name="qnty">
     </tr>
     <tr>
     <th colspan="2"> <input type="submit" value="BUY"></th>
     </tr>
 
     </form> 
</h2>

</table>

</div>
</body>
</html>