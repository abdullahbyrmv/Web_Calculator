<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI Result Page</title>
</head>
<body>
<center>
    <h3>Your BMI score is <%=request.getAttribute("bmi")%>
    </h3>
    <form action = "BMIController" method = "post">
        <input type="submit" name = "return" value = "return to main page"/>
    </form>
</center>
</body>
</html>
