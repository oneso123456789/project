import javax.swing.*;

public class JTableTest extends JFrame {
  
  public JTableTest(){

    //1. ���̺��� �� ���� �� ������ ������ �迭�� �ִ´�. 
    Object [][] data = { {"ȫ�浿", "777-7777", "hong@naver.com"},
						 {"���߱�", "222-2222", "ahn@daum.net"},
						 {"�̼���", "333-3333", "lee@empal.com"} };

    //2. ���̺��� �� �̸��� �� ������ ������ �迭�� �ִ´�. 
    Object [] columnName = { "�̸�", "��ȭ��ȣ", "E-Mail" };

    //3. JTable(Object[][] rowData , Object columnNames)�����ڸ� 
	// �̿��Ͽ� ���̺��� �����. 
    JTable table = new JTable(data, columnName);	
	
    //4. �����ӿ� ���̺��� ����
    add(new JScrollPane(table),"Center");
    
    setSize(400, 200);
    setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
   }//������ end  	

   public static void main(String[] args) {
		JTableTest jtt = new JTableTest();
   }
 
 }
