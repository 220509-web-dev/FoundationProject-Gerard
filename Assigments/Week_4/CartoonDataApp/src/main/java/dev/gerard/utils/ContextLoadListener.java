package dev.gerard.utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.gerard.servlets.UserServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoadListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce){
        //ServletContextListener.super.contextInitialized(sce);
        System.out.println("Servlet was Instantiated!!");
        ObjectMapper mapper = new ObjectMapper();
        UserServlet userservlet = new UserServlet(mapper);
        ServletContext context = sce.getServletContext();
        context.addServlet("UserServlet",userservlet).addMapping("/users/*.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("Servlet was destroyed!!");
    }

}
