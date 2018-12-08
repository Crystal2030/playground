<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>请选择</title>
</head>
<body>
<p>
    <a href="add.jsp">添加一条记录</a>
</p>
<p>
    <a href="<s:url action='show'/>">展示现有数据</a>
</p>
<p>
    <a href="<s:url action='truncate'/>">truncate</a>
</p>
<p>
    <a href="<s:url action='batchInsert'/>">批量 insert</a>
</p>
</body>
</html>