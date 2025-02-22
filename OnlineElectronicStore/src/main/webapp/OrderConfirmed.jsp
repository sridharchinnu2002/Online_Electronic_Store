<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>

<%@page import="pack1.UpdateProductServlet"%>
<%@page import="pack1.ProductBean"%>
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
		
		color:black;
	  
		height:auto;
		width:550px;
		border-radius: 5px;
		background-color: #fff;
		box-shadow: 3px 3px 8px 8px rgb(76, 76, 76);
		background-color:rgb(231, 253, 254);
		border-color: rgb(0, 0, 0);
		 }
	   a{
		   color: white;
	    }
	   body{
		   background-color:rgb(81, 81, 81);
		   background-size: cover;
		   height: 100vh;
		   background-position: center;
		   background-image:url(images/Orderconfirmed.png);
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

   <%
   CustomerBean cbean=(CustomerBean)session.getAttribute("cbean");
   ProductBean pbean=(ProductBean)request.getAttribute("pbean");
   int rqnty=(int)request.getAttribute("rqnty");   
   out.println("<br><h2><mark>Hello "+cbean.getFname()+" your order confirmed</mark></h2><br> ");
   out.println("<div><h2>");
   out.println("<table  cellspacing='10'> <tr>  <td >Date : "+LocalDate.now()+"</td> <td colspan='2' >Time : "+ LocalTime.now()+"</td>    </tr> ");
   out.println("<tr>  <td>Product Name</td> <th>No.of Qnty</th>  <th>Price</th>    </tr>");
   out.println("<tr>  <td>"+pbean.getPname()+" </td> <th>"+rqnty+"</th> <th>"+pbean.getPprice()+"</tr>");
   int bill=Integer.parseInt(pbean.getPprice()) *rqnty;
   int discount=0;
   if(bill<10000)
   {
	   discount=(5*bill)/100;
	   bill=bill-discount;
   }
   if(bill>10000)
   {
	  discount=(10*bill)/100;
	   bill=bill-discount;
   }
   out.println("<tr>  <td >Discount availed :</td><td></td> <th>"+discount+"</th>    </tr>");
   out.println("<tr>  <td >Total amount charged :</td><td></td> <th>"+bill+"</th>    </tr>");
   
   %>
   </table>
  
</div>
        <br>
        
        <h2> <a href="Logout">Logout</a>  </h2><br>

</body>
</html>