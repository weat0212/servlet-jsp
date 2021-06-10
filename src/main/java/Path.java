import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author I-Chung, Wang
 * @date 2021/6/10 下午 09:17
 */

@WebServlet("/servlet/*")
public class Path extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Path Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.printf("%s<br>", req.getRequestURI());
        out.printf("%s<br>", req.getContextPath());
        out.printf("%s<br>", req.getServletPath());
        out.print(req.getPathInfo());
        out.print("</body>");
        out.print("</html>");
    }
}
