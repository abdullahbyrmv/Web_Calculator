<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calorimeter</title>
</head>
<body>
<center>
    <form action="calorimeterController" method="post">
        Please Select Your Gender : <input type="radio" value="man" name="gender"/> Man
        <input type="radio" value="woman" name="gender"/> Woman
        <br>
        <br>
        Enter Weight: <input type="text" name="weight" id="weight"/>
        <br>
        <br>
        Enter Height: <input type="text" name="height" id="height"/>
        <br>
        <br>
        Enter Age: <input type="text" name="age" id="age"/>
        <br>
        <br>
        How Active You Are: <input type="radio" value="sedentary" name="activeness"/>Sedentary (little or no exercise)
        <input type="radio" value="lightly" name="activeness"/>Lightly active (exercise 1–3 days/week)
        <input type="radio" value="moderately" name="activeness"/>Moderately active (exercise 3–5 days/week)
        <input type="radio" value="active" name="activeness"/>Active (exercise 6–7 days/week)
        <input type="radio" value="very active" name="activeness"/>Very active (hard exercise 6–7 days/week)
        <br>
        <br>
        <input type="submit" value="Calculate" name="submit"/>
    </form>
</center>
</body>
</html>
