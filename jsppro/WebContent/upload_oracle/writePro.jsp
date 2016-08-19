<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="upload.UploadDataBean" %>
<%@ page import = "upload.UploadDBBean" %>
<%@ page import = "java.sql.Timestamp" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>

<% // request.setCharacterEncoding("utf-8"); 
 
//	String s = request.getParameter("writer");
//	System.out.println("s="+s);
	
	UploadDataBean article = new UploadDataBean();

	String uploadPath=request.getRealPath("upload");;
	int size = 10*1024*1024; //10MB까지 업로드 가능 
	
	MultipartRequest multi=new MultipartRequest(request,
			uploadPath,
			size, 
			"utf-8",
			new DefaultFileRenamePolicy());			
	 
//	String s1 = request.getParameter("writer");
//	System.out.println("s1="+s1);
	
		article.setNum(Integer.parseInt(multi.getParameter("num")));
		article.setRef(Integer.parseInt(multi.getParameter("ref")));
		article.setRe_step(Integer.parseInt(multi.getParameter("re_step")));
		article.setRe_level(Integer.parseInt(multi.getParameter("re_level")));
		
	  	article.setWriter(multi.getParameter("writer"));
	  	article.setSubject(multi.getParameter("subject"));
	  	article.setEmail(multi.getParameter("email"));		
	  	
//		article.setUpload(multi.getFilesystemName("uploadFile"));	  	
		article.setUpload(multi.getFilesystemName((String)multi.getFileNames().nextElement()));
				
		article.setContent(multi.getParameter("content"));
		article.setPasswd(multi.getParameter("passwd"));
        article.setReg_date(new	Timestamp(System.currentTimeMillis()) );
    	article.setIp(request.getRemoteAddr()); 
    	
        UploadDBBean dbPro = UploadDBBean.getInstance();
        dbPro.insertArticle(article);%>       
        
        <script>
    		alert("글 작성 성공");
    		location.href="list.jsp";
    	</script>    	
   




