package com.study.servlet;

public class Add extends BaseActionWithDao {

    private String name;

    private int age;

    @Override
    public void validate() {
        if (name == null || name.length() == 0) {
            addFieldError("name", "name 不能为空");
        }
        if (age <= 0) {
            addFieldError("age", "age 应当大于 0");
        }
    }

    @Override
    public String doExecute() {
        int n = personDao.insertOnePerson(name, age);
        System.out.println(n);
        return SUCCESS;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
