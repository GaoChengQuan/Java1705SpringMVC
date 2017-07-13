<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'student_add.jsp' starting page</title>
  </head>
  
  <body>
  	<form action="${pageContext.request.contextPath}/student/add1.action" method="post">
	  	<table>
	  		<tr>
	  			<td>姓名</td>
	  			<td><input type="text" name="name"/></td>
	  		</tr>
	  		<tr>
	  			<td>年龄</td>
	  			<td><input type="text" name="age"/></td>
	  		</tr>
	  		<tr>
	  			<td><input type="submit" value="提交"/></td>
	  		</tr>
	  	</table>
  	</form>
  </body>
</html>
