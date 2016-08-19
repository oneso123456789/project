<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page errorPage = "error.jsp" %>
<%@ page import = "madvirus.guestbook.GuestBookManager" %>
<%@ page import = "madvirus.guestbook.GuestBook" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>

<%
//	request.setCharacterEncoding("utf-8");

	// 검색어를 받는 부분
	String	sel = request.getParameter("sel");
	String	find = request.getParameter("find");
	
    int PAGE_SIZE = 10;  //한 화면에 출력할 레코드 수
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
      
    String pageNum = request.getParameter("num");
  	if (pageNum == null) {
        pageNum = "1";
    }  
 	// 현재 페이지 번호
    int currentPage = Integer.parseInt(pageNum); 
   
    int startRow = (currentPage - 1) * PAGE_SIZE + 1;
    int endRow = currentPage * PAGE_SIZE;
   
    int count = 0;  // 1페이지 :  startRow = 1, endRow =10;
    int fcount = 0;	// 2페이지 :  startRow = 11, endRow =20;
    int number=0;
    int fnumber=0;
    
    List<GuestBook> bookList = null;
    List bookFlist = null;
    
//  GuestBookManager m = new GuestBookManager();
    
    GuestBookManager manager = GuestBookManager.getInstance();
   
    count = manager.getCount(); // count : 전체 레코드수
    fcount = manager.getFcount(sel, find); // fcount : 검색한 레코드수
    out.print("count="+count+"<br>");
    out.print("fcount="+fcount+"<br>");
    out.print("sel="+sel+"<br>");
    out.print("find="+find+"<br>");
    
    if(count > 0) {
        bookList = manager.getList(startRow, endRow);
    }
    if(fcount > 0) {
        bookFlist = manager.getFlist(startRow, endRow, sel, find);
    }
%>

<html>
		<head><title>글목록</title>
		<script>
			function check(){
				if(document.myform.find.value == ""){
					alert("검색어를 입력 하세요~~!!");
					document.myform.find.focus();
					return false;
				}	
			}		
		</script>
		</head>
		<body>
		<center>

		<table width="600">
			<tr><td><a href="writeForm.jsp">글쓰기</a></td>
				<td align=right><a href="list.jsp">글목록</a></td>
			</tr>
		</table>

<%  // 테이블에 저장된 레코드가 없으면
    if (count == 0) { 
%>
		<script>
			alert("데이터가 없습니다.");			
		</script>
	
	<!-- 테이블에 저장된 레코드가 있으면 -->
<%  }else if(count != 0 && fcount == 0 && find == null){   %>  

		<table width="600" border="1" cellpadding="0" cellspacing="0">

		<%// number= 122 - (1-1) * 10;  122
		  // number= 122 - (2-1) * 10;  112
			number=count-(currentPage-1)*PAGE_SIZE;		
			for (int i = 0 ; i < bookList.size() ; i++) {
				GuestBook book = bookList.get(i);
		%>

			<tr><td bgcolor="#e9e9e9">
					<%=number-- %>&nbsp;&nbsp;
					<b><%= book.getName() %>(<%= book.getEmail() %>)</b>
						- <font size="2">

    	<%= formatter.format(book.getRegister()) %>

    	<% if (book.getPassword() != null && !book.getPassword().equals("")) { %>

			<a href="updateForm.jsp?id=<%= book.getId()%>&num=<%=currentPage%>">[수정]</a>
			<a href="deleteForm.jsp?id=<%= book.getId()%>&num=<%=currentPage%>">[삭제]</a>
    	<%	} %>

					</font></td>
			</tr>
			<tr><td><pre><%= book.getContent() %></pre></td>
			</tr>

		<%  } //for end  %>

		</table>

	<!-- 테이블에 검색된 레코드가 있으면 -->
<%  } else if(count > 0 && fcount != 0){    %>  

		<table width="600" border="1" cellpadding="0" cellspacing="0">

		<%
			fnumber=fcount-(currentPage-1)*PAGE_SIZE;
		
			for (int i = 0 ; i < bookFlist.size() ; i++) {
				GuestBook book = (GuestBook)bookFlist.get(i);
		%>

			<tr><td bgcolor="#e9e9e9">
					<%=fnumber--%>&nbsp;&nbsp;
					<b><%= book.getName() %>(<%= book.getEmail() %>)</b>
						- <font size="2">

    	<%= formatter.format(book.getRegister()) %>

    	<% if (book.getPassword() != null && !book.getPassword().equals("")) { %>

			<a href="updateForm.jsp?id=<%= book.getId()%>&num=<%=currentPage%>">[수정]</a>
			<a href="deleteForm.jsp?id=<%= book.getId()%>&num=<%=currentPage%>">[삭제]</a>
    	<% } %>
					</font></td>
			</tr>
			<tr><td><pre><%= book.getContent() %></pre></td>
			</tr>
<%      	} //for end  %>

		</table>		

	<!--  검색된 레코드가 없을때 -->
<% 	 }else { %>
		<script>
//			alert("검색된 데이터가 없습니다.");
//			location.href="list.jsp";
		</script>	
<%	}	%>



<%  // 전체 레코드로 페이지 링크 설정          변수 = (조건식) ? 값1 : 값2;
    if (count > 0 && fcount == 0) {
    	//pageCount : 전체 페이지 수 
        int pageCount = count / PAGE_SIZE + ( (count % PAGE_SIZE == 0) ? 0 : 1);	


//       int startPage = currentPage / PAGE_SIZE + 1; (원본-안됨)
//       int startPage = currentPage-(currentPage%10)+1; (1차수정 -부족)
//		 int startPage = ((currentPage-1)/block의 페이지수)*block의 페이지수+1; (완성)
		 int startPage = ((currentPage-1)/10)*10+1;
//		 currentPage=1   -> startPage=1	
//		 currentPage=10  -> startPage=1	

 //       int endPage = startPage + 10;
		  int endPage = startPage + 10 - 1;
//          20 > 13
        if (endPage > pageCount) {
			endPage = pageCount; //13
		}
         
        if (startPage > 10) {    %>
			<a href="list.jsp?num=<%= startPage - 10 %>">[이전]</a>

<%      }

        for (int i = startPage ; i <= endPage ; i++) {  
			
        	if(i == currentPage){ %>
				[<%= i %>]
<% 			}else{ %>
				<a href="list.jsp?num=<%= i %>">[<%= i %>]</a> 
<%			}

        }// for end

//      if ( 10 < 13)
        if (endPage < pageCount) {  %>
			<a href="list.jsp?num=<%= startPage + 10 %>">[다음]</a>

<%
        }
       
        
    // 검색할때 페이지 링크 설정    
    }else if(fcount > 0){
       int pageCount = fcount / PAGE_SIZE + ( (fcount % PAGE_SIZE == 0) ? 0 : 1);	
	   int startPage = ((currentPage-1)/10)*10+1;     
	   int endPage = startPage + 10 - 1;

       if (endPage > pageCount) {endPage = pageCount;}       
       if (startPage > 10) {    %>
			<a href="list.jsp?num=<%= startPage - 10 %>&sel=<%=sel%>&find=<%=find%>">[이전]</a>
<%      }
       
       for (int i = startPage ; i <= endPage ; i++) {  
			
       	if(i == currentPage){ %>
				[<%= i %>]
<% 			}else{ %>
				<a href="list.jsp?num=<%= i %>&sel=<%=sel%>&find=<%=find%>">[<%= i %>]</a> 
<%			}       	
       }
       
       if (endPage < pageCount) {  %>
			<a href="list.jsp?num=<%= startPage + 10 %>&sel=<%=sel%>&find=<%=find%>">[다음]</a>
<%
       }
    }
%>

<br><br><br>
<form name=myform method=get action="list.jsp" onSubmit="return check()">	
	<select name="sel">		
		<option value="name">이름</option>
		<option value="email">E-MAIL</option>
		<option value="content">내용</option>	
	</select>
	<input type=text name="find">
	<input type=submit value="검색">
</form>



