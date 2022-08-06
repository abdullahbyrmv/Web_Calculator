package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.DecimalFormat;

import static java.lang.Math.pow;

@WebServlet("/BMIController")
public class BMIController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DecimalFormat formatter = new DecimalFormat("00.0");
        int weight = Integer.parseInt(request.getParameter("weight"));
        double height = Integer.parseInt(request.getParameter("height"));
        double meter = height / 100;
        double BMIScore = weight / pow(meter, 2);
        String message = "";
        String formattedBMIScore = formatter.format(BMIScore);

        if (Double.parseDouble(formattedBMIScore) < 18.5) {
            message += "You are underweight";
        } else if (Double.parseDouble(formattedBMIScore) >= 18.5 && Double.parseDouble(formattedBMIScore) < 25.0) {
            message += "You are healthy and your weight is normal";
        } else if (Double.parseDouble(formattedBMIScore) >= 25.0 && Double.parseDouble(formattedBMIScore) < 30.0) {
            message += "You are overweight";
        } else if (Double.parseDouble(formattedBMIScore) >= 30.0) {
            message += "You are obese";
        }
        request.setAttribute("msg", message);
        request.setAttribute("bmi", formattedBMIScore);
        request.getRequestDispatcher("BMIResult.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("mainPage.jsp").forward(request, response);
    }
}
