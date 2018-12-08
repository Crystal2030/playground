package com.study.servlet.dao;

import com.study.servlet.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonDao {
    List<Person> loadPersons();

    int insertOnePerson(@Param("name") String name,
                        @Param("age") int age);

    int deleteOnePerson(@Param("id") int id);

    int truncateTable();
}
