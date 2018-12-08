package com.study.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class StackTraceServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter writer = res.getWriter();
        StringBuilder stringBuilder = new StringBuilder();

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int i = 0;
        for (StackTraceElement stackTraceElement : stackTraceElements) {
            stringBuilder.append(String.format("<tr><td>%s</td><td>%s</td><td>%s</td><td>%s</td></tr>\n",
                    ++i,
                    stackTraceElement.getClassName(),
                    stackTraceElement.getMethodName(),
                    stackTraceElement.getLineNumber()));
        }

        writer.print("<html>\n" +
                "<head>" +
                "<title>a title</title>" +
                "</head>\n" +
                "<body>\n" +
                "<table border=\"5px\" align=\"center\">\n" +
                "<tr>" +
                "<th>编号</th>" +
                "<th>ClassName</th>" +
                "<th>MethodName</th>" +
                "<th>LineNumber</th>" +
                "</tr>\n" + stringBuilder.toString() +
                "</table>\n" +
                "</body>\n" +
                "</html>");
    }
}
