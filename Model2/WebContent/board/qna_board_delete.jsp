<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
	int num=Integer.parseInt(request.getParameter("num"));
	String nowpage = request.getParameter("page");
%>
<html>
<head>
<title>MVC 게시판</title>
	<script>
		function check(){
			if(document.deleteForm.BOARD_PASS.value == ""){
				alert("비밀번호를  입력 하세요");
				document.deleteForm.BOARD_PASS.focus();			
			}else{
				deleteForm.submit();
			}	
		}
	</script>

</head>
<body>
<form name="deleteForm" action="./BoardDeleteAction.bo"	method="post">
<input type=hidden name=num value="<%=num %>">	
<input type=hidden name=page value="<%=nowpage%>">
<table border=1 align=center>
<tr>
	<td>
		<font size=2>글 비밀번호 : </font>
	</td>
	<td>
		<input name="BOARD_PASS" type="password">
	</td>
</tr>
<tr>
	<td colspan=2 align=center>
		<a href="javascript:check()">삭제</a>
		&nbsp;&nbsp;
		<a href="javascript:history.go(-1)">돌아가기</a>
	</td>
</tr>
</table>
</form>
</body>
</html>