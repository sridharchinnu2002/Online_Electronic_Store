<%@page import="pack1.ProductBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
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
		   background-image:url(images/buyproducts.png);
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
     <table border="1" cellspacing="5" cellpadding="10">
     <%
     
     CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
     ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductsList");
     out.println("Hello "+cbean.getFname()+" these are available product details.<br><br> ");
     if(al.size()==0)
     {
    	 out.println("oops there are no proudcts..!<br> <br>");
     }
     else
     {
    	 Iterator<ProductBean> i=al.iterator();
    	// out.println("<table border='1'>");
    	 out.println(" <tr> <th>Product code</th><th>Product name</th><th>Product company</th><th>Product price</th><th>Product Qnty</th><th>Purchase</th></tr>");
    	 while(i.hasNext())
    	 {
    		ProductBean pbean=i.next();
    		out.println("<tr><th>"+pbean.getPcode()+"</th> <th>"+pbean.getPname()+"</th> <th>"+pbean.getPcompany()+"</th> <th>"+pbean.getPprice()+"</th> <th> "+pbean.getPqnty()+" </th> <th> "+
    				
    				"<a href='buy?pcode="+pbean.getPcode()+"'>Buy</a></th></tr>");
    	 }
     }
     %>
     
     </table>
        <br>
        <a href="Logout">Logout</a> <br><br>
     
  </h2>
  </div>
</body>
</html>