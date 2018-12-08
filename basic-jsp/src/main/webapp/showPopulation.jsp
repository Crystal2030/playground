<%@ page import="com.study.jsp.dao.PopulationDao" %>
<%@ page import="com.study.jsp.entity.Population" %>
<%@ page import="org.apache.ibatis.io.Resources" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactoryBuilder" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.InputStream" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show</title>
</head>
<body>
<table border="5px" align="center">
    <caption>各国人口排名</caption>
    <tr>
        <th>Rank</th>
        <th>Country</th>
        <th>Population</th>
    </tr>
    <%
        PopulationDao populationDao = null;
        try {
            String resource = "config/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            populationDao = sqlSession.getMapper(PopulationDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<Population> populationList = new LinkedList<>();
        if (populationDao != null) {
            populationList = populationDao.loadPopulation();
        }
        for (Population population : populationList) {
    %>
    <tr>
        <td>
            <%=population.getRank()%>
        </td>
        <td>
            <%=population.getCountry()%>
        </td>
        <td align="right">
            <%=population.getPopulation()%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
