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
	  	    
	 
	 
	 
</style>

</head>
<body>
<center>

<div>
<%
   session.invalidate();
   out.println("Logged out succesfully");
%>
</div>


 <jsp:include page="index.html"></jsp:include>
   
   


</body>
</html>