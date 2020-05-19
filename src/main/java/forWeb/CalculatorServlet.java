package forWeb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String string = request.getParameter("x");

        int x = Integer.parseInt(string);
        int y = Integer.parseInt(request.getParameter("y"));
        try (PrintWriter pw = response.getWriter()) {
            Map<String, String[]> params = request.getParameterMap();
            try {
                if (!request.getParameter("x").isEmpty() || !request.getParameter("y").isEmpty()) {

                    if (request.getParameter("op").equals("add")) {
                        pw.write(String.format("Add is %s", x + y));
                    } else if (request.getParameter("op").equals("sub")) {
                        pw.write(String.format("Sub is %s", x - y));

                    } else if (request.getParameter("op").equals("mul")) {
                        pw.write(String.format("Mul is %s", x * y));

                    } else if (request.getParameter("op").equals("div")) {
                        pw.write(String.format("Mul is %s", x / y));

                    }
                }
            } catch (NumberFormatException e) {
                pw.write("one of the parametrs is null");
            }
        }

    }
}
