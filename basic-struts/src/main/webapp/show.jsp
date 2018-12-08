<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<table border="5px" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
    <s:iterator value="personList">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="age"/></td>
            <s:url action="delete" var="deleteLink">
                <s:param name="id"><s:property value="id"/></s:param>
            </s:url>
            <td><a href="${deleteLink}">删除此记录</a></td>
        </tr>
    </s:iterator>
</table>
<p align="center">
    <a href="<s:url action='choose'/>">choose</a>
</p>
</body>
</html>