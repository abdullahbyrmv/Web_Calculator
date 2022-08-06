package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import static java.lang.Math.pow;

@WebServlet("/BMIController")
public class BMIController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int weight = Integer.parseInt(request.getParameter("weight"));
        double height = Integer.parseInt(request.getParameter("height"));
        double meter = height/100;
        double BMIScore = weight / pow(meter, 2);
        request.setAttribute("bmi", BMIScore);
        request.getRequestDispatcher("BMIResult.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("mainPage.jsp").forward(request,response);
    }
}
