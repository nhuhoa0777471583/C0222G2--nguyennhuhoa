import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        Float price = Float.parseFloat(request.getParameter("price"));
        Float precent = Float.parseFloat(request.getParameter("precent"));
        double discountAmount = price * precent * 0.01;
        double total = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("Product Description:"+description);
        writer.println("List Price :"+price);
        writer.println("Discount Percent:"+precent);
        writer.println("Price_Discount:"+discountAmount);
        writer.println("Total: "+total);


    }
}
