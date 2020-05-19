package forWeb.day02;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server= new Server(8088);
        ServletContextHandler handler = new ServletContextHandler();
        TemplateEngine engine = TemplateEngine.folder("./content");
        handler.addServlet(new ServletHolder(new FullnameServlet(engine)),"/users2/*");
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
