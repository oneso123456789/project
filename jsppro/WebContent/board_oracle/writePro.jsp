<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import = "reboard.board.BoardDBBean" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("utf-8");%>

<jsp:useBean id="article" scope="page" class="reboard.board.BoardDataBean">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
 
<%
    article.setReg_date(new Timestamp(System.currentTimeMillis()) );
	article.setIp(request.getRemoteAddr());

    BoardDBBean dbPro = BoardDBBean.getInstance();
    dbPro.insertArticle(article);
//    response.sendRedirect("list.jsp");
%>
	<script>
		alert("글 작성 성공");
		location.href="list.jsp";
	</script>


