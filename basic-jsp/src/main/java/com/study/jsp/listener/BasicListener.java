package com.study.jsp.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class BasicListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println(servletRequestEvent.getServletRequest().getClass().getName());
        ServletContext context = servletRequestEvent.getServletContext();
        String s = (String) (context.getAttribute("count"));
        if (s == null) {
            s = "0";
        }
        int count = Integer.parseInt(s);
        System.out.println(count);
        context.setAttribute("count", "" + (++count));
    }
}
