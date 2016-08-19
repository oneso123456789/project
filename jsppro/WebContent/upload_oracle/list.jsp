<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "upload.UploadDBBean" %>
<%@ page import = "upload.UploadDataBean" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file="view/color.jsp"%>

<%
    int pageSize = 2;
    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

    String pageNum = request.getParameter("pageNum");
    if (pageNum == null) {
        pageNum = "1";
    }

    int currentPage = Integer.parseInt(pageNum);
    int startRow = (currentPage - 1) * pageSize + 1;
    int endRow = currentPage * pageSize;
    int count = 0;
    int number=0;

    List articleList = null;
    UploadDBBean dbPro = UploadDBBean.getInstance();
    count = dbPro.getArticleCount();  //전체 레코드수
    if (count > 0) {
        articleList = dbPro.getArticles(startRow, endRow);
    }

	number=count-(currentPage-1)*pageSize;
%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body bgcolor="<%=bodyback_c%>">
<center><b>글목록(전체 글:<%=count%>)</b>
<table width="800">
<tr>
    <td align="right" bgcolor="<%=value_c%>">
    <a href="writeForm.jsp">글쓰기</a>
    </td>
</table>

<%
    if (count == 0) {
%>
<table width="800" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td align="center">
    게시판에 저장된 글이 없습니다.
    </td>
</table>

<%  } else {    %>
<table border="1" width="800" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30" bgcolor="<%=value_c%>"> 
      <td align="center"  width="50"  >번 호</td> 
	  <td align="center"  width="50"  >이미지</td> 
      <td align="center"  width="250" >제   목</td> 
      <td align="center"  width="100" >작성자</td>
      <td align="center"  width="150" >작성일</td> 
      <td align="center"  width="50" >조 회</td> 
      <td align="center"  width="100" >IP</td>    
    </tr>
<%  
        for (int i = 0; i < articleList.size(); i++) {
          UploadDataBean article = (UploadDataBean) articleList.get(i);
%>
   <tr height="30">
    <td align="center"  width="50" > <%=number--%></td>
    <td align="center"  width="100" >	

<%--  
<img src="/jsppro/upload/<%=article.getUpload()%>" width=50 height=50>	
한글 이미지 파일 보이게 하기
웹브라우저 - 인터넷옵션-고급- UTF-8파일보내기 체크 해제
--%>
<img src="/jsppro/upload/<%=article.getUpload()%>" width=50 height=50>	
<%--article.getUpload()--%>
	
	</td>
    <td  width="250" >
	<%
	  int wid=0; 
	  if(article.getRe_level()>0){  //답변글
	        wid=5*(article.getRe_level());
	%>
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	  <img src="images/re.gif">

	<%}else{// 원문%>  
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	<%}%>
           
      <a href="content.jsp?num=<%=article.getNum()%>&pageNum=<%=currentPage%>">
           <%=article.getSubject()%></a> 

          <% if(article.getReadcount()>=10){%>
				<img src="images/hot.gif" border="0"  height="16"><%}%> </td>
    <td align="center"  width="100"> 
       <a href="mailto:<%=article.getEmail()%>"><%=article.getWriter()%></a></td>
    <td align="center"  width="150"><%= sdf.format(article.getReg_date())%></td>
    <td align="center"  width="50"><%=article.getReadcount()%></td>
    <td align="center" width="100" ><%=article.getIp()%></td>
  </tr>
     <%} //end for()%>
</table>
<%}%>

<%
    if (count > 0) {
        int pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		 
 //     int startPage = (int)(currentPage/10)*10+1;
		int startPage =(int)((currentPage-1)/10)*10+1;

		int pageBlock=10;
        int endPage = startPage + pageBlock-1;
        if (endPage > pageCount) endPage = pageCount;
        
        if (startPage > 10) {    %>
        <a href="list.jsp?pageNum=<%= startPage - 10 %>">[이전]</a>
<%      }
        if(currentPage>1){ %>
  			<a href="list.jsp?pageNum=<%= currentPage-1 %>"> <- </a>      	
<%      }else{ %>
			<-
<%		}
        
        for (int i = startPage; i <= endPage; i++) {  
       		 if(i == currentPage){ %>
				<%= i %>
<% 			}else{ %>
				<a href="list.jsp?pageNum=<%= i %>">[<%= i %>]</a> 
<%			}
        }
        
        if(currentPage < pageCount){ %>
        	<a href="list.jsp?pageNum=<%= currentPage + 1 %>"> -> </a>
<%      }else{ %>
        	->
<%      }
        if (endPage < pageCount) {  %>
        <a href="list.jsp?pageNum=<%= startPage + 10 %>">[다음]</a>
<%
        }
    }
%>
</center>
</body>
</html>