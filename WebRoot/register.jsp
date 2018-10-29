<%@page import="com.student.studentDao"%>
<jsp:useBean id="obj" class="com.student.student"></jsp:useBean>
<jsp:setProperty property="*" name="obj" />
<%
	studentDao.save(obj);
    
%>