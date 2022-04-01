<%@ page language="java" contentType="text/html; %>
<!DOCTYPE html>
<html>
<head>
    <title>Register Employee</title>
</head>

<body>
    <h1>Employee Register Form</h1>
    <form action="<%= request.getContextPath() %>/register" method="post">
        <table style="width: 80%">
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" placeholder="Name" /></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>
</body>

</html>
