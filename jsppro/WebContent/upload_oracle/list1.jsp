<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "upload.UploadDBBean" %>
<%@ page import = "upload.UploadDataBean" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ page import="java.net.URLEncoder"%>
<%@ include file="view/color.jsp"%>

<%
    int pageSize = 20;
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
<table width="500">
<tr>
    <td align="right" bgcolor="<%=value_c%>">
    <a href="writeForm.jsp">글쓰기</a>
    </td>
</table>

<%
    if (count == 0) {
%>
<table width="500" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td align="center">
    게시판에 저장된 글이 없습니다.
    </td>
</table>

<%  } else {    %>
<table border="1" width="500" cellpadding="0" cellspacing="0" align="center"> 
     <tr height="30">  
<%  
        for (int i = 0 ; i < articleList.size() ; i++) {
          UploadDataBean article = (UploadDataBean)articleList.get(i);
%>
   
    <td align="center"  width="100" >
  
<img src="/jsppro/upload/<%=article.getUpload()%>" width=100 height=50>	
<%-- <img src="/jsppro/upload/<%=URLEncoder.encode(article.getUpload(),"utf-8")%>" width=50 height=50>	 --%>


<%--article.getUpload()--%>	
	</td> 
		
<%		if((i+1) % 5 == 0){	 %>		
	 		</tr><tr>
	 
<%		} %> 
     <%} //end for()%>
   </tr>   
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
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="list.jsp?pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="list.jsp?pageNum=<%= startPage + 10 %>">[다음]</a>
<%
        }
    }
%>
</center>
</body>
</html>