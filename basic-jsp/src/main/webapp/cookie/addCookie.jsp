<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie cookie = new Cookie("a_test_which_is_not_so_naive", "Some_arbitrary_stuff_here");
    response.addCookie(cookie);
%>
<a href="showCookie">展示 cookie</a>
</body>
</html>
