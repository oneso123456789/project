public class JDBC_Connect01 {

	public static void main(String[] args) {

		/** ORACLE JDBC Driver Test ***************************/
//		String driver = "oracle.jdbc.driver.OracleDriver";
		/******************************************************/

		/** My-SQL JDBC Driver Test **************************/
		 String driver ="com.mysql.jdbc.Driver";
		/*****************************************************/

		try {
			Class.forName(driver);//JDBC Driver Loading
			System.out.println("JDBC Driver Loading ����~!!");

		} catch (Exception e) {
			System.out.println("JDBC Driver Loading ����~!!");
			e.printStackTrace();
		}
	}
}
