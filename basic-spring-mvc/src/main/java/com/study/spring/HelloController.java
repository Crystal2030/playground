package com.study.spring;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("~~");
        ModelAndView modelAndView = new ModelAndView("/hello.jsp");
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}
