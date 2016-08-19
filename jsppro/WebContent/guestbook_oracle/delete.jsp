<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "madvirus.guestbook.GuestBookManager" %>
<%@ page import = "madvirus.guestbook.GuestBook" %>
<%@ page import = "java.sql.Timestamp" %>
<%@ page errorPage = "/error.jsp" %>
<%
    request.setCharacterEncoding("euc-kr");
%>
<jsp:useBean id="book" class="madvirus.guestbook.GuestBook">
    <jsp:setProperty name="book" property="*" />
</jsp:useBean>
<%
	String pageNum = request.getParameter("num");

    GuestBookManager manager = GuestBookManager.getInstance();
    GuestBook oldBook = manager.getGuestBook(book.getId());
    
    if(book.getPassword().equals(oldBook.getPassword())) {
        manager.delete(book.getId());
%>
		<script language="JavaScript">
			alert("���� �����Ͽ����ϴ�.");
			location.href = "list.jsp?num=<%=pageNum%>";
		</script>
<%
    } else {
%>
		<script language="JavaScript">
			alert("��ȣ�� �ٸ��ϴ�.");
			history.go(-1);
		</script>
<%
    }
%>
