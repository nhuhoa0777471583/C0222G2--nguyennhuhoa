import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = "/converter")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double rate = Double.parseDouble(request.getParameter("rate"));
        Double usd = Double.parseDouble(request.getParameter("usd"));
        double converter = rate * usd ;
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("rate" + rate);
//        writer.println("<br>");
//        writer.println("usd" + usd);
//        writer.println("<br>");
//        writer.println("converter" + converter);
//        writer.println("</html>");

        request.setAttribute("rate", rate);
        request.setAttribute("usd", usd);
        request.setAttribute("converter", converter);

        request.getRequestDispatcher("culcaltor.jsp").forward(request,response);
    }
}
