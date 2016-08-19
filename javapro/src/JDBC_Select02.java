import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

import java.sql.Timestamp;

class JDBC_Select02 {
	public static void main(String[] args) {

		SimpleDateFormat sd = 
			new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		// ---JDBC_Select �߰��� ���� -------
		ResultSet rs = null;
		int no = 0;
		String name = "", email = "", tel = "", address = ""; // �����ͺ��̽�����
																		// ����
		Timestamp ts;																		// ������
																		// ���� ����
		String sql; // SQL���� ������ ���� ����

		try {
			Class.forName(driver);
//			con = DriverManager.getConnection(url, "scott", "tiger");
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			// ---JDBC_Select �߰��� ���� -------
			sql = "SELECT * FROM customer order by no desc limit 0, 3";
			System.out.printf("��ȣ \t �̸� \t\t �̸��� \t\t ��ȭ��ȣ \t �ּ�\t ��¥\n");
			System.out.printf("-----------------------------------------------------------------\n");
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // ����� ���ڵ带 ������

			while (rs.next()) {
				no = rs.getInt("no");
				name = rs.getString("name");
				email = rs.getString("email");
				tel = rs.getString("tel");
				address = rs.getString("address");
				ts = rs.getTimestamp("reg_date");
				System.out.printf(" %d \t %s \t %s \t %s\t %s\t %s\t  \n", no, name, email, tel, address, sd.format(ts));
			}
		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ����!");
		} finally {
			try {// rs, stmt, con ��ü�� close() �޼��带 ȣ���� ����
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
