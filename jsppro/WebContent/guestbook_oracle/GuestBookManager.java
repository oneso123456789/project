package madvirus.guestbook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//import madvirus.DBUtil;

public class GuestBookManager {
	
	// 싱글톤(Singleton): 객체생성을 1번만 수행
    private static GuestBookManager instance = new GuestBookManager();
    
    // 정적 메소드
    public static GuestBookManager getInstance() {
        return instance;
    }
    
    private GuestBookManager() {}
    
 // Connection Pool 설정 파일을 이용하는 방법
    private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
	 }
    
    public void insert(GuestBook book) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
//      Statement stmt = null;
//      ResultSet rs = null;
        
        try {
            conn = getConnection();
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery("select guestbook_seq.nextval from dual");
//            if (rs.next()) {
//                book.setId(rs.getInt(1));
//            }
            
          pstmt = conn.prepareStatement(
            "insert into GUESTBOOK "+
            "(GUESTBOOK_ID,REGISTER,NAME,EMAIL,PASSWORD,CONTENT) "+
            "values (guestbook_seq.nextval,sysdate,?,?,?,?)");
            
//          pstmt.setInt(1, book.getId());
         // pstmt.setTimestamp(1, book.getRegister());
            pstmt.setString(1, book.getName());
            pstmt.setString(2, book.getEmail());
            pstmt.setString(3, book.getPassword());
            pstmt.setString(4, book.getContent());
//          pstmt.setCharacterStream(5,
//              new StringReader(book.getContent()), book.getContent().length());
            
            pstmt.executeUpdate();
        } catch(Exception ex) {
            
        } finally {
       //   if (rs != null) try { rs.close(); } catch(SQLException ex) {}
//          if (stmt != null) try { stmt.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
    
    public void update(GuestBook book) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(
            "update GUESTBOOK set REGISTER=sysdate, NAME=?,EMAIL=?,PASSWORD=?,CONTENT=? "+
            " where GUESTBOOK_ID = ?");
            
     //     pstmt.setTimestamp(1, book.getRegister());
            pstmt.setString(1, book.getName());
            pstmt.setString(2, book.getEmail());
            pstmt.setString(3, book.getPassword());
            pstmt.setString(4, book.getContent());
//            pstmt.setCharacterStream(4,
//              new StringReader(book.getContent()), book.getContent().length());
            pstmt.setInt(5, book.getId());
            
            pstmt.executeUpdate();
        } catch(Exception ex) {
            
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
    
    public void delete(int guestBookId) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(
            "delete from GUESTBOOK where GUESTBOOK_ID = ?");
            pstmt.setInt(1, guestBookId);
            pstmt.executeUpdate();
        } catch(Exception ex) {
           
        } finally {
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
    
    public int getCount() throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        int count = 0;
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select count(*) from GUESTBOOK");
           
            if(rs.next()) {
       //     	  count = rs.getInt(1);
            	  count = rs.getInt("count(*)");
            }
            
        } catch(Exception ex) {
           
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (stmt != null) try { stmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
        return count;
    }
    
 // 검색어를 포함하는 레코드수를 구하는 부분
    public int getFcount(String sel, String find) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = null;
        int count=0;
        
        try {
            conn = getConnection();
            sql = "select count(*) from guestbook where " + sel + " like '%"+find+"%'";
            pstmt = conn.prepareStatement(sql);
 
            rs = pstmt.executeQuery();
           
            if (rs.next()) {
                count = rs.getInt(1);    
            }
           
        } catch(Exception ex) {
            
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
        return count;
    }
    
    public List getList(int startRow, int endRow)
     throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<GuestBook> list = null;
        GuestBook book = null;
        
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(
"select * from ( select GUESTBOOK_ID,REGISTER,NAME,PASSWORD,EMAIL,CONTENT,ROWNUM RNUM from ( " +
"   select * "+
"   from GUESTBOOK order by GUESTBOOK_ID desc "+
") )"+
" where RNUM <= ? and RNUM >= ?");
			
            pstmt.setInt(1, endRow);
            pstmt.setInt(2, startRow);
            rs = pstmt.executeQuery();
            
            if (rs.next()) {
                 list = new java.util.ArrayList();
                do {
                    book = new GuestBook();
  //                  book.id="test";
                    book.setId(rs.getInt("GUESTBOOK_ID"));
                    book.setRegister(rs.getTimestamp("REGISTER"));
                    book.setName(rs.getString("NAME"));
                    book.setEmail(rs.getString("EMAIL"));
                    book.setPassword(rs.getString("PASSWORD"));
                    book.setContent(rs.getString("CONTENT"));
                    
                    list.add(book);
     /*       Reader reader = null;
                    try {
                        reader = rs.getCharacterStream("CONTENT");
                        char[] buff = new char[512];
                        int len = -1;
                        StringBuffer buffer = new StringBuffer(512);
                        while( (len = reader.read(buff)) != -1) {
                            buffer.append(buff, 0, len);
                        }
                    book.setContent(buffer.toString());
                    } catch(IOException iex) {
                        throw new GuestBookException("getList", iex);
                    } finally {
                        if (reader != null) 
                            try {
                                reader.close(); 
                            } catch(IOException iex) {}
                    }
 */
                  
                } while(rs.next());
               
            } else {
                return java.util.Collections.EMPTY_LIST;
            }
        } catch(Exception ex) {
            
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
        return list;
    }
    
 // 검색어를 포함하는 레코드를 검색 하는 부분
    public List getFlist(int startRow, int endRow, String sel, String find)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = null;
        List list = null;
        
        try {
            conn = getConnection();
            sql = "select * from ( select GUESTBOOK_ID,REGISTER,NAME,PASSWORD,EMAIL,CONTENT,ROWNUM RNUM from (select * from guestbook where " + sel + " like '%"+find+"%' order by guestbook_id desc )) where RNUM <= ? and RNUM >= ?";
            pstmt = conn.prepareStatement(sql);			
            pstmt.setInt(1, endRow);
            pstmt.setInt(2, startRow);
            rs = pstmt.executeQuery();
            
            if(rs.next()) {
            		list = new java.util.ArrayList();
                do {
                    GuestBook book = new GuestBook();
                    book.setId(rs.getInt("GUESTBOOK_ID"));
                    book.setRegister(rs.getTimestamp("REGISTER"));
                    book.setName(rs.getString("NAME"));
                    book.setEmail(rs.getString("EMAIL"));
                    book.setPassword(rs.getString("PASSWORD"));
                    book.setContent(rs.getString("CONTENT"));
     
                    list.add(book);
                } while(rs.next());
                
            } else {
                return java.util.Collections.EMPTY_LIST;
            }
        } catch(Exception ex) {
            
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
        return list;
    }
    
    public GuestBook getGuestBook(int guestBookId) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        GuestBook book = null;
        try {
            conn = getConnection();
            pstmt = conn.prepareStatement(
            "select * from GUESTBOOK where GUESTBOOK_ID = ? ");
            pstmt.setInt(1, guestBookId);
            rs = pstmt.executeQuery();
            
            if(rs.next()) {
                 book = new GuestBook();
                book.setId(rs.getInt("GUESTBOOK_ID"));
                book.setRegister(rs.getTimestamp("REGISTER"));
                book.setName(rs.getString("NAME"));
                book.setEmail(rs.getString("EMAIL"));
                book.setPassword(rs.getString("PASSWORD"));
                book.setContent(rs.getString("Content"));
          /*      
                Reader reader = null;
                try {
                    reader = rs.getCharacterStream("CONTENT");
                    char[] buff = new char[512];
                    int len = -1;
                    StringBuffer buffer = new StringBuffer(512);
                    while( (len = reader.read(buff)) != -1) {
                        buffer.append(buff, 0, len);
                    }
                    book.setContent(buffer.toString());
                } catch(Exception iex) {
                   
                } finally {
                    if (reader != null) 
                        try {
                            reader.close(); 
                        } catch(Exception iex) {}
                }*/
                
            } else {
                return null;    
            }
        } catch(Exception ex) {
           
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }  
        return book;
    } 
}