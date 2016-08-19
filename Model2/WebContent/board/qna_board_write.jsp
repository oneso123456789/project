<%@ page language="java" contentType="text/html; charset=utf-8"%>

<html>
<head>
	<title>MVC 게시판</title>
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script>
		$(document).ready(function(){
			$("form").submit(function(){
				if($("#board_name").val() == ""){
					alert("이름을 입력 하세요");
					$("#board_name").focus();
					return false;
				}
				if($("#board_pass").val() == ""){
					alert("비밀번호를 입력 하세요");
					$("#board_pass").focus();
					return false;
				}
				if($("#board_subject").val() == ""){
					alert("제목을 입력 하세요");
					$("#board_subject").focus();
					return false;
				}
				if($("#board_content").val() == ""){
					alert("내용을 입력 하세요");
					$("#board_content").focus();
					return false;
				}				
				
			});			
		});
	
	
	</script>
</head>
<body>
<!-- 게시판 등록 -->
<form action="/Model2/BoardAddAction.bo" method="post" 
	enctype="multipart/form-data" name="boardform">
<table cellpadding="0" cellspacing="0" align=center border=1>
	<tr align="center" valign="middle">
		<td colspan="5">MVC 게시판</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12" height="16">
			<div align="center">글쓴이</div>
		</td>
		<td>
			<input id="board_name" name="BOARD_NAME" type="text" size="10" maxlength="10" 
				value=""/>
		</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12" height="16">
			<div align="center">비밀번호</div>
		</td>
		<td>
			<input id="board_pass" name="BOARD_PASS" type="password" size="10" maxlength="10" 
				value=""/>
		</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12" height="16">
			<div align="center">제 목</div>
		</td>
		<td>
			<input id="board_subject" name="BOARD_SUBJECT" type="text" size="50" maxlength="100" 
				value=""/>
		</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12">
			<div align="center">내 용</div>
		</td>
		<td>
			<textarea id="board_content" name="BOARD_CONTENT" cols="67" rows="15"></textarea>
		</td>
	</tr>
	<tr>
		<td style="font-family:돋음; font-size:12">
			<div align="center">파일 첨부</div>
		</td>
		<td>
			<input name="BOARD_FILE" type="file"/>
		</td>
	</tr>
	<tr bgcolor="cccccc">
		<td colspan="2" style="height:1px;">
		</td>
	</tr>
	<tr><td colspan="2">&nbsp;</td></tr>
	<tr align="center" valign="middle">
		<td colspan="5">
			<input type=submit value="등록">
			<input type=reset value="취소">
		</td>
	</tr>
</table>
</form>

</body>
</html>