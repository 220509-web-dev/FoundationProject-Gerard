package revature.data.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import revature.data.daos.CartoonDAO;
import revature.data.daos.UserDAO;
import revature.data.filters.CustomFilter;
import revature.data.servlets.AuthServlet;
import revature.data.servlets.CartoonServlet;
import revature.data.servlets.UserServlet;
import javax.servlet.*;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.EnumSet;

public class ContextLoadListener implements ServletContextListener {


    ObjectMapper mapper = new ObjectMapper();
    UserDAO userDAO = new UserDAO();
    CartoonDAO cartoonDAO = new CartoonDAO();

    CustomFilter customerFilter = new CustomFilter();
    UserServlet userservlet = new UserServlet(mapper, userDAO);
    CartoonServlet cartoonServlet = new CartoonServlet(mapper, cartoonDAO);
    AuthServlet authServlet = new AuthServlet();


    @Override
    public void contextInitialized(javax.servlet.ServletContextEvent sce) {

        System.out.println("Servlet was Instantiated!!");
        ServletContext context = sce.getServletContext();
        context.addServlet("authenticationServlet",authServlet).addMapping("/authentication/*");
        context.addServlet("userServlet", userservlet).addMapping("/users/*");
        context.addServlet("cartoonServlet", cartoonServlet).addMapping("/cartoons/*");
        context.addFilter("customFilter", customerFilter)
                .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Servlet was destroyed!!");
    }

}
