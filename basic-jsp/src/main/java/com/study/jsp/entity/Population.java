package com.study.jsp.entity;

public class Population {
    /**
     * 排名
     */
    private int rank;

    /**
     * 国名
     */
    private String country;

    /**
     * 人口的近似值
     */
    private int population;


    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
