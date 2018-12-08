package com.study.servlet;

import com.opensymphony.xwork2.ActionSupport;
import com.study.servlet.dao.PersonDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public abstract class BaseActionWithDao extends ActionSupport {
    static PersonDao personDao;

    private static SqlSession sqlSession;

    static {
        try {
            String resource = "config/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            personDao = sqlSession.getMapper(PersonDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String execute() {
        String result = doExecute();
        sqlSession.commit();
        return result;
    }

    protected abstract String doExecute();
}
