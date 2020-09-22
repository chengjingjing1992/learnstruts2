<%@page contentType="text/html; charset=UTF-8" isELIgnored="false" %>

<html>
<body>
<h2> this is index2</h2>


<form action="/hello1" name="" method="post">
    <input name="user.id" value=""/>请输入id
    <input name="user.uname" value=""/>请输入uname
    <input type="submit" value="提交">
</form>
<p>${requestScope.user.id}</p>
<p>${requestScope.user.uname}</p>


</body>
</html>
