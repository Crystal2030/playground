<%--
  Created by IntelliJ IDEA.
  User: jinyang
  Date: 2018/12/12
  Time: 上午9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Cookie[] cookies = request.getCookies();
    int previous = 0;
    for (Cookie cookie : cookies) {
        if (cookie.getName().equals("naiveCount")) {
            previous = Integer.parseInt(cookie.getValue());
            break;
        }
    }
    Cookie cookie = new Cookie("naiveCount", "" + (previous + 1));
    response.addCookie(cookie);
%>
<a href="showCookie">展示 cookie</a>
</body>
</html>
