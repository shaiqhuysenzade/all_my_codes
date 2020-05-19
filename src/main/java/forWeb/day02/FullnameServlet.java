package forWeb.day02;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class FullnameServlet extends HttpServlet {
    TemplateEngine engine;

    public FullnameServlet(TemplateEngine engine) {
        this.engine = engine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (OutputStream os = resp.getOutputStream()) {
            Files.copy(Paths.get("content", "users2.ftl"), os);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fname");
        String sname = req.getParameter("lname");
        String fullname = name + " " + sname;
        HashMap<String, Object> root = new HashMap<>();
        root.put("user",fullname);
        engine.render("userName.ftl",root,resp);

    }
}
