<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'student_add.jsp' starting page</title>
  </head>
  
<body>
<form action="${pageContext.request.contextPath}/student/deleteAll.action" method="post">
 	<table border="1" align="center">
 		<tr>
 			<td>编号</td>
 			<td>姓名</td>
 		</tr>
 		<tr>
 			<td><input type="checkbox" name="ids" value="1"/></td>
 			<td>zhangsan</td>
 		</tr>
 		<tr>
 			<td><input type="checkbox" name="ids" value="2"/></td>
 			<td>lisi</td>
 		</tr>
 		<tr>
 			<td><input type="checkbox" name="ids" value="3"/></td>
 			<td>wangwu</td>
 		</tr>
 		<tr>
 			<td><input type="checkbox" name="ids" value="4"/></td>
 			<td>小明</td>
 		</tr>
 		<tr>
	 		<td colspan="2"><input type="submit" value="提交"/></td>
 		</tr>
 	</table>
</form>
</body>
</html>
