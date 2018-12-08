package com.study.servlet;

import com.study.servlet.util.NaiveHtmlTemplate;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class InitParamServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        Enumeration<String> initParameterNames = getServletConfig().getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String key = initParameterNames.nextElement();
            String value = getServletConfig().getInitParameter(key);
            stringBuilder.append(String.format("<tr><td>%s</td><td>%s</td></tr>", key, value));
        }

        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.print(NaiveHtmlTemplate.fillHeadAndBody("<title>a title</title>",
                "<table border=\"5px\" align=\"center\">" +
                        "<tr>" +
                        "<th>Key</th>" +
                        "<th>Value</th>" +
                        "</tr>" + stringBuilder.toString() +
                        "</table>"));
    }
}
