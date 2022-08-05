package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Math.pow;

@WebServlet("/BMIController")
public class BMIController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter output = response.getWriter();
        int weight = Integer.parseInt(request.getParameter("weight"));
        double height = Integer.parseInt(request.getParameter("height"));
        double meter = height/100;
        double BMIScore = weight / pow(meter, 2);
        request.setAttribute("bmi", BMIScore);
        request.getRequestDispatcher("calorimeter.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}