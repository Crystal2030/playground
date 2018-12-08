package com.study.servlet;

import com.study.servlet.util.NaiveHtmlTemplate;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class BasicServlet implements Servlet {
    private ServletConfig servletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String servletName = getServletConfig().getServletName();
        res.setContentType("text/html");

        PrintWriter writer = res.getWriter();

        writer.print(NaiveHtmlTemplate.fillHeadAndBody("<title>a title</title>",
                String.format("<p>Hello from %s</p>", servletName)));
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
    }
}
