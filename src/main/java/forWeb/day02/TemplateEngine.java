package forWeb.day02;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class TemplateEngine {
    private final Configuration configuration;

    public TemplateEngine(String root_location) throws IOException {
        this.configuration = new Configuration(Configuration.VERSION_2_3_29) {{
            setDirectoryForTemplateLoading(new File(root_location));
            setDefaultEncoding(String.valueOf(StandardCharsets.UTF_8));
            setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            setLogTemplateExceptions(false);
            setWrapUncheckedExceptions(true);
        }};
    }

    public static TemplateEngine folder(String root_location) throws IOException {
        return new TemplateEngine(root_location);
    }

    public void render(String templateFile, HashMap<String, Object> root, HttpServletResponse response) {
        response.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
        try (PrintWriter pw = response.getWriter()) {
            configuration.getTemplate(templateFile).process(root, pw);
        } catch (TemplateException | IOException ex) {
            throw new RuntimeException("Formatter error", ex);
        }
    }
}
