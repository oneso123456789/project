<%@ page contentType="text/html;charset=utf-8"%>

<%  // 한글값이 post방식으로 폼에서 넘어오는 경우에
    // utf-8 로 인코딩 시켜주는 역할.
	request.setCharacterEncoding("utf-8");

	//한글값이 get방식으로 넘어오는 경우에는
	// Tomcat에서 자동으로 utf-8로 인코딩을 시켜줌.
%>

<html>
<h1>Request 예제1</h1>
<%
	String name = request.getParameter("name");
	String studentNum = request.getParameter("studentNum");
	String gender = request.getParameter("gender");
	String major = request.getParameter("major");

	/* if(gender.equals("m")){
		gender = "남자";
	}else{
		gender = "여자";
	} */
%>

<body>
성명 : <%=name%><p>
학번 : <%=studentNum%><p>
성별 : <%=gender%><p>
학과 : <%=major%>
</body>
</html>



