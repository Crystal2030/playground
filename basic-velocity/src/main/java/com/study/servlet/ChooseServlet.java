package com.study.servlet;

import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChooseServlet extends VelocityViewServlet {
    @Override
    public Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context context) {
        return getTemplate("choose.vm");
    }
}
