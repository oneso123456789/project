<%@ page contentType="text/html;charset=euc-kr"%>

<html>
	<body>
	<h2>�������Ǵ� ������: forwardTo1.jsp</h2>

	<%
		request.setCharacterEncoding("euc-kr");
	
		String id = request.getParameter("id");
		String password = request.getParameter("password");
	%>

	<b><%=id%></b>����<p>
	�н������ <b><%=password%></b>�Դϴ�.

	</body>
</html>
