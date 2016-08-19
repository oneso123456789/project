import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;


class CallableStatementTest02 {
	
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql;
		CallableStatement cs = null;
		
		System.out.print("Ż���� ȸ������ �Է� �ϼ���?");
		Scanner sc=new Scanner(System.in);
		String name = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");

			sql = "{call del_ename(?)}";

			// CallableStatement�� ��ü�� ����
			cs = con.prepareCall(sql);
			cs.setString(1, name);
			cs.execute();		
			
			cs.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
