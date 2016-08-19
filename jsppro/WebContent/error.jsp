<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%
	response.setStatus(HttpServletResponse.SC_OK);
%>

<center>
<H2>처리중 문제가 발생했습니다</H2>
<HR>
<table>
<tr width=100% bgcolor="pink"><td>
관리자에게 문의해 주세요..<BR>
빠른시일내 복구하겠습니다.
<HR>
<%= exception%>
<HR>

</td>
</tr>
</table>
</center>