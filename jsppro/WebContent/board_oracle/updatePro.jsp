<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import = "reboard.board.BoardDBBean" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("utf-8");%>

<jsp:useBean id="article" scope="page" class="reboard.board.BoardDataBean">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
<%
 
    String pageNum = request.getParameter("pageNum");

	BoardDBBean dbPro = BoardDBBean.getInstance();
    int check = dbPro.updateArticle(article);

    if(check==1){
%>
<!--    <meta http-equiv="Refresh" content="0;url=list.jsp?pageNum=<%=pageNum%>" >
-->	
		<script>
			alert("글 수정 성공");
			location.href="list.jsp?pageNum="+<%=pageNum%>;
		</script>
<% }else{%>
      <script language="JavaScript">            
        alert("비밀번호가 맞지 않습니다");
        history.go(-1);     
     </script>
<%
    }
 %>  

 