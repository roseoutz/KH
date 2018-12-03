<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
<form action="fileupload.action" method="post" enctype="multipart/form-data">
    name : <input type="text" name="name"><br>
    age  : <input type="text" name="age"><br>
    photo : <input type="file" name="doc"><br>
    <input type="submit">
</form>
</body>
</html>