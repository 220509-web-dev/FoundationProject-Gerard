package dev.gerard.servlets;
import dev.gerard.app.User;
import dev.gerard.utils.ContextLoadListener;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;





public class UserServlet extends HttpServlet {

    private final ObjectMapper mapper;
        public UserServlet(ObjectMapper mapper){
            this.mapper = mapper;
        }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException
    {
        super.doGet(req,resp);
        System.out.println("[LOG] - User Servlet received a post request at" + LocalDateTime.now());
        User someUser = new User(999, "Alice", "Anderson", "aanderson@revature.com","password");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        super.doPost(request,response);

         System.out.println("[LOG] - User Servlet received a post request at" + LocalDateTime.now());

         /*try{
            ObjectMapper mapper1 = new ObjectMapper();
            User newUser = mapper1.readValue(request.getInputStream(),User.class);
            System.out.println(newUser);
        }catch (Exception e){
            e.printStackTrace();
        }
*/
    }


    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        super.doPut(request,response);
    }

    @Override
    protected  void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        super.doDelete(request,response);
    }

}
