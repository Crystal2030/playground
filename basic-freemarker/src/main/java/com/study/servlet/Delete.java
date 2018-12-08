package com.study.servlet;

public class Delete extends BaseActionWithDao {
    private int id;

    @Override
    public String doExecute() {
        if (id == 0) {
            return INPUT;
        }
        personDao.deleteOnePerson(id);
        return SUCCESS;
    }

    public void setId(int id) {
        this.id = id;
    }
}
