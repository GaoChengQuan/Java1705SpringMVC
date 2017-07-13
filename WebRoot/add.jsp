<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'student_add.jsp' starting page</title>
  </head>
  
 <body>
	<form action="${pageContext.request.contextPath}/student/registerStudent.action" method="post">
	 	<table>
	 		<tr>
	 			<td>姓名</td>
	 			<td><input type="text" name="name" value="${student.name}"/></td>
	 		</tr>
	 		<tr>
	 			<td>年龄</td>
	 			<td><input type="text" name="age" value="${student.age}"/></td>
	 		</tr>
	 		<tr>
	 			<td>出生日期</td>
	 			<td><input type="text" name="birthday" value="${student.birthday}"/></td>
	 		</tr>
	 		<tr>
	 			<td><input type="submit" value="提交"/></td>
	 		</tr>
	 	</table>
	</form>
	<hr/>
	<form action="${pageContext.request.contextPath}/student/registerTeacher.action" method="post">
	 	<table>
	 		<tr>
	 			<td>姓名</td>
	 			<td><input type="text" name="name" value="${teacher.name}"/></td>
	 		</tr>
	 		<tr>
	 			<td>年龄</td>
	 			<td><input type="text" name="age" value="${teacher.age}"/></td>
	 		</tr>
	 		<tr>
	 			<td>出生日期</td>
	 			<td><input type="text" name="birthday" value="${teacher.birthday}"/></td>
	 		</tr>
	 		<tr>
	 			<td><input type="submit" value="提交"/></td>
	 		</tr>
	 	</table>
	</form>
 </body>
</html>
