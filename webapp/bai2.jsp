<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <style>
        .table-custom {
            color: #ffffff; /* Màu chữ */
            background-color: #343a40; /* Màu nền của bảng */
        }
        .table-custom th, .table-custom td {
            border: 2px solid #007bff; /* Màu viền */
        }
    </style>
</head>
<body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>

    <div class="container mt-5">
        <table class="table table-custom">
            <thead>
                <tr>
                    <th>STT</th>
                    <th>Mã SV</th>
                    <th>Họ và tên</th>
                    <th>Quê quán</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>SV001</td>
                    <td>Nguyễn Văn A</td>
                    <td>Hà Nội</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>SV002</td>
                    <td>Trần Thị B</td>
                    <td>Đà Nẵng</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>SV003</td>
                    <td>Lê Văn C</td>
                    <td>TP.HCM</td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>