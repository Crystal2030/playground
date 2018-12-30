<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="5px">
    <tr>
        <th>Name</th>
        <th>Value</th>
    </tr>
    <%
        for (Cookie cookie : request.getCookies()) {
    %>
    <tr>
        <td>
            <%=cookie.getName()%>
        </td>
        <td>
            <%=cookie.getValue()%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
