<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import = "board.BoardDataBean" %>
<%@ page import = "board.BoardDBBean" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("utf-8");%>
<%
//	BoardDataBean article = new BoardDataBean();
%>

<jsp:useBean id="article" class="board.BoardDataBean">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
 
<%
	article.setIp(request.getRemoteAddr());

	// BoardDataBean article = new BoardDataBean();
//	article.writer="ahn";
	/* article.setWriter(request.getParameter("writer"));
	article.setSubject(request.getParameter("subject"));
	article.setEmail(request.getParameter("email"));
	article.setContent(request.getParameter("content"));
	article.setPasswd(request.getParameter("passwd"));
	article.setIp(request.getRemoteAddr()); */ 
	
%> 
이름:<%=article.getWriter() %><br>
제목:<%=article.getSubject() %><br>
E-mail:<%=article.getEmail() %><br>
내용:<%=article.getContent() %><br>
비밀번호:<%=article.getPasswd() %><br>
조회수:<%=article.getReadcount() %><br>
IP주소:<%=article.getIp() %><br>
 
<%--
    article.setReg_date(new Timestamp(System.currentTimeMillis()) );
	article.setIp(request.getRemoteAddr());
--%>
<% 
    BoardDBBean dbPro = BoardDBBean.getInstance();
	
// 주소값 전달에 의한 메소드 호출(Call by Reference)
    dbPro.insertArticle(article);

//    response.sendRedirect("list.jsp");
%>
	<script>
		alert("글 작성 성공");
		location.href="list.jsp";
	</script>


