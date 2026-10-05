<%@ page language="java" %>
<%@ page import="java.util.Date" %>

<html>
<head>
    <title>Welcome</title>


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

    .container {
        background-color: white;
        width: 400px;
        padding: 30px;
        border-radius: 10px;
        text-align: center;
        box-shadow: 0 4px 15px rgba(0, 0, 0, 0.15);
    }

    h2 {
        color: #007bff;
        margin-bottom: 25px;
    }

    h3 {
        color: #333;
        margin-bottom: 15px;
    }

    p {
        color: #555;
        font-size: 17px;
        margin-bottom: 20px;
    }

    h4 {
        color: #777;
        font-size: 15px;
    }
</style>


</head>

<body>


<div class="container">

    <h2>Welcome</h2>

    <h3>
        Good morning <%= request.getParameter("name") %>
    </h3>

    <p>
        Email: <%= request.getParameter("email") %>
    </p>

    <h4>
        Date & Time: <%= new Date() %>
    </h4>

</div>


</body>
</html>
