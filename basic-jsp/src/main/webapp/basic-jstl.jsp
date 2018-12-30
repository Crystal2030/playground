<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Basic JSTL</title>
</head>
<body>
<p>尝试一下 JSTL 的使用</p>
<p>
    <c:set var="x" value="42" scope="page"/>
    <c:out value="${x}"/>
</p>
<p>
    <c:set var="name"><%=request.getParameter("name")%>
    </c:set>
    <%-- 访问 http://localhost:8080/basic-jsp/basic-jstl?name=Bob 可以看到 if 成立的情况 --%>
    <c:if test="${name == 'Bob'}">
        Hi, Bob
    </c:if>

    <c:forEach var="i" begin="1" end="5">
        <c:out value="${i}"/>
    </c:forEach>
    <c:forEach items="${param}" var="entry">
        ${entry.key} ${entry.value}
    </c:forEach>
    <c:out value="${fn:length('Hello world')}"/>

</p>
</body>
</html>
