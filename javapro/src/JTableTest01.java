import javax.swing.*;
import javax.swing.table.*; //javax.swing.table.DefaultTableModel;

public class JTableTest01 extends JFrame {  
  
  public JTableTest01(){
    
    Object [][] data = { {"ȫ�浿", "777-7777", "hong@naver.com"},
						 {"���߱�", "222-2222", "ahn@daum.net"},
						 {"�̼���", "333-3333", "lee@empal.com"} };
   
    Object [] columnName = { "�̸�", "��ȭ��ȣ", "E-Mail" };
   
   // DefaultTableModel(Object[][] data, Object[] columnNames) 
	DefaultTableModel model = new DefaultTableModel(data, columnName); 
    JTable table = new JTable(model);
    
    add(new JScrollPane(table),"Center");
    
    setSize(400, 200);
    setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
   }//������ end  	

   public static void main(String[] args) {
		JTableTest01 jtt = new JTableTest01();
   }
 
 }
