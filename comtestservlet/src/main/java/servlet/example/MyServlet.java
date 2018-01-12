package servlet.example;

import methods.Calculator;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int result;
        PrintWriter out = resp.getWriter();
        try {
            result = Calculator.evaluate("5+5");
            out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        PrintWriter out = res.getWriter();
//
//        out.println("World World");
//    }
}