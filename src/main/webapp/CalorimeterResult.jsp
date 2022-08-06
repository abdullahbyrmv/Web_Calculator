<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calorimeter Result Page</title>
</head>
<body>
<center>
    <h3>Your Daily Calorie need is <%=request.getAttribute("result")%>
    </h3>
    <form action="calorimeterController" method="get">
        <input type="submit" name="return" value="Return to main page"/>
    </form>
    <form action="AgainController" method="get">
        <input type="submit" name="calculateAgain" value="Calculate calorie intake again"/>
    </form>
</center>
</body>
</html>
