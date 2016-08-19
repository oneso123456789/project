<%@ page contentType="text/html;charset=euc-kr"%>

<html>
	<body>
	<h2>포워딩되는 페이지: forwardTo1.jsp</h2>

	<%
		request.setCharacterEncoding("euc-kr");
	
		String id = request.getParameter("id");
		String password = request.getParameter("password");
	%>

	<b><%=id%></b>님의<p>
	패스워드는 <b><%=password%></b>입니다.

	</body>
</html>
