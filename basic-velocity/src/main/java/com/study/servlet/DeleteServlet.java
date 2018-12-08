package com.study.servlet;

import com.study.servlet.factory.DaoFactory;
import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends VelocityViewServlet {

    @Override
    public Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context context) {
        String id = request.getParameter("id");
        if (id == null || id.length() == 0) {
            return getTemplate("delete.vm");
        }
        System.out.println(id);
        DaoFactory.deleteOnePerson(Integer.parseInt(id));
        context.put("personList", DaoFactory.loadPersons());
        return getTemplate("show.vm");
    }
}
