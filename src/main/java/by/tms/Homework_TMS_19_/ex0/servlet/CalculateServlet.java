package by.tms.Homework_TMS_19_.ex0.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalculateServlet extends HttpServlet {
CalculateService fc=new CalculateService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int A=Integer.parseInt(req.getParameter("A"));
    int B=Integer.parseInt(req.getParameter("B"));
    String operation=req.getParameter("operation");
    double rez = fc.typeOperation(A,B,operation);
    resp.getWriter().println("Result: "+rez);
    }
}
