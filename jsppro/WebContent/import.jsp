<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.util.Date,java.util.Calendar" %>
<%@ page import="java.util.*" %>
<%
	java.util.Date d = new java.util.Date();

	Calendar c = Calendar.getInstance();
	int y=c.get(Calendar.YEAR);
	int m=c.get(Calendar.MONTH)+1;
	int dd=c.get(Calendar.DATE);
	
	Random r = new Random();
	int ran = r.nextInt(45)+1; // 1 ~ 45사이의 난수발생
	
%>

날짜1: <%=d%><br>
날짜2: <%=y %>년 <%=m %>월 <%=dd %>일 <br>
난수 : <%=ran %>


