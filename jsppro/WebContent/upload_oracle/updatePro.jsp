<%@page import="java.util.StringTokenizer"%>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="upload.UploadDataBean" %>
<%@ page import = "upload.UploadDBBean" %>
<%@ page import = "java.sql.Timestamp" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>

<% // request.setCharacterEncoding("utf-8"); 
 
	UploadDataBean article = new UploadDataBean();

	String uploadPath=request.getRealPath("upload");;
	int size = 10*1024*1024; //10MB까지 업로드 가능 
	
	MultipartRequest multi=new MultipartRequest(request,
			uploadPath,
			size, 
			"utf-8",
			new DefaultFileRenamePolicy());			
		
		article.setNum(Integer.parseInt(multi.getParameter("num")));
	  	article.setWriter(multi.getParameter("writer"));
	  	article.setSubject(multi.getParameter("subject"));
	  	article.setEmail(multi.getParameter("email"));		
	  	
		article.setUpload(multi.getFilesystemName((String)multi.getFileNames().nextElement()));
	
		article.setContent(multi.getParameter("content"));
		article.setPasswd(multi.getParameter("passwd"));
        article.setReg_date(new	Timestamp(System.currentTimeMillis()) );
    	article.setIp(request.getRemoteAddr());  
    	
    	String pageNum = multi.getParameter("pageNum");

		UploadDBBean dbPro = UploadDBBean.getInstance();
    	int check = dbPro.updateArticle(article);

    	out.println(check);
//	out.println(pageNum);

   	if(check==1){
%>
		<script>	
			alert("레코드 수정 성공");
			location.href="list.jsp?pageNum=<%=pageNum%>";
		</script>

	<% }else{%>

      	<script language="JavaScript">      	    
        	alert("비밀번호가 맞지 않습니다");
        	history.go(-1);     
     	</script>

<%     }  %>
 	
