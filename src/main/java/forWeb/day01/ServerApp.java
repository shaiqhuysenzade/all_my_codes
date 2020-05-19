package forWeb.day01;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.MultipartConfigElement;
import java.io.IOException;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8088);
        ServletContextHandler svh = new ServletContextHandler();

        TemplateEngine engine = TemplateEngine.folder("./content");
        svh.addServlet(new ServletHolder(new FreeMarkerServlet(engine)), "/users/*");
        svh.addServlet(UploadServlet.class, "/upload/*")
                .getRegistration().setMultipartConfig(new MultipartConfigElement("./from_user"));
        server.setHandler(svh);
        server.start();
        server.join();
    }
}
