package JavaBeanMember.register;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
 public class LogonDBBean {
    
 	private static LogonDBBean instance = new LogonDBBean();
    
    public static LogonDBBean getInstance() {
        return instance;
    }
    
    private LogonDBBean() {
    }
/*    
    private Connection getConnection() throws Exception {
      Context initCtx = new InitialContext();
      Context envCtx = (Context) initCtx.lookup("java:comp/env");
      DataSource ds = (DataSource)envCtx.lookup("jdbc/jsptest");
      return ds.getConnection();
    }
*/
    // 회원 가입
    public void insertMember(LogonDataBean member) 
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;

		String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
		String dbId="scott";
		String dbPass="tiger";
        
        try {
//            conn = getConnection();	
        	// JDBC방식
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(jdbcUrl,dbId ,dbPass );
            
            pstmt = conn.prepareStatement(
            	"insert into MEMBER1 values (?,?,?,?,?,?,?,sysdate)");
            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getPasswd());
            pstmt.setString(3, member.getName());
            pstmt.setString(4, member.getJumin1());
            pstmt.setString(5, member.getJumin2());
            pstmt.setString(6, member.getEmail());
            pstmt.setString(7, member.getBlog());
//			pstmt.setTimestamp(8, member.getReg_date());
            int result = pstmt.executeUpdate();
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
    
    
    
    // 회원 목록 출력
    public List selectMember() throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    	        ResultSet rs = null;    	        

    			String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
    			String dbId="scott";
    			String dbPass="tiger";
    	        
    	        try {
//    	            conn = getConnection();	
    		 
    				Class.forName("oracle.jdbc.driver.OracleDriver");
    				conn=DriverManager.getConnection(jdbcUrl,dbId ,dbPass );
    	            
    	            pstmt = conn.prepareStatement("select * from member1");    	            
    	            rs = pstmt.executeQuery(); 
    	            
    	            
    	            List<LogonDataBean> li =  new ArrayList<LogonDataBean>();
    	            while(rs.next()){
    	            	LogonDataBean db =  new LogonDataBean();
    	          //  	db.id="test";
    	            	db.setId(rs.getString("id"));
    	            	db.setPasswd(rs.getString("passwd"));
    	            	db.setName(rs.getString("name"));
    	            	db.setJumin1(rs.getString("jumin1"));
    	            	db.setJumin2(rs.getString("jumin2"));
    	            	db.setEmail(rs.getString("email"));
    	            	db.setBlog(rs.getString("blog"));
    	            	db.setReg_date(rs.getTimestamp("reg_date"));
    	            	li.add(db);
    	            }  	            
    	            
    	            return li;
    	            
    	        } catch(Exception ex) {
    	            ex.printStackTrace();
    	        } finally {
    	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
    	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
    	        }
    	        return null;
    	    }
    
    
 }

