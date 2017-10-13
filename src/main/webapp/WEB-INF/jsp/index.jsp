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

<table>
    <tr>
        <th>ID</th>
        <th>Username</th>
        <th>Fullname</th>
        <th>Email</th>
        <th>Action</th>
    </tr>
    <c:forEach var = "list" items = "${listUser}">
        <tr>
            <td>${list.id}</td>
            <td>${list.username}</td>
            <td>${list.fullName}</td>
            <td>${list.email}</td>
            <td>
                <a href="/crud-user/view/${list.id}">View</a>
                <a href="/crud-user/delete/${list.id}">Delete</a>
                <a href="/crud-user/edit/${list.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
<hr/>
<s:form method="POST" action="/crud-user/saveOrUpdate">
    <s:input type="hidden" path="id" value=""/>
    <br>Username:
    <s:input type="text" path="username"/>
    <br>Fullname:
    <s:input type="text" path="fullName"/>
    <br>Email:
    <s:input type="text" path="email"/>
    <br><br>
    <input type="submit" value="Submit">
</s:form>

</body>
</html>