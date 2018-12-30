package com.study.jsp.filter;

import com.study.jsp.wrapper.BasicHttpRequestWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class AutoCorrectFilter implements Filter {
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        chain.doFilter(new BasicHttpRequestWrapper(req), response);
    }

    @Override
    public void destroy() {

    }

    public static void main(String[] args) {

    }
}
