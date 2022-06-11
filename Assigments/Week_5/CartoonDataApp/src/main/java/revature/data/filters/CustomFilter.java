package revature.data.filters;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomFilter extends HttpFilter {


   @Override
    public void init() throws ServletException{
        System.out.println("[LOG]-CustomFilter intercepted: " + getServletContext());

        }


    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
    req.setAttribute("Was Filtered ", true);
    res.addHeader("Access-Control-Allow-Origin","*");
    res.addHeader("Access-Control-Allow-Headers","Content-Type");
    chain.doFilter(req,res);



    }




}

