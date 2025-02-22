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
	    a{
	        color: white;
	    }
	   body{
		   background-color:rgb(81, 81, 81);
		   background-size: cover;
		   height: 100vh;
		   background-position: center;
		   background-image:url(images/home.png);
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
       out.println("Welcome "+cbean.getFname()+"..!!<br><br>");
    
     %>
     <a href="view2">View products</a> <br><br>
     <a href="Logout">Logout</a> <br><br>
     

</h2>
</div>
</body>
</html>