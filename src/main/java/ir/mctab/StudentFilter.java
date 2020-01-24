package ir.mctab;

import javax.servlet.*;
import java.io.IOException;

public class StudentFilter implements Filter {

    public void destroy() {
        System.out.println("inside destroy method filter");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
    String param1 = req.getParameter("student");
        if(param1.equals("rahmani")){
            chain.doFilter(req, resp);
        }
        System.out.println("inside do filter method Student");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("dehghani filter init");
    }

}
