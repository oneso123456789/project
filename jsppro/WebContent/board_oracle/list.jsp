<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "reboard.board.BoardDBBean" %>
<%@ page import = "reboard.board.BoardDataBean" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file="view/color.jsp"%>

<%
    int pageSize = 10; //한 화면(페이지)에 출력할 레코드수 
    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

    String pageNum = request.getParameter("pageNum");
    if (pageNum == null){
        pageNum = "1";
    }
    
 	 //현재 페이지 번호
    int currentPage = Integer.parseInt(pageNum); 
    int startRow = (currentPage - 1) * pageSize + 1;
    int endRow = currentPage * pageSize;// 1페이지 : startRow=1, endRow=10
   
    int count = 0; //전체 레코드수		// 2페이지 : startRow=11, endRow=20
    int number=0; //화면에 출력되는 번호

    List articleList = null;
    BoardDBBean dbPro = BoardDBBean.getInstance();
    count = dbPro.getArticleCount();
    if (count > 0) {
        articleList = dbPro.getArticles(startRow, endRow);
    }
//  number= 15 - (1 - 1) * 10;  15
//  number= 15 - (2 - 1) * 10;
	number=count-(currentPage-1)*pageSize;
%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body bgcolor="<%=bodyback_c%>">
<center><b>글목록(전체 글:<%=count%>)</b>
<table width="700">
<tr>
    <td align="right" bgcolor="<%=value_c%>">
    <a href="writeForm.jsp">글쓰기</a>
    </td>
</table>

<%
    if (count == 0) {
%>
<table width="700" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td align="center">
    게시판에 저장된 글이 없습니다.
    </td>
</table>

<%  } else {    %>
<table border="1" width="700" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30" bgcolor="<%=value_c%>"> 
      <td align="center"  width="50"  >번 호</td> 
      <td align="center"  width="250" >제   목</td> 
      <td align="center"  width="100" >작성자</td>
      <td align="center"  width="150" >작성일</td> 
      <td align="center"  width="50" >조 회</td> 
      <td align="center"  width="100" >IP</td>    
    </tr>
<%  
        for (int i = 0 ; i < articleList.size() ; i++) {
          BoardDataBean article = (BoardDataBean)articleList.get(i);
%>
   <tr height="30">
    <td align="center"  width="50" > <%=number--%></td>
    <td  width="250" >
	<%
	   int wid=0; 
	   if(article.getRe_level()>0){   // 답글
	        wid=30*(article.getRe_level());
	%>
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	  <img src="images/re.gif">
	<%}else{%>						<!-- 원문 -->
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	<%}%>
           
      <a href="content.jsp?num=<%=article.getNum()%>&pageNum=<%=currentPage%>">
           <%=article.getSubject()%></a> 
           
          <% if(article.getReadcount()>=20){%>
         		<img src="images/hot.gif" border="0"  height="16">
         <%}%> 
     </td>
         
    <td align="center"  width="100"> 
       <a href="mailto:<%=article.getEmail()%>"><%=article.getWriter()%></a></td>
    <td align="center"  width="150"><%= sdf.format(article.getReg_date())%></td>
    <td align="center"  width="50"><%=article.getReadcount()%></td>
    <td align="center" width="100" ><%=article.getIp()%></td>
  </tr>
     <%} // for end%>
</table>
<%}// end if~else %>

<%
    if (count > 0) {
    	// pageCount : 전체 페이지수        변수 = (조건식 ) ? 값1 : 값2;
        int pageCount = count / pageSize + ( (count % pageSize == 0) ? 0 : 1);
		 
//      int startPage = (int)(currentPage/10)*10+1;
		int startPage =(int)((currentPage-1)/10)*10+1;
		int pageBlock=10;
        int endPage = startPage + pageBlock-1;
        
        if (endPage > pageCount) endPage = pageCount;
        
        if (startPage > 10) {    %>
        <a href="list.jsp?pageNum=<%= startPage - 10 %>">[이전]</a>
<%      }
        
        for (int i = startPage ; i <= endPage ; i++) { 
       		if( i == currentPage){ 	%>
        		[<%=i %>]
<%          }else{ %>
        		<a href="list.jsp?pageNum=<%= i %>">[<%= i %>]</a>
<%          }
        }
       		
        if (endPage < pageCount) {  %>
        <a href="list.jsp?pageNum=<%= startPage + 10 %>">[다음]</a>
<%
        }
    }// end if
%>
</center>
</body>
</html>