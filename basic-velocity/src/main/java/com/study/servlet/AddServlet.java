package com.study.servlet;

import com.study.servlet.factory.DaoFactory;
import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends VelocityViewServlet {

    @Override
    public Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context context) {
        System.out.println("~~" + getServletConfig().getInitParameter("dog"));
        String name = request.getParameter("name");
        System.out.println(name);
        String age = request.getParameter("age");
        System.out.println(age);
        if (name != null && name.length() > 0 && age != null && age.length() > 0) {
            int n = DaoFactory.insertOnePerson(name, Integer.parseInt(age));
            System.out.println(n);
            context.put("personList", DaoFactory.loadPersons());
            return getTemplate("show.vm");
        }

        return getTemplate("add.vm");
    }
}
