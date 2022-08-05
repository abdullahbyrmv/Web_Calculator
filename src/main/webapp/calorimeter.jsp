<%@ page import="Controller.BMIController" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h3>Your BMI score is <%=request.getAttribute("bmi")%>
    </h3>
</center>
</body>
</html>
