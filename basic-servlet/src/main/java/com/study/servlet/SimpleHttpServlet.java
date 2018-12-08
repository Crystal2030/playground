package com.study.servlet;

import com.study.servlet.util.NaiveHtmlTemplate;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleHttpServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.print(NaiveHtmlTemplate.fillBody("<p>It is a get request</p>"));
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.print(NaiveHtmlTemplate.fillBody("<p>It is a post request</p>"));
    }
}
