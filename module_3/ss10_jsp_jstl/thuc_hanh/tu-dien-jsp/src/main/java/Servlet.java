import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "Servlet", urlPatterns = "/index")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dic = new HashMap<>();
        dic.put("hello", "xin chào");
        dic.put("goodbye", "tạm biệt");
        dic.put("how are you", "bạn có khoẻ không?");

        String search = request.getParameter("search");
        String result = dic.get(search);

        if (dic.equals(search)) {
            result = dic.get(search);
        }

        request.setAttribute("search", search);
        request.setAttribute("result", result);
        request.getRequestDispatcher("trans.jsp").forward(request, response);
    }
}
