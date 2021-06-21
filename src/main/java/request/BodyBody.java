package request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/postbody")
public class BodyBody extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.println(bodyContent(req.getReader()));
        out.print("<body>");
        out.print("</body>");
        out.print("</html>");
    }

    private String bodyContent(BufferedReader reader) throws IOException {

        String input = null;
        StringBuilder requestBody = new StringBuilder();
        while((input = reader.readLine()) != null) {
            requestBody.append(input).append("<br>");
        }
        return requestBody.toString();
    }
}
