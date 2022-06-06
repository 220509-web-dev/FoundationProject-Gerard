package revature.data.utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import revature.data.servlets.UserServlet;
import javax.servlet.*;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoadListener implements ServletContextListener {

    @Override
    public void contextInitialized(javax.servlet.ServletContextEvent sce){
        //ServletContextListener.super.contextInitialized(sce);
        System.out.println("Servlet was Instantiated!!");
        ObjectMapper mapper = new ObjectMapper();
        UserServlet userservlet = new UserServlet(mapper);
        ServletContext context = sce.getServletContext();
        context.addServlet("UerServlet",userservlet).addMapping("/users/*");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("Servlet was destroyed!!");
    }


}
