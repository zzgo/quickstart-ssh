
<%-- isELIgnored="false" 是否忽略el表达式，设置为false，表示启用el表达式 --%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
<c:out value="${test}"></c:out>
${test}
</body>
</html>