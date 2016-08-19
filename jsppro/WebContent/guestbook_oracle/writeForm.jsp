<%@ page contentType = "text/html; charset=utf-8" %>

<html lang="ko">
 <head>
  <meta charset="utf-8">
		<title>글쓰기</title>
		<script src="http://code.jquery.com/jquery-1.11.1.js"></script>
	
		<script>
	 	$(document).ready(function(){
	 		$("form").submit(function(){
	 			if($("#name").val()==""){
	 				alert("이름을 입력 하세요");
	 				$("#name").focus();
	 				return false;
	 			}
	 			if($("#password").val()==""){
	 				alert("비밀번호를 입력 하세요");
	 				$("#password").focus();
	 				return false;
	 			}
	 			if($("#email").val()==""){
	 				alert("e-mail주소를 입력 하세요");
	 				$("#email").focus();
	 				return false;
	 			}
	 			if($("#content").val()==""){
	 				alert("내용을 입력 하세요");
	 				$("#content").focus();
	 				return false;
	 			}
	 		});
	 	});	
		
		</script>
			
		</head>
		<body>

		<center>

		<form action="write.jsp" method="post">
		<table width="600" border="1" cellpadding="0" cellspacing="0">
			<tr><td>이름</td>
				<td><input type="text" name="name" id="name" size="10"></td>
			</tr>
			<tr><td>암호</td>
				<td><input type="password" name="password" id="password" size="10"></td>
			</tr>
			<tr><td>이메일</td>
				<td><input type="text" name="email" id="email" size="30"></td>
			</tr>
			<tr><td>내용</td>
				<td><textarea name="content" id="content" rows="5" cols="50"></textarea></td>
			</tr>
			<tr><td colspan="2" align=center><input type="submit" value="글남기기"></td>
			</tr>

		</table>
		</form>

		</body>
</html>