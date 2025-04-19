<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee Management</title>
</head>
<body>
    <h2>Employee List</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Position</th>
            <th>Salary</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.name}</td>
                <td>${employee.position}</td>
                <td>${employee.salary}</td>
            </tr>
        </c:forEach>
    </table>

    <h3>Add New Employee</h3>
    <form action="EmployeeController" method="post">
        <input type="hidden" name="action" value="add">
        <label for="id">ID:</label>
        <input type="number" name="id" required><br>
        <label for="name">Name:</label>
        <input type="text" name="name" required><br>
        <label for="position">Position:</label>
        <input type="text" name="position" required><br>
        <label for="salary">Salary:</label>
        <input type="number" step="0.01" name="salary" required><br>
        <button type="submit">Add Employee</button>
    </form>
</body>
</html>
