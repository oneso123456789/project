import javax.swing.*;

public class JTabbedPaneTest extends JFrame{

     JTabbedPane tab;
     JTable table01, table02;
	 JScrollPane sp01, sp02;	 

     public JTabbedPaneTest(){
         super("JTabbedPane ����");

		 //���� ��ġ�� ����(��ܿ� ��ġ)
		 // JTabbedPane.TOP:���, JTabbedPane.BOTTOM:�ϴ�, JTabbedPane.LEFT:����, JTabbedPane.RIGHT:����
         tab = new JTabbedPane(JTabbedPane.LEFT);

		 // ù��° ���� ���� �κ�		
		 String title01[] = {"��ȣ", "�̸�", "�Ի���"};
         String data01[][] = { {"1","ȫ�浿", "2000-03-10"},
							 {"2","���߱�", "2001-10-07"},
							 {"3","�̼���", "2002-05-20"} };

         table01 = new JTable(data01, title01);
         sp01 = new JScrollPane(table01);

		 //�ι�° ���� ����κ�	
		 String title02[] = {"��ȣ", "�μ�", "����"};
         String data02[][] = { {"1","��ȹ��", "����"},
							 {"2","ȫ����", "�븮"},
							 {"3","���ߺ�", "�븮"} };

         table02 = new JTable(data02, title02);
         sp02 = new JScrollPane(table02);

		 //�ǿ� ����κ��� ����
		 tab.addTab("�λ����(�⺻)", sp01);
         tab.addTab("�λ����(����)", sp02);

		 add(tab, "Center");
         setSize(500,200);
         setVisible(true);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
     }//������ end

     public static void main(String args[]){
         JTabbedPaneTest jt= new JTabbedPaneTest();		 
     }

 }           								
