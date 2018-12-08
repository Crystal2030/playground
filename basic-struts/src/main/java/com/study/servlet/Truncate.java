package com.study.servlet;

public class Truncate extends BaseActionWithDao {
    @Override
    public String doExecute() {
        int n = personDao.truncateTable();
        System.out.println(n);
        return SUCCESS;
    }
}
