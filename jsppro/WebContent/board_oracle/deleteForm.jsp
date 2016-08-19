<%@ page contentType="text/html;charset=utf-8" %>
<%@ include file="view/color.jsp"%>

<%
  int num = Integer.parseInt(request.getParameter("num"));
  String pageNum = request.getParameter("pageNum");

%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>      
	$(document).ready(function(){
		$("form").submit(function(){
			if($("#passwd").val()==""){
				alert("비밀번호를 입력 하세요");
				$("#passwd").focus();
				return false;
			}
		});	
	});     
</script>

</head>

<body bgcolor="<%=bodyback_c%>">
<center><b>글삭제</b>
<br>
<form method="POST" name="delForm"  action="deletePro.jsp"> 
 <table border="1" align="center" cellspacing="0" cellpadding="0" width="360">
  <tr height="30">
     <td align=center  bgcolor="<%=value_c%>">
       <b>비밀번호를 입력해 주세요.</b></td>
  </tr>
  <tr height="30">
     <td align=center >비밀번호 :   
       <input type="password" id="passwd" name="passwd" size="8" maxlength="12">
	   <input type="hidden" name="num" value="<%=num%>">
 	   <input type="hidden" name="pageNum" value="<%=pageNum%>"></td>
 </tr>
 <tr height="30">
    <td align=center bgcolor="<%=value_c%>">
      <input type="submit" value="글삭제" >
      <input type="button" value="글목록" 
       onclick="location.href='list.jsp?pageNum=<%=pageNum%>'">     
   </td>
 </tr>  
</table> 
</form>
</body>
</html> 
