package by.tms.Homework_TMS_19_.ex1.servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    InMemoryStorage inMemoryStorage=new InMemoryStorage();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String userName=req.getParameter("userName");
        String password=req.getParameter("password");
        resp.getWriter().println(inMemoryStorage.userRegistration(name,userName,password));
    }
}
