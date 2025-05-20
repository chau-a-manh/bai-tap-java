<!DOCTYPE html>
<html>
<head>
    <title>Todo List</title>
</head>
<body>
    <h2>Todo List</h2>
    <ul>
        <c:forEach var="task" items="${sessionScope.todoList}">
            <li>${task} <a href="todo?action=remove&task=${task}">Remove</a></li>
        </c:forEach>
    </ul>
    <form method="post" action="todo">
        <input type="text" name="task" placeholder="Add a new task" required>
        <button type="submit" name="action" value="add">Add Task</button>
    </form>
    <form method="post" action="logout.jsp">
        <button type="submit">Logout</button>
    </form>
</body>
</html>
