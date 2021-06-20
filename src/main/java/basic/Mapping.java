package basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author I-Chung, Wang
 * @date 2021/6/10 下午 09:33
 */

@WebServlet("/mapping/*")
public class Mapping extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpServletMapping mapping = req.getHttpServletMapping();
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>basic.Mapping Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.printf("%s<br>", mapping.getMappingMatch());
        out.printf("%s<br>", mapping.getMatchValue());
        out.print(mapping.getPattern());
        out.print("</body>");
        out.print("</html>");
    }
}
