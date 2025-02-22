<%@page import="pack1.ProductBean"%>
<%@page import="pack1.AdminBean"%>
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
	    a{
	        color: white;
	    }
	   body{
		   background-color:rgb(81, 81, 81);
		   background-size: cover;
		   height: 100vh;
		   background-position: center;
		   background-image:url(images/modify.png);
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
   AdminBean abean=(AdminBean)session.getAttribute("abean");
   ProductBean pbean=(ProductBean)request.getAttribute("pbean");
   out.println("<br>Hello "+abean.getFname()+" "+pbean.getPname()+"  product details available for edit <br><br>");
   
   %>
   
   <form action="Update" method="post">
    Product Price : <input type="text" name=pprice value="<%=pbean.getPprice()%>"> <br><br>
    Product Qnty: <input type="text" name=pqnty value="<%=pbean.getPqnty()%>"> <br><br>
    <input type="hidden" name="PCode" value="<%=pbean.getPcode()%>">
    <input type="submit" value="Update"> <br><br>
   </form>
   
   
   
   </h2>
   </div>
   </body>
</html>