<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Invalid Customer details</title>
</head>
<body>

<%
    String message = "Customer Details cannot be empty All the feilds are mandetory..!!";
    
%>

<script type="text/javascript">
    alert("<%= message %>");
</script>
     <jsp:include page="Register.html"></jsp:include>
</body>
</html>