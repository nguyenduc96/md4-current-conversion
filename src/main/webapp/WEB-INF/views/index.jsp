<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Current conversion</title>
</head>
<body>
<form action="/convert">
    <label>USD</label>
    <input type="number" name="usd" placeholder="Enter USD">
    <p>VND : ${result}</p>
    <button>Change</button>
</form>
</body>
</html>
