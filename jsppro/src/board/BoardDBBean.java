package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class BoardDBBean {

// 싱글톤:객체를 1개만 생성해서 공유	
private static BoardDBBean instance = new BoardDBBean();
    
    public static BoardDBBean getInstance() {
        return instance;
    }
    
    private BoardDBBean() {
    }
    
   // Connection Pool 설정 파일을 이용하는 방법
//   private Connection getConnection() throws Exception {
//        return DriverManager.getConnection(
//            "jdbc:apache:commons:dbcp:/pool" );
//   }

/* server.xml 파일을 이용하는 방법*/
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

    // 게시판 글작성
    public void insertArticle(BoardDataBean article) 
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int number=0;
        String sql="";
		String sql_01="";

        try {
            conn = getConnection();

            pstmt = conn.prepareStatement("select max(num) from board0");
			rs = pstmt.executeQuery();
			
			if(rs.next())  // 원문
		      number=rs.getInt(1)+1;
		    else
		      number=1;   //처음으로 글을 작성한 경우
   

/************************************ ORACLE 연동 부분 ******************************************/

	        sql_01 = "insert into board0 (num,writer,email,subject,passwd,reg_date,readcount,";
//		    sql_01+="ref,re_step,re_level,content,ip) values(board_seq.nextval,?,?,?,?,?,?,?,?,?,?,?)";
	        sql_01 += "content,ip) values(board0_seq.nextval,?,?,?,?,sysdate,?,?,?)";
			
            pstmt = conn.prepareStatement(sql_01);
    //      pstmt.setInt(1, number);
            pstmt.setString(1, article.getWriter());
            pstmt.setString(2, article.getEmail());
            pstmt.setString(3, article.getSubject());
            pstmt.setString(4, article.getPasswd());
		//	pstmt.setTimestamp(6, article.getReg_date());
			pstmt.setInt(5, article.getReadcount());
           	pstmt.setString(6, article.getContent());
			pstmt.setString(7, article.getIp());

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
    
    
    // 게시물 갯수 구하기
    public int getArticleCount()
    	    throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    	        ResultSet rs = null;

    	        int x=0;

    	        try {
    	            conn = getConnection();
    	            
    	            pstmt = conn.prepareStatement("select count(*) from board0");
    	            rs = pstmt.executeQuery();

    	            if(rs.next()) {
    	 //            x= rs.getInt(1);
    	               x=rs.getInt("count(*)");
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
    
    
    
    // 게시물 목록(10개 추출)
    public List getArticles(int start, int end)
    	    throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    	        ResultSet rs = null;
    	        List<BoardDataBean> articleList=null;
    			String sql02 = "";
    	        try {
    	            conn = getConnection();
    	            

    	/************************ Oracle 연동 부분 *************************************/

//    	          sql02 = "select num,writer,email,subject,passwd,reg_date,readcount,ref,re_step,re_level,content,ip from ";
//    	        	sql02 += " ( select num,writer,email,subject,passwd,reg_date,readcount,ref,re_step,re_level,content,ip,rownum rnum from board order by ref desc, re_step asc )  ";
//    	        	sql02 += "  where rnum <= ? and rnum >= ? ";
    	        	
    	        	sql02 = "select * from ";
    	        	sql02 += "( select num,writer,email,subject,passwd,reg_date,";
    	        	sql02 += " readcount, content,ip,rownum rnum from ";
    	        	sql02 += "( select * from board0 order by num desc)) ";
    	        	sql02 += " where rnum <= ? and rnum >= ? ";

    				 pstmt = conn.prepareStatement(sql02);
    				 pstmt.setInt(1, end);
    				 pstmt.setInt(2, start);
    				 rs = pstmt.executeQuery();           

    	            if (rs.next()) {
    	                articleList = new ArrayList();
    	                do{
    	                  BoardDataBean article= new BoardDataBean();
 //   	                  article.num=100;
    	                  article.setNum(rs.getInt("num"));
    					  article.setWriter(rs.getString("writer"));
    	                  article.setEmail(rs.getString("email"));
    	                  article.setSubject(rs.getString("subject"));
    	                  article.setPasswd(rs.getString("passwd"));
    				      article.setReg_date(rs.getTimestamp("reg_date"));
    					  article.setReadcount(rs.getInt("readcount"));    	                 
    	                  article.setContent(rs.getString("content"));
    				      article.setIp(rs.getString("ip")); 
    					  
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
    
    
    
    // 글 내용 추출 부분
    public BoardDataBean getArticle(int num)
    	    throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    	        ResultSet rs = null;
    	        BoardDataBean article=null;
    	        try {
    	            conn = getConnection();

    	            pstmt = conn.prepareStatement(
    	            	"update board0 set readcount=readcount+1 where num = ?");
    				pstmt.setInt(1, num);
    				pstmt.executeUpdate();

    	            pstmt = conn.prepareStatement(
    	            	"select * from board0 where num = ?");
    	            pstmt.setInt(1, num);
    	            rs = pstmt.executeQuery();

    	            if(rs.next()) {
    	                article = new BoardDataBean();
    	                article.setNum(rs.getInt("num"));
    					article.setWriter(rs.getString("writer"));
    	                article.setEmail(rs.getString("email"));
    	                article.setSubject(rs.getString("subject"));
    	                article.setPasswd(rs.getString("passwd"));
    				    article.setReg_date(rs.getTimestamp("reg_date"));
    					article.setReadcount(rs.getInt("readcount"));    	                
    	                article.setContent(rs.getString("content"));
    				    article.setIp(rs.getString("ip"));     
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
    
    
    
    // 게시판 수정폼에 출력
    public BoardDataBean updateGetArticle(int num)
    	    throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    	        ResultSet rs = null;
    	        BoardDataBean article=null;
    	        try {
    	            conn = getConnection();

    	            pstmt = conn.prepareStatement(
    	            	"select * from board0 where num = ?");
    	            pstmt.setInt(1, num);
    	            rs = pstmt.executeQuery();

    	            if (rs.next()) {
    	                article = new BoardDataBean();
    	                article.setNum(rs.getInt("num"));
    					article.setWriter(rs.getString("writer"));
    	                article.setEmail(rs.getString("email"));
    	                article.setSubject(rs.getString("subject"));
    	                article.setPasswd(rs.getString("passwd"));
    				    article.setReg_date(rs.getTimestamp("reg_date"));
    					article.setReadcount(rs.getInt("readcount"));    	                
    	                article.setContent(rs.getString("content"));
    				    article.setIp(rs.getString("ip"));     
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
    
    
    // 게시판 수정
    public int updateArticle(BoardDataBean article)
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
    	            	"select passwd from board0 where num = ?");
    	            pstmt.setInt(1, article.getNum());
    	            rs = pstmt.executeQuery();
    	            
    				if(rs.next()){
    				  dbpasswd= rs.getString("passwd"); 
    				  if(dbpasswd.equals(article.getPasswd())){
    	                sql="update board0 set writer=?,email=?,subject=?,passwd=?";
    				    sql+=",content=? where num=?";
    	                pstmt = conn.prepareStatement(sql);

    	                pstmt.setString(1, article.getWriter());
    	                pstmt.setString(2, article.getEmail());
    	                pstmt.setString(3, article.getSubject());
    	                pstmt.setString(4, article.getPasswd());
    	                pstmt.setString(5, article.getContent());
    				    pstmt.setInt(6, article.getNum());
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
    
    
    // 게시판 삭제
    public int deleteArticle(int num, String passwd)
    	    throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    	        ResultSet rs= null;
    	        String dbpasswd="";
    	        int x=-1;
    	        try {
    				conn = getConnection();

    	            pstmt = conn.prepareStatement(
    	            	"select passwd from board0 where num = ?");
    	            pstmt.setInt(1, num);
    	            rs = pstmt.executeQuery();
    	            
    				if(rs.next()){
    					dbpasswd= rs.getString("passwd"); 
    					if(dbpasswd.equals(passwd)){
    						pstmt = conn.prepareStatement(
    	            	      "delete from board0 where num=?");
    	                    pstmt.setInt(1, num);
    	                    pstmt.executeUpdate();
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
