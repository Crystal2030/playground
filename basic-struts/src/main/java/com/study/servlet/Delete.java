package com.study.servlet;

public class Delete extends BaseActionWithDao {

    private int id;

    @Override
    public String doExecute() {
        personDao.deleteOnePerson(id);
        return SUCCESS;
    }

    public void setId(int id) {
        this.id = id;
    }
}
