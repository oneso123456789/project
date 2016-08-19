 package upload;
 
 import java.sql.*;
 import javax.sql.*; //javax.sql.DataSource;
 import javax.naming.*; //javax.naming.Context;
 import java.util.*;
 import java.io.*;
 
 public class UploadDBBean {
    
 	private static UploadDBBean instance = new UploadDBBean();
    
    public static UploadDBBean getInstance() {
        return instance;
    }
    
    private UploadDBBean() {
    }
   
	// Connection Pool 설정 파일을 이용하는 방법
/*  private Connection getConnection() throws Exception {
        return DriverManager.getConnection(
            "jdbc:apache:commons:dbcp:/pool" );
    }*/
	
	/* server.xml 파일을 이용하는 방법 */
	private Connection getConnection() throws Exception {

	  // InitialContext 객체를 생성해서 initCtx 레퍼런스에 할당
      Context initCtx = new InitialContext();

	  // initCtx 객체를 가지고 lookup()메소드를 사용해서 "java:comp/env" 이름에 해당하는 객체를 리턴받는다.
	  // 이때 객체를  원하는 타입으로 형 변환해서 envCtx 레퍼런스에 할당 받는다.
      Context envCtx = (Context) initCtx.lookup("java:comp/env");
	  
	  // envCtx 객체를 가지고 lookup() 메소드를 사용해서 "jdbc/academy"에 해당하는 객체를 리턴 받는다.
	  // DataSource로 형변환해서 ds 레퍼런스에 할당한다.
      DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
      return ds.getConnection();
    }


    public void insertArticle(UploadDataBean article) 
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
		ResultSet rs = null;

		int num=article.getNum();
		int ref=article.getRef();
		int re_step=article.getRe_step();
		int re_level=article.getRe_level();
		int number=0;
        String sql="";
		String sql_01="";

        try {
            conn = getConnection();

            pstmt = conn.prepareStatement("select max(num) from upload");
			rs = pstmt.executeQuery();
			
			if (rs.next())
		      number=rs.getInt(1)+1;
		    else		//처음 글을 작성하는 경우
		      number=1; 
		   
		    if (num!=0)   // 답변글
		    {  
		      sql="update upload set re_step=re_step+1 where ref= ? and re_step> ?";
              pstmt = conn.prepareStatement(sql);
              pstmt.setInt(1, ref);
			  pstmt.setInt(2, re_step);
			  pstmt.executeUpdate();
			  
			  num = number;
			  re_step=re_step+1;
			  re_level=re_level+1;
		     }else{			// 원문
		      num = number;
		  	  ref=number;
			  re_step=0;
			  re_level=0;
		     }	 
            // 쿼리를 작성
/************ MySQL 부분 ***************************
            sql = "insert into upload(writer,email,subject,passwd,reg_date,";
		    sql+="ref,re_step,re_level,content,ip,filename) values(?,?,?,?,?,?,?,?,?,?,?)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, article.getWriter());
            pstmt.setString(2, article.getEmail());
            pstmt.setString(3, article.getSubject());
            pstmt.setString(4, article.getPasswd());
			pstmt.setTimestamp(5, article.getReg_date());
            pstmt.setInt(6, ref);
            pstmt.setInt(7, re_step);
            pstmt.setInt(8, re_level);
			pstmt.setString(9, article.getContent());
			pstmt.setString(10, article.getIp());
			pstmt.setString(11, article.getUpload());
*/
/************************************ ORACLE 연동 부분 ******************************************/

	        sql_01 = "insert into upload (num,writer,email,subject,passwd,reg_date,readcount,";
		    sql_01+="ref,re_step,re_level,content,ip,filename) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
            pstmt = conn.prepareStatement(sql_01);
            pstmt.setInt(1, num);
            pstmt.setString(2, article.getWriter());
            pstmt.setString(3, article.getEmail());
            pstmt.setString(4, article.getSubject());
            pstmt.setString(5, article.getPasswd());
			pstmt.setTimestamp(6, article.getReg_date());
			pstmt.setInt(7, article.getReadcount());
            pstmt.setInt(8, ref);
            pstmt.setInt(9, re_step);
            pstmt.setInt(10, re_level);
			pstmt.setString(11, article.getContent());
			pstmt.setString(12, article.getIp());
			pstmt.setString(13, article.getUpload());

/********************************* ORACLE 연동 부분 end *********************************************/

            pstmt.executeUpdate();
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
    
	public int getArticleCount()
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        int x=0;

        try {
            conn = getConnection();
            
            pstmt = conn.prepareStatement("select count(*) from upload");
            rs = pstmt.executeQuery();

            if (rs.next()) {
               x= rs.getInt(1);
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
		return x;
    }

	public List getArticles(int start, int end)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List articleList=null;
		String sql02="";

        try {
            conn = getConnection();
 
/*********** MySQL 부분 ***************************
            pstmt = conn.prepareStatement(
            	"select * from upload order by ref desc, re_step asc limit ?,? ");
            pstmt.setInt(1, start-1);
			pstmt.setInt(2, end);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                articleList = new ArrayList(end);
                do{
                  UploadDataBean article= new UploadDataBean();
				  article.setNum(rs.getInt("num"));
				  article.setWriter(rs.getString("writer"));
                  article.setEmail(rs.getString("email"));
                  article.setSubject(rs.getString("subject"));
                  article.setPasswd(rs.getString("passwd"));
			      article.setReg_date(rs.getTimestamp("reg_date"));
				  article.setReadcount(rs.getInt("readcount"));
                  article.setRef(rs.getInt("ref"));
                  article.setRe_step(rs.getInt("re_step"));
				  article.setRe_level(rs.getInt("re_level"));
                  article.setContent(rs.getString("content"));
			      article.setIp(rs.getString("ip"));
				  article.setUpload(rs.getString("filename")); 
*/

/******************** Oracle 연동 부분 ***************************/

    sql02 = "select * from ";
    sql02 += "(select num,writer,email,subject,passwd,reg_date,readcount,";
    sql02 += " ref,re_step,re_level,content,ip,filename,rownum rnum from ";
	sql02 += " ( select * from upload order by ref desc, re_step asc )) ";
	sql02 += "  where rnum <= ? and rnum >= ? ";

			 pstmt = conn.prepareStatement(sql02);
			 pstmt.setInt(1, end);
			 pstmt.setInt(2, start);
			 rs = pstmt.executeQuery();           

            if (rs.next()) {
                articleList = new ArrayList();
                do{
                  UploadDataBean article= new UploadDataBean();
				  article.setNum(rs.getInt("num"));
				  article.setWriter(rs.getString("writer"));
                  article.setEmail(rs.getString("email"));
                  article.setSubject(rs.getString("subject"));
                  article.setPasswd(rs.getString("passwd"));
			      article.setReg_date(rs.getTimestamp("reg_date"));
				  article.setReadcount(rs.getInt("readcount"));
                  article.setRef(rs.getInt("ref"));
                  article.setRe_step(rs.getInt("re_step"));
				  article.setRe_level(rs.getInt("re_level"));
                  article.setContent(rs.getString("content"));
			      article.setIp(rs.getString("ip")); 
				  article.setUpload(rs.getString("filename"));
			  
				  articleList.add(article);
			    }while(rs.next());
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
		return articleList;
    }
 
    public UploadDataBean getArticle(int num)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        UploadDataBean article=null;
        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(
            	"update upload set readcount=readcount+1 where num = ?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

            pstmt = conn.prepareStatement(
            	"select * from upload where num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                article = new UploadDataBean();
                article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
                article.setEmail(rs.getString("email"));
                article.setSubject(rs.getString("subject"));
                article.setPasswd(rs.getString("passwd"));
			    article.setReg_date(rs.getTimestamp("reg_date"));
				article.setReadcount(rs.getInt("readcount"));
                article.setRef(rs.getInt("ref"));
                article.setRe_step(rs.getInt("re_step"));
				article.setRe_level(rs.getInt("re_level"));
                article.setContent(rs.getString("content"));
			    article.setIp(rs.getString("ip"));
				article.setUpload(rs.getString("filename"));
				
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
		return article;
    }

    public UploadDataBean updateGetArticle(int num)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        UploadDataBean article=null;
        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(
            	"select * from upload where num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                article = new UploadDataBean();
                article.setNum(rs.getInt("num"));
				article.setWriter(rs.getString("writer"));
                article.setEmail(rs.getString("email"));
                article.setSubject(rs.getString("subject"));
                article.setPasswd(rs.getString("passwd"));
			    article.setReg_date(rs.getTimestamp("reg_date"));
				article.setReadcount(rs.getInt("readcount"));
                article.setRef(rs.getInt("ref"));
                article.setRe_step(rs.getInt("re_step"));
				article.setRe_level(rs.getInt("re_level"));
                article.setContent(rs.getString("content"));
			    article.setIp(rs.getString("ip"));
				article.setUpload(rs.getString("filename"));
				
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
		return article;
    }

    public int updateArticle(UploadDataBean article)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs= null;

        String dbpasswd="";
        String sql="";
		int x=-1;
        try {
            conn = getConnection();
            
			pstmt = conn.prepareStatement(
            	"select passwd from upload where num = ?");
            pstmt.setInt(1, article.getNum());
            rs = pstmt.executeQuery();
            
			if(rs.next()){
			  dbpasswd= rs.getString("passwd"); 
			  if(dbpasswd.equals(article.getPasswd())){
                sql="update upload set writer=?,email=?,subject=?,passwd=?";
			    sql+=",content=?, filename=? where num=?";
                pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, article.getWriter());
                pstmt.setString(2, article.getEmail());
                pstmt.setString(3, article.getSubject());
                pstmt.setString(4, article.getPasswd());
                pstmt.setString(5, article.getContent());
			    pstmt.setString(6, article.getUpload());
			    pstmt.setInt(7, article.getNum());
                pstmt.executeUpdate();
				x= 1;
			  }else{
				x= 0;
			  }
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
		return x;
    }
    
    public int deleteArticle(int num, String passwd)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs= null;
        String dbpasswd="";
        String fileName="";
        int x=-1;
        try {
			conn = getConnection();

            pstmt = conn.prepareStatement(
            	"select * from upload where num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            
			if(rs.next()){
				dbpasswd= rs.getString("passwd"); 
				if(dbpasswd.equals(passwd)){
					pstmt = conn.prepareStatement(
            	      "delete from upload where num=?");
                    pstmt.setInt(1, num);
                    pstmt.executeUpdate();
                    
                    fileName = rs.getString("filename");                    
                    File file = new File( "C:/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/jsppro/upload");   
                    file.mkdirs();
                    File[] f =file.listFiles();
            	    for(int i=0; i<f.length; i++){
            	    	if(f[i].getName().equals(fileName)){
            	    		f[i].delete();	//파일 삭제    	
            	    	}
            	    }
                    
					x= 1; //글삭제 성공
				}else
					x= 0; //비밀번호 틀림
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
		return x;
    }
 }