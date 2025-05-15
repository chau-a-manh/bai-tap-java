<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng Ký</title>
</head>
<body>
    <h2>Đăng Ký</h2>
    <form action="register" method="post">
        <label for="username">Tên đăng nhập:</label>
        <input type="text" name="username" id="username" required><br><br>
        <label for="password">Mật khẩu:</label>
        <input type="password" name="password" id="password" required><br><br>
        <label for="email">Email:</label>
        <input type="email" name="email" id="email" required><br><br>
        <button type="submit">Đăng Ký</button>
    </form>
</body>
</html>
