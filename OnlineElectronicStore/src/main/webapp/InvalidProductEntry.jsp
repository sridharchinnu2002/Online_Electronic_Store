<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InvalidProductEntry</title>
</head>
<body>

<%
    String message1 = "Product Details cannot be empty All the feilds are mandetory..!!";
 //  String invalidentry=(String)request.getAttribute("invalid");

%>

<script type="text/javascript"> 
    alert("<%= message1 %>");
    window.location.href = "AddProduct.html";
    
</script>

</body>
</html>