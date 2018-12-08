package com.study.servlet;

import com.study.servlet.factory.DaoFactory;
import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowServlet extends VelocityViewServlet {

    @Override
    public Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context context) {
        context.put("personList", DaoFactory.loadPersons());
        return getTemplate("show.vm");
    }
}
