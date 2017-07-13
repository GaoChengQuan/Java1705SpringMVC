<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'student_info.jsp' starting page</title>
  </head>
  
  <body>
  	student_info<br/>
  	${name}<br/>
  	${age}<br/>
  	
    ${student}<br>
  	${requestScope.student}<br>
  	${sessionScope.student}
  </body>
</html>
