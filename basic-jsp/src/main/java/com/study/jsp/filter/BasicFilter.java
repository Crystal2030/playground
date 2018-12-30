package com.study.jsp.filter;

import javax.servlet.*;
import java.io.IOException;

public class BasicFilter implements Filter {
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        String filterName = filterConfig.getFilterName();
        System.out.println(String.format("已经进入 %s 的 doFilter", filterName));
        chain.doFilter(req, res);
        System.out.println(String.format("即将离开 %s 的 doFilter", filterName));
    }

    @Override
    public void destroy() {

    }
}
