import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Connect02 {

	public static void main(String[] args) {

		/** ORACLE JDBC Driver Test *****************************************/
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@192.168.30.78:1521:xe";
		/*******************************************************************/

		/** My-SQL JDBC Driver *********************************************/
		 String driver ="com.mysql.jdbc.Driver";
		 String url = "jdbc:mysql://localhost/jsptest";
		/*******************************************************************/

		Connection con = null;

		try {
			// JDBC ���
			Class.forName(driver);//JDBC Driver Loading

			/** ORACLE���� Connection ��ü ***********************************/
//			con = DriverManager.getConnection(url, "scott", "tiger");
			/*******************************************************************/

			/** My-SQL���� Connection ��ü ***********************************/
			 con = DriverManager.getConnection(url, "jspid", "jsppass" );
			/*******************************************************************/

			System.out.println("�����ͺ��̽� ���� ����~!!");

		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ����~!!");
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
