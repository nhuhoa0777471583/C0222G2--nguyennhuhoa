package servlet;

import controler.Calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servlet.CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double first = Double.parseDouble(request.getParameter("firstOperand"));
        Double second = Double.parseDouble(request.getParameter("sencondOperand"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        Double result = Calculator.calculate(first, second, operator);




        try {
            writer.println(first + " " + operator + " " + second + " = " + result);
        } catch (Exception ex) {
            writer.println("Error: " + ex.getMessage());
        }
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("result", result);
        request.getRequestDispatcher("index.jsp").forward(request, response);
        writer.println("<h2>Result: " + result + "</h2 >";
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
