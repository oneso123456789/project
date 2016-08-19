<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import = "upload.UploadDBBean" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("utf-8");%>

<%
  int num = Integer.parseInt(request.getParameter("num"));
  String pageNum = request.getParameter("pageNum");
  String passwd = request.getParameter("passwd");

  UploadDBBean dbPro = UploadDBBean.getInstance();
  int check = dbPro.deleteArticle(num, passwd);

  if(check==1){
%>
<!--
	  <meta http-equiv="Refresh" content="0;url=list.jsp?pageNum=<%=pageNum%>" > 
-->
		<script>	
			alert("레코드 삭제 성공");
			location.href="list.jsp?pageNum=<%=pageNum%>";
		</script>

<% }else{%>
       <script language="JavaScript">      
       <!--      
         alert("비밀번호가 맞지 않습니다");
         history.go(-1);
       -->
      </script>
<%
    }
 %>