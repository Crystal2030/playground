<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show StackTrace</title>
</head>
<body>
<%
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
%>
<table border="5px" align="center">
    <tr>
        <th>ClassName</th>
        <th>MethodName</th>
        <th>LineNumber</th>
    </tr>
    <%
        for (StackTraceElement stackTraceElement : stackTraceElements) {
    %>
    <tr>
        <td>
            <%=stackTraceElement.getClassName()%>
        </td>
        <td>
            <%=stackTraceElement.getMethodName()%>
        </td>
        <td>
            <%=stackTraceElement.getLineNumber()%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
