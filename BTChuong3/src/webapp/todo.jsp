<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Todo List</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f0f4f8;
            margin: 0;
            padding: 40px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        h2 {
            color: #333;
        }

        ul {
            list-style-type: none;
            padding: 0;
            width: 100%;
            max-width: 500px;
        }

        li {
            background-color: #fff;
            margin-bottom: 10px;
            padding: 15px 20px;
            border-radius: 8px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        li a {
            color: #e74c3c;
            text-decoration: none;
            font-weight: bold;
        }

        li a:hover {
            text-decoration: underline;
        }

        form {
            margin-top: 20px;
            width: 100%;
            max-width: 500px;
        }

        input[type="text"] {
            width: 75%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 6px;
            margin-right: 10px;
            box-sizing: border-box;
        }

        button {
            padding: 12px 18px;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-size: 14px;
        }

        button:hover {
            background-color: #0056b3;
        }

        .logout-form {
            margin-top: 30px;
            text-align: center;
        }

        .logout-form button {
            background-color: #dc3545;
        }

        .logout-form button:hover {
            background-color: #c82333;
        }
    </style>
</head>
<body>
    <h2>Todo List</h2>
    <ul>
        <c:forEach var="task" items="${sessionScope.todoList}">
            <li>
                ${task}
                <a href="todo?action=remove&task=${task}">Remove</a>
            </li>
        </c:forEach>
    </ul>

    <form method="post" action="todo">
        <input type="text" name="task" placeholder="Add a new task" required>
        <button type="submit" name="action" value="add">Add Task</button>
    </form>

    <form method="post" action="logout.jsp" class="logout-form">
        <button type="submit">Logout</button>
    </form>
</body>
</html>
