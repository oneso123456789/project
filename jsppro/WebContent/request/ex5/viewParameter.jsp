<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.util.*" %>

<%
    request.setCharacterEncoding("euc-kr");
%>

<html>
<head><title>��û �Ķ���� ���</title></head>
<body>

<b>request.getParameter() �޼ҵ� ���</b><br>
name �Ķ���� = <%= request.getParameter("name") %> <br>
address �Ķ���� = <%= request.getParameter("address") %>
<p>


<b>request.getParameterValues() �޼ҵ� ���</b><br>
<%
    String[] values = request.getParameterValues("pet");
    if (values != null) {
    	for (int i = 0 ; i < values.length ; i++) {
%>
			<%= values[i] %>
<%
  		}
  	}
%>
<p>


<b>request.getParameterNames() �޼ҵ� ���</b><br>
<%
    Enumeration num = request.getParameterNames();
    while(num.hasMoreElements()) {
        String name = (String)num.nextElement();
%>
        <%= name %>
<%
    }
%>
<p>


<b>request.getParameterMap() �޼ҵ� ���</b><br>
<%
    Map parameterMap = request.getParameterMap();
    String[] nameParam = (String[])parameterMap.get("name");
    String[] addressParam = (String[])parameterMap.get("address");
    
    if (nameParam != null) {
%>
	  name = <%= nameParam[0] %>
<%
	}
    
    if (addressParam != null) {
%>   
  		address = <%=addressParam[0] %>  
<%	} %>

</body>
</html>