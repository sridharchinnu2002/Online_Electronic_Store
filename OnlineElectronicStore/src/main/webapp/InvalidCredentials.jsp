<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
    String message1 = "Invalid Username/Password";
%>

<script type="text/javascript"> 
    alert("<%= message1 %>");
    window.location.href = "index.html";
    
</script>

</body>
</html>