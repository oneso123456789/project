<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.util.*" %>

<html>
	<head><title>技记 荤侩 抗力</title></head>
	<body>

<% // 凯芭屈
/* 	Enumeration attr = session.getAttributeNames();

	while(	attr.hasMoreElements()	){
		String attrName = (String)attr.nextElement();
		String attrValue = (String)session.getAttribute(attrName);
		out.println("技记狼 加己疙篮 " + attrName + " 捞绊 ");
		out.println("技记狼 加己蔼篮 " + attrValue + "捞促.<br><br>");
	} */
%>

 id技记狼 加己蔼 : <%=session.getAttribute("id") %><br>
 passwd技记狼 加己蔼 : <%=session.getAttribute("passwd") %><br>




	</body>
</html>
