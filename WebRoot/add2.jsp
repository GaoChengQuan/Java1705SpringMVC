<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'student_add.jsp' starting page</title>
  </head>
  
 <body>
	<form action="${pageContext.request.contextPath}/student/registerAll1.action" method="post">
	 	<table>
	 		<tr>
	 			<td>姓名</td>
	 			<td><input type="text" name="student.name" value="${student.name}"/></td>
	 		</tr>
	 		<tr>
	 			<td>年龄</td>
	 			<td><input type="text" name="student.age" value="${student.age}"/></td>
	 		</tr>
	 		<tr>
	 			<td>出生日期</td>
	 			<td><input type="text" name="student.birthday" value="${student.birthday}"/></td>
	 		</tr>
	 	</table>
	 	<hr/>
	 	<table>
	 		<tr>
	 			<td>姓名</td>
	 			<td><input type="text" name="teacher.name" value="${teacher.name}"/></td>
	 		</tr>
	 		<tr>
	 			<td>年龄</td>
	 			<td><input type="text" name="teacher.age" value="${teacher.age}"/></td>
	 		</tr>
	 		<tr>
	 			<td>出生日期</td>
	 			<td><input type="text" name="teacher.birthday" value="${teacher.birthday}"/></td>
	 		</tr>
	 	</table>
	 	<input type="submit" value="提交"/>
	</form>
 </body>
</html>
