<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="net.board.db.*" %>
<%
	BoardBean board=(BoardBean)request.getAttribute("boarddata");
	String nowpage = (String)request.getAttribute("page");
%>

<html>
<head>
	<title>MVC 게시판</title>
	<script language="javascript">
	function replyboard(){
		if(document.boardform.BOARD_NAME.value == ""){
			alert("이름을 입력 하세요");
			document.boardform.BOARD_NAME.focus();
		}else if(document.boardform.BOARD_SUBJECT.value == ""){
			alert("제목을 입력 하세요");
			document.boardform.BOARD_SUBJECT.focus();				
		}else if(document.boardform.BOARD_CONTENT.value == ""){
			alert("내용을 입력 하세요");
			document.boardform.BOARD_CONTENT.focus();
		}else if(document.boardform.BOARD_PASS.value == ""){
			alert("비밀번호를  입력 하세요");
			document.boardform.BOARD_PASS.focus();		
		}else{
			boardform.submit();
		}
	}
	</script>
</head>
<body>
<!-- 게시판 답변 -->
<form action="/Model2/BoardReplyAction.bo" method="post" name="boardform">
<input type="hidden" name="BOARD_NUM" value="<%=board.getBOARD_NUM() %>">
<input type="hidden" name="BOARD_RE_REF" value="<%=board.getBOARD_RE_REF() %>">
<input type="hidden" name="BOARD_RE_LEV" value="<%=board.getBOARD_RE_LEV() %>">
<input type="hidden" name="BOARD_RE_SEQ" value="<%=board.getBOARD_RE_SEQ() %>">
<input type="hidden" name="page" value="<%=nowpage%>">

<table cellpadding="0" cellspacing="0" align=center border=1>
	<tr align="center" valign="middle">
		<td colspan="5">MVC 게시판</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12" height="16">
			<div align="center">글쓴이</div>
		</td>
		<td>
			<input name="BOARD_NAME" type="text"/>
		</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12" height="16">
			<div align="center">제 목</div>
		</td>
		<td>
			<input name="BOARD_SUBJECT" type="text" size="50" 
				maxlength="100" value="Re: <%=board.getBOARD_SUBJECT() %>"/>
		</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12">
			<div align="center">내 용</div>
		</td>
		<td>
			<textarea name="BOARD_CONTENT" cols="67" rows="15"></textarea>
		</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12">
			<div align="center">비밀번호</div>
		</td>
		<td>
			<input name="BOARD_PASS" type="password">
		</td>
	</tr>
	
	<tr bgcolor="cccccc">
		<td colspan="2" style="height:1px;">
		</td>
	</tr>
	<tr><td colspan="2">&nbsp;</td></tr>
	
	<tr align="center" valign="middle">
		<td colspan="5">
		<a href="javascript:replyboard()">[등록]</a>&nbsp;&nbsp;
		<a href="javascript:history.go(-1)">[뒤로]</a>
		</td>
	</tr>
</table>
</form>
<!-- 게시판 답변 -->
</body>
</html>