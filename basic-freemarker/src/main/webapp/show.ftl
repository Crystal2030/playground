<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<table border="5px">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
<#list personList as person>
    <tr>
        <td>${person.id}</td>
        <td>${person.name}</td>
        <td>${person.age}</td>
        <td><a href="delete?id=${person.id}">删除此记录</a></td>
    </tr>
</#list>
</table>
<p>
    <a href="choose">choose</a>
</p>
</body>
</html>