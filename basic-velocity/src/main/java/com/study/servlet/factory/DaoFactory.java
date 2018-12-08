package com.study.servlet.factory;

import com.study.servlet.dao.PersonDao;
import com.study.servlet.entity.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DaoFactory {
    private static PersonDao personDao;
    private static SqlSession sqlSession;

    static {
        try {
            String resource = "config/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession = sqlSessionFactory.openSession();
            personDao = sqlSession.getMapper(PersonDao.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int insertOnePerson(String name, int age) {
        int n = personDao.insertOnePerson(name, age);
        sqlSession.commit();
        return n;
    }

    public static int deleteOnePerson(int id) {
        int n = personDao.deleteOnePerson(id);
        sqlSession.commit();
        return n;
    }

    public static List<Person> loadPersons() {
        return personDao.loadPersons();
    }

    public static int truncateTable() {
        int n = personDao.truncateTable();
        sqlSession.commit();
        return n;
    }
}
