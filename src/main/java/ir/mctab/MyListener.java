package ir.mctab;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Hey, Stopped!!!");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Hey , Started!!!!!");

    }
}
