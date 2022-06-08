package revature.data.utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import revature.data.daos.CartoonDAO;
import revature.data.daos.UserDAO;
import revature.data.filters.CustomFilter;
import revature.data.servlets.CartoonServlet;
import revature.data.servlets.UserServlet;
import javax.servlet.*;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.EnumSet;

public class ContextLoadListener implements ServletContextListener {
        ObjectMapper mapper = new ObjectMapper();
        UserServlet userservlet = new UserServlet(mapper);
    CartoonDAO cartoonDAO = new CartoonDAO();
    UserDAO userDoa = new UserDAO();
        CartoonServlet cartoonServlet = new CartoonServlet(mapper, cartoonDAO);
        CustomFilter customerFilter = new CustomFilter();





    @Override
    public void contextInitialized(javax.servlet.ServletContextEvent sce){

        System.out.println("Servlet was Instantiated!!");
        ServletContext context = sce.getServletContext();
        context.addServlet("userServlet",userservlet).addMapping("/users/*");
        context.addServlet("cartoonServlet",cartoonServlet).addMapping("/cartoons/*");
        context.addFilter("customFilter", customerFilter)
                .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("Servlet was destroyed!!");
    }


}
