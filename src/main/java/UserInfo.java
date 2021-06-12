import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author I-Chung, Wang
 * @date 2021/6/12 下午 07:33
 */

@WebServlet("/user")
public class UserInfo extends HttpServlet {
    // When users request for this servlet, show their IP, Time, Query String

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ip = req.getRemoteAddr();
        long time = req.getDateHeader("If-Modified-Since");
        String query = req.getQueryString();
        Date date = new Date(time * 1000);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        System.out.println("User IP: " + ip);
        System.out.println("Time: " + format.format(date));
        System.out.println("Query String: " + query);

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<title>User Information</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("</br>IP: " + ip);
        out.print("</br>Time: " + format.format(date));
        out.print("</br>Query String: " + query);
        out.print("</body>");
        out.print("</html>");
    }

}
