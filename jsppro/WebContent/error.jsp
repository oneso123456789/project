<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<%
	response.setStatus(HttpServletResponse.SC_OK);
%>

<center>
<H2>ó���� ������ �߻��߽��ϴ�</H2>
<HR>
<table>
<tr width=100% bgcolor="pink"><td>
�����ڿ��� ������ �ּ���..<BR>
�������ϳ� �����ϰڽ��ϴ�.
<HR>
<%= exception%>
<HR>

</td>
</tr>
</table>
</center>