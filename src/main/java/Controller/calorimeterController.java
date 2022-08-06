package Controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/calorimeterController")
public class calorimeterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("mainPage.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gender = request.getParameter("gender");
        int weight = Integer.parseInt(request.getParameter("weight"));
        int height = Integer.parseInt(request.getParameter("height"));
        int age = Integer.parseInt(request.getParameter("age"));
        String activeness = request.getParameter("activeness");
        long result = 0;
        double final_result = 0;
        if(gender.equalsIgnoreCase("man")){
            result = (long) (655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age));
        } else if(gender.equalsIgnoreCase("woman")){
            result = (long) (66.47 + (13.75 * weight) + (5.003 * height) - (6.755 * age));
        }

        if(activeness.equalsIgnoreCase("sedentary")){
            final_result = result * 1.2;
        } else if(activeness.equalsIgnoreCase("lightly")){
            final_result = result * 1.375;
        } else if(activeness.equalsIgnoreCase("moderately")){
            final_result = result * 1.55;
        } else if(activeness.equalsIgnoreCase("active")){
            final_result = result * 1.725;
        } else if (activeness.equalsIgnoreCase("very active")){
            final_result = result * 1.9;
        }
        request.setAttribute("result",final_result);
        request.getRequestDispatcher("CalorimeterResult.jsp").forward(request,response);
    }
}
