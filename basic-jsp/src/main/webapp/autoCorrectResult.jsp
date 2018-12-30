<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="5px" align="center">
    <tr>
        <th>name</th>
        <th>value(after correction)</th>
    </tr>
    <%
        Enumeration<String> e = request.getParameterNames();
        while (e.hasMoreElements()) {
            String s = e.nextElement();
    %>
    <tr>
        <td>
            <%=s%>
        </td>
        <td>
            <%=request.getParameter(s)%>
        </td>
    </tr>
    <%
        }
    %>
</table>

</body>
</html>
