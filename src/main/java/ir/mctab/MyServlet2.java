package ir.mctab;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("login");
        HttpSession httpSession = req.getSession();
        httpSession.setAttribute("uname",username);

        out.print("<html>");
        out.print("<head>");
        out.print("<title>MR. JOKER</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>HELLO! Rahmani </h1>");
        out.print("<a href=\"page\">link text</a>");
        String age = this.getServletConfig().getInitParameter("age");
        out.println("<h1>"+age+"</h1>");
        String course = this.getServletContext().getInitParameter("course");
        out.println("<h2>"+course+"</h2>");
        String teacher = this.getServletContext().getInitParameter("teacher");
        out.println("<h2>"+teacher+"</h2>");
        out.print("</body>");
        out.print("</html>");

    }

}
