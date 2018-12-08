package com.study.servlet;

import com.study.servlet.factory.DaoFactory;
import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BatchInsertServlet extends VelocityViewServlet {

    @Override
    public Template handleRequest(HttpServletRequest request, HttpServletResponse response, Context context) {
        try {
            FileInputStream fileInputStream = new FileInputStream("scripts/sql/data.txt");
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] info = line.split(" ");
                DaoFactory.insertOnePerson(info[0], Integer.parseInt(info[1]));
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        context.put("personList", DaoFactory.loadPersons());
        return getTemplate("show.vm");
    }
}
