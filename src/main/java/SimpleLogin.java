import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author I-Chung, Wang
 * @date 2021/6/12 下午 08:46
 */

@WebServlet("/login")
public class SimpleLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("username");
        String password = req.getParameter("password");

        if (name.equals("Andy") && password.equals("123")) {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Login Success</title>");
            out.print("</head>");
            out.print("<body>");
            out.println(name + "登入成功");
            out.print("</body>");
            out.print("</html>");
        } else {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Login Fails</title>");
            out.print("</head>");
            out.print("<body>");
            out.println("登入失敗</br></br>");
            out.println("<a href='simple-login.html'/>回前一頁");
            out.print("</body>");
            out.print("</html>");
        }
        out.close();
    }
}
