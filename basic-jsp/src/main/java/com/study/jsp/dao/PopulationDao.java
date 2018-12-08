package com.study.jsp.dao;

import com.study.jsp.entity.Population;

import java.util.List;

public interface PopulationDao {
    List<Population> loadPopulation();
}
