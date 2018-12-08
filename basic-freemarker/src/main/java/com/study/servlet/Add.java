package com.study.servlet;

public class Add extends BaseActionWithDao {

    private String name;

    private int age;

    @Override
    public String doExecute() {
        if (name != null && name.length() > 0 && age > 0) {
            int n = personDao.insertOnePerson(name, age);

            System.out.println(n);
            return SUCCESS;
        }
        return INPUT;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
