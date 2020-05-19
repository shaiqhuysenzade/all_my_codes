package forWeb.day01;

import forWeb.day01.entity.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FreeMarkerServlet extends HttpServlet {
    TemplateEngine templateEngine;

    public FreeMarkerServlet(TemplateEngine engine) {
        this.templateEngine = engine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = "Shaiq , ayeeeeeeeeeeeeeeee ";
        List<Person> list = Arrays.asList(
                new Person("Shaiq", "Huseynzade", 20),
                new Person("Vusal", "Memmedov", 23),
                new Person("Eli", "Huseynov", 27),
                new Person("Rufet", "Bagirov", 22)
        );
        HashMap<String, Object> root = new HashMap<>();
        root.put("people", list);

        templateEngine.render("users.ftl", root, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    }
}
