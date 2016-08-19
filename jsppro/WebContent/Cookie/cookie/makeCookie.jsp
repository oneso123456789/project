<%@ page contentType="text/html; charset=euc-kr" %>

<html>
	<head>
		<title>쿠키를 생성하는 예제</title>
	</head>

<%
   String cookieName = "id";	// id="totoro";
   Cookie cookie = new Cookie(cookieName, "totoro");
   cookie.setMaxAge(30); 	// 120초 동안 쿠키를 유지
   cookie.setValue("guardian"); // id="guardian";
   response.addCookie(cookie);	// 쿠키를 발행
%>

	<body>
	<h2>쿠키를 생성하는 예제</h2>
	<P>

"<%=cookieName%>" 쿠키가생성 되었습니다.<br>

		<input type="button" value="쿠키의 내용확인" onclick="javascript:window.location='useCookie.jsp'">
	</P>
	</body>
</html>