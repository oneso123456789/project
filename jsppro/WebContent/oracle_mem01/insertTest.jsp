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
	 
    //JDBC ���
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
<head><title>���ڵ� ����(�߰�)����</title></head>
<body>
  
  <script>
  	alert("ȸ������ ����");
  	location.href="selectTest.jsp";
  </script>
   
</body>
</html>