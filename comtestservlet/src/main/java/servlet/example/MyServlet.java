package servlet.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int result;
        String expression = req.getParameter("name");
        //resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        try {
            result = Calculator.evaluate(expression);
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