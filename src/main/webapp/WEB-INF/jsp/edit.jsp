<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "s"%>
<%@ page contentType="text/html; charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head><title>SpringBoot</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }
        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<hr/>
<s:form method="POST" action="/crud-user/saveOrUpdate">
    <s:input type = "hidden" path = "id"/><br/>
    <br>Username:
    <s:input path="username" value="${user.username}"/>
    <br>Fullname:
    <s:input path="fullName" value="${user.fullName}"/>
    <br>Email:
    <s:input  path="email" value="${user.email}"/>
    <br><br>
    <input type="submit" value="Submit">
</s:form>
</body>
</html>