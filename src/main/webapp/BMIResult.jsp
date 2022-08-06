<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BMI Result Page</title>
</head>
<body>
<center>
    <h3>Your BMI score is <%=request.getAttribute("bmi")%>
    </h3>
    <center>
        <h3><%=request.getAttribute("msg")%>
        </h3>
    </center>
    <form action="BMIController" method="post">
        <input type="submit" name="return" value="Return to main page"/>
    </form>
    <form action="AgainController" method="post">
        <input type="submit" name="calculateAgain" value="Calculate BMI again"/>
    </form>
</center>
</body>
</html>
