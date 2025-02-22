<%@page import="java.util.Iterator"%>
<%@page import="pack1.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pack1.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style type="text/css">
          table {
            width: 70%;
            border:2px;
            cellspacing:5px;
            cellpadding:10px;  
        }

        td {
            padding: 10px; /* Padding inside cells */
            border: 1px; /* Cell border */
            text-align: center;
        }

        /* Make the table headers bold */
        th {
            padding: 10px;
            font-weight: bold;
            text-align: center;
        }
          
          
          
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
            table {
                width: 70%;
                font-size: 12px;
            }

            td, th {
                padding: 8px;
            }

            th {
                font-size: 14px;
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
       AdminBean abean=(AdminBean)session.getAttribute("abean");  
       ArrayList<ProductBean> al=(ArrayList<ProductBean>)session.getAttribute("ProductsList");
      out.println(" Hello "+abean.getFname()+" these are your product details.  <br> <br>");
      
      if(al.size()==0)
      {
    	 out.println("oops there are no products available..!!<br><br>"); 
      }
      else
      {
    	  Iterator<ProductBean> i=al.iterator();
    	 // out.println("<table border='1'>");
     	 out.println(" <tr> <th>Product code</th><th>Product name</th><th>Product company</th><th>Product price</th><th>Product Qnty</th><th colspan='2'>Modify</th></tr>");
     	
    	  while(i.hasNext())
    	  {
    		ProductBean pb=i.next();
    		out.println("<tr><th>"+pb.getPcode()+"</th> <th> "+pb.getPname()+" </th> <th>"+pb.getPcompany()+" </th> <th>"+pb.getPprice()+"</th> <th> "+pb.getPqnty()+
    				"</th> <th><a href='edit?pcode="+pb.getPcode()+"'> Edit</a>"+"/"+"</th> <th><a href='delete?pcode="+pb.getPcode()+"'> Delete</a> </th></tr>");
    	  }
      }
 
    %>
    </table>
     <br>
    <a href="Logout">Logout</a><br><br>
</h2>
</div>
</body>
</html>