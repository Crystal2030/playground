<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.TreeMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Header</title>
    <style>
        table, caption, tr {
            border: groove 5px lightcoral;
        }
        table {
            collapse: collapse;
        }
        tr > th {
            background-color: azure;
        }

        tr > td {
            background-color: antiquewhite;
        }
    </style>
</head>
<body>
<%
    Enumeration headerNames = request.getHeaderNames();
%>
<table align="center">
    <caption>Http 请求中的 header</caption>
    <tr>
        <th>key</th>
        <th>value</th>
    </tr>
    <%
        TreeMap<String, String> treeMap = new TreeMap<>();
        while (headerNames.hasMoreElements()) {
            String headerName = (String) headerNames.nextElement();
            treeMap.put(headerName, request.getHeader(headerName));
        }

        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
    %>
    <tr>
        <td>
            <%=entry.getKey()%>
        </td>
        <td>
            <%=entry.getValue()%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
