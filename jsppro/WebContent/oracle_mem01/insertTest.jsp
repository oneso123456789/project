<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="java.sql.*"%>

<%
  request.setCharacterEncoding("euc-kr");

  String id= request.getParameter("id");
  String passwd= request.getParameter("passwd");
  String name= request.getParameter("name");
  Timestamp register=new Timestamp(System.currentTimeMillis());

  Connection conn=null;
  PreparedStatement pstmt=null;
  
  try{
	String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
    String dbId="totoro";
    String dbPass="totoro123";
	 
    //JDBC 방식
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn=DriverManager.getConnection(jdbcUrl,dbId ,dbPass );
	
	String sql= "insert into member1 values (?,?,?,sysdate)";
	pstmt=conn.prepareStatement(sql);
	pstmt.setString(1,id);
    pstmt.setString(2,passwd);
	pstmt.setString(3,name);
//	pstmt.setTimestamp(4,register);
	pstmt.executeUpdate();

	}catch(Exception e){ 
		e.printStackTrace();
	}finally{
		if(pstmt != null) try{pstmt.close();}catch(SQLException sqle){}
		if(conn != null) try{conn.close();}catch(SQLException sqle){}
	}
%>

<html>
<head><title>레코드 삽입(추가)예제</title></head>
<body>
  
  <script>
  	alert("회원가입 성공");
  	location.href="selectTest.jsp";
  </script>
   
</body>
</html>