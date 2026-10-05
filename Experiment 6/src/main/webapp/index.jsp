<%@ page language="java" %>

<html>
<head>
    <title>Implicit and Explicit Objects</title>


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
        color: #007bff;
        margin-bottom: 25px;
    }

    div {
        margin-bottom: 20px;
    }

    label {
        display: block;
        margin-bottom: 7px;
        font-weight: bold;
        color: #333;
    }

    input {
        width: 100%;
        padding: 10px;
        box-sizing: border-box;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 15px;
    }

    input:focus {
        outline: none;
        border-color: #007bff;
    }

    button {
        width: 100%;
        padding: 11px;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>


</head>

<body>

<form action="welcome.jsp" method="get">

    <h2>Implicit and Explicit Object</h2>

    <div>
        <label for="name">Name</label>
        <input type="text" name="name" id="name" required>
    </div>

    <div>
        <label for="email">Email</label>
        <input type="email" name="email" id="email" required>
    </div>

    <div>
        <button type="submit">Submit</button>
    </div>

</form>


</body>
</html>
