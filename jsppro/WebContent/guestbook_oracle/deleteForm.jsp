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
<head><title>�ۻ���</title></head>
<body>
<center>
<form action="delete.jsp" method="post">
<input type="hidden" name="id" value="<%= id %>">
<input type="hidden" name="num" value="<%=pageNum%>">
<table width="100%" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td>��ȣ</td>
    <td><input type="password" name="password" size="10"><br>
    ���� ���� �Է��� ��ȣ�� �����ؾ� ���� �����˴ϴ�.</td>
</tr>
<tr>
    <td colspan="2"><input type="submit" value="�ۻ����ϱ�"></td>
</tr>

</table>
</form>

</center>
</body>
</html>