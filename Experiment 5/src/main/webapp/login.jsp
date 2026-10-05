<%@ page language="java" %>

<%
if(session.getAttribute("useremail") != null){
response.sendRedirect("dashboard.jsp");
}
%>

<html>
<head>
    <title>Login Page</title>


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

    form {
        background-color: white;
        width: 350px;
        padding: 30px;
        border-radius: 10px;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.15);
    }

    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 25px;
    }

    div {
        margin-bottom: 18px;
    }

    label {
        display: block;
        margin-bottom: 7px;
        color: #333;
        font-weight: bold;
    }

    input {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
        font-size: 15px;
    }

    input:focus {
        border-color: #007bff;
        outline: none;
    }

    button {
        background-color: #007bff;
        color: white;
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        cursor: pointer;
        font-size: 16px;
        margin-right: 10px;
    }

    button:hover {
        background-color: #0056b3;
    }

    a {
        text-decoration: none;
        color: #007bff;
        font-size: 16px;
    }

    a:hover {
        text-decoration: underline;
    }

    .message {
        background-color: #ffe6e6;
        color: #d00000;
        padding: 10px;
        border-radius: 5px;
        margin-bottom: 15px;
        text-align: center;
    }
</style>


</head>

<body>


<form action="login" method="post">

    <h2>Login Page</h2>

    <%
        if(request.getParameter("message") != null){
    %>

    <div class="message">
        <p><%= request.getParameter("message") %></p>
    </div>

    <%
        }
    %>

    <div>
        <label for="email">Email</label>
        <input type="email" name="email" id="email" required>
    </div>

    <div>
        <label for="password">Password</label>
        <input type="password" name="password" id="password" required>
    </div>

    <div>
        <button type="submit">Login</button>
        <a href="index.jsp">Back</a>
    </div>

</form>


</body>
</html>
