package com.study.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by jinyang on 2018/12/8.
 */
public class NaiveFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("check the param-value of naiveParam");
        System.out.println(filterConfig.getInitParameter("naiveParam"));
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
