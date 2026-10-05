<%@ page language="java" %>

<%
if(session.getAttribute("useremail") == null){
response.sendRedirect("login.jsp?message=login first");
}
%>

<html>
<head>
    <title>Dashboard</title>


<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }

    .dashboard {
        background-color: white;
        width: 400px;
        padding: 35px;
        border-radius: 10px;
        text-align: center;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.15);
    }

    h2 {
        color: #333;
        margin-bottom: 20px;
    }

    h4 {
        color: #555;
        font-size: 18px;
        margin-bottom: 15px;
    }

    p {
        color: #666;
        font-size: 16px;
        margin-bottom: 25px;
    }

    .logout {
        display: inline-block;
        text-decoration: none;
        background-color: #dc3545;
        color: white;
        padding: 10px 22px;
        border-radius: 5px;
        font-size: 16px;
    }

    .logout:hover {
        background-color: #b02a37;
    }
</style>


</head>

<body>

<div class="dashboard">

    <h2>Dashboard Page</h2>

    <h4>Welcome to <%= session.getAttribute("username") %></h4>

    <p>
        Email ID: <%= session.getAttribute("useremail") %>
    </p>

    <a href="logout" class="logout">Logout</a>

</div>


</body>
</html>
