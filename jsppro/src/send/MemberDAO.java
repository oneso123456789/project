package send;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import board.BoardDBBean;
import board.BoardDataBean;

public class MemberDAO {

	// 싱글톤:객체를 1개만 생성해서 공유	
	private static MemberDAO instance = new MemberDAO();
	    
	    public static MemberDAO getInstance() {
	        return instance;
	    }
		    
	
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
	    public void insertArticle(MemberDTO article) 
	    throws Exception {
	        Connection conn = null;
	        PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			int number=0;
	        String sql="";
			String sql_01="";

	        try {
	            conn = getConnection();	            

	/************************************ ORACLE 연동 부분 ******************************************/

		        sql_01 = "insert into member0(id,pw,name,vclass,phone) values(?,?,?,?,?)";
			   				
	            pstmt = conn.prepareStatement(sql_01);	      
	            pstmt.setString(1, article.getId());
	            pstmt.setString(2, article.getPw());
	            pstmt.setString(3, article.getName());
	            pstmt.setString(4, article.getVclass());	
	           	pstmt.setString(5, article.getPhone());
				
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
	    
}
