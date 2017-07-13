<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'student_add.jsp' starting page</title>
  </head>
  
<body>
<form action="${pageContext.request.contextPath}/student/addAll.action" method="post">
 	<table border="1" align="center" cellspacing="0">
 		<tr>
 			<td>姓名<input type="text" name="list[0].name" value="zhangsan"/></td>
 			<td>年龄<input type="text" name="list[0].age" value="23"/></td>
 		</tr>
 		<tr>
 			<td>姓名<input type="text" name="list[1].name" value="lisi"/></td>
 			<td>年龄<input type="text" name="list[1].age" value="10"/></td>
 		</tr>
 		<tr>
 			<td>姓名<input type="text" name="list[2].name" value="wangwu"/></td>
 			<td>年龄<input type="text" name="list[2].age" value="23"/></td>
 		</tr>
 		<tr>
 			<td colspan="2"><input type="submit" value="提交"/></td>
			</tr>
 	</table>
</form>
</body>
</html>
