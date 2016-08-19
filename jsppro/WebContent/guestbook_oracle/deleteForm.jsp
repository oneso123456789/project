<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "madvirus.guestbook.GuestBookManager" %>
<%@ page import = "madvirus.guestbook.GuestBook" %>
<%@ page errorPage = "/error.jsp" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    String pageNum = request.getParameter("num");
//    GuestBookManager manager = GuestBookManager.getInstance();
//   GuestBook book = manager.getGuestBook(id);
%>
<html>
<head><title>글삭제</title></head>
<body>
<center>
<form action="delete.jsp" method="post">
<input type="hidden" name="id" value="<%= id %>">
<input type="hidden" name="num" value="<%=pageNum%>">
<table width="100%" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td>암호</td>
    <td><input type="password" name="password" size="10"><br>
    글을 쓸때 입력한 암호와 동일해야 글이 삭제됩니다.</td>
</tr>
<tr>
    <td colspan="2"><input type="submit" value="글삭제하기"></td>
</tr>

</table>
</form>

</center>
</body>
</html>