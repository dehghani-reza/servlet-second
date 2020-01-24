package ir.mctab;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JavaStudentFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        String param1 = req.getParameter("student");
        if(param1.equals("rahmani")){
            chain.doFilter(req, resp);
        }
        else
            ((HttpServletResponse) resp).sendRedirect("page");
        System.out.println("inside do filter method JavaStudent");
    }

    public void init(FilterConfig config) throws ServletException {
    }

}
