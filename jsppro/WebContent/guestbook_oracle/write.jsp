<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page errorPage = "error.jsp" %>
<%@ page import = "madvirus.guestbook.GuestBookManager" %>
<%@ page import = "java.sql.Timestamp" %>

<%
    request.setCharacterEncoding("utf-8");
//  GuestBook book = new GuestBook();	
%>

<jsp:useBean id="book" class="madvirus.guestbook.GuestBook">
    <jsp:setProperty name="book" property="*" />
</jsp:useBean>

<%
    book.setRegister(new Timestamp(System.currentTimeMillis()));
    
//	GuestBookManager m = new GuestBookManager();
	GuestBookManager manager = GuestBookManager.getInstance();
    manager.insert(book);
%>

<script language="JavaScript">
	alert("방명록에 글을 등록하였습니다.");
	location.href = "list.jsp";
</script>





