<%@ page import="org.joda.time.DateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>标题</title>
</head>
<body>
<%!
    /**
     * 求两整数和
     * @param a 其中的一个整数
     * @param b 另一个整数
     * @return 和
     */
    private int sum(int a, int b) {
        return a + b;
    }
%>
<%
    DateTime dateTime = new DateTime();
%>
<p>
    一道简单的题目:<br/>
    <%
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
    %>
    <%=a%> + <%=b%> = <%=sum(a, b)%><br/>
    <%
        pageContext.setAttribute("a", a, PageContext.PAGE_SCOPE);
        pageContext.setAttribute("b", b, PageContext.REQUEST_SCOPE);
    %>
    <!-- 下一行使用了 EL 表达式 -->
    ${pageScope.a} + ${requestScope.b} = ${pageScope.a + requestScope.b}
</p>
<p>
    今天是<%=dateTime.toString("yyyy年MM月dd日")%><br/>
    您使用的 Http Method 是: <%=request.getMethod()%><br/>
    <!-- 下一行使用了 EL 表达式 -->
    您使用的 Http Method 是: ${pageContext.request.method}<br/>
</p>
<table border="5px">
    <tr>
        <th>name</th>
        <th>value</th>
    </tr>
    <tr>
        <td>Buffer size</td>
        <td>
            <%=response.getBufferSize()%>
        </td>
    </tr>
    <tr>
        <td>Session id</td>
        <td>
            <%=session.getId()%>
        </td>
    </tr>
    <tr>
        <td>
            Servlet name
        </td>
        <td>
            <%=config.getServletName()%>
        </td>
    </tr>
    <tr>
        <td>
            Server info
        </td>
        <td><%=application.getServerInfo()%>
        </td>
    </tr>
</table>
</body>
</html>
