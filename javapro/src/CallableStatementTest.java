import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

class CallableStatementTest {

	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String sql = null;
		CallableStatement cs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, "scott", "tiger");

			sql = "{call del_all()}";

			// CallableStatement�� ��ü�� ����
			cs = con.prepareCall(sql);
			boolean b = cs.execute();
			if(b){
				System.out.println("���� ����");
			}else{
				System.out.println("���� ����");
			}			
			
			cs.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
