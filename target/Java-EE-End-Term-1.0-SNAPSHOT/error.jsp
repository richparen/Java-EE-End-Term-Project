<%--
  Created by IntelliJ IDEA.
  User: richparen
  Date: 01.04.2021
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%@ page isErrorPage="true" %>

    <%
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        if (name == "" || name == null){%>
            <h1>Field for name is empty!</h1>
            <a href="login.jsp">login again</a>
      <%} else if(password == "" || password != "user123"){%>
        <h1>Field for password is empty or wrong!</h1>
        <a href="login.jsp">login again</a>
        <%}%>
</body>
</html>
