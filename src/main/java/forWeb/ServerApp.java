package forWeb;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8082);
        ServletContextHandler sch = new ServletContextHandler();
        sch.addServlet(new ServletHolder(new CalculatorServlet()),"/hello1/*");

        server.setHandler(sch);
        server.start();
        server.join();
    }
}
