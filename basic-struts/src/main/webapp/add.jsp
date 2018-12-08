<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>增</title>
    <s:head/>
</head>
<body>
<p>
    <s:form action="add">
        <s:textfield name="name" label="姓名"/>
        <s:textfield name="age" label="年龄"/>
        <s:submit value="Submit"/>
    </s:form>
</p>
<p>
    <a href="<s:url action='choose'/>">choose</a>
</p>
</body>
</html>