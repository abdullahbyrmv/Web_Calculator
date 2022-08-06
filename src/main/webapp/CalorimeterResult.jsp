<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calorimeter Result Page</title>
</head>
<body>
<center>
    <h3>Your Daily Calorie need is <%=request.getAttribute("result")%>
    </h3>
    <form action = "calorimeterController" method = "get">
        <input type="submit" name = "return" value = "return to main page"/>
    </form>
</center>
</body>
</html>
