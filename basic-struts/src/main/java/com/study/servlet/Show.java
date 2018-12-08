package com.study.servlet;

import com.study.servlet.entity.Person;

import java.util.LinkedList;
import java.util.List;

public class Show extends BaseActionWithDao {
    private List<Person> personList = new LinkedList<Person>();

    @Override
    public String doExecute() {
        personList = personDao.loadPersons();
        return SUCCESS;
    }

    public List<Person> getPersonList() {
        return personList;
    }
}
