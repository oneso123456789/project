import javax.swing.*;

public class ShowTab01 extends JFrame { 
 
  JTabbedPane tab;
        
  public ShowTab01(){   
                
	super("�� ����");

	//���� ��ġ�� ����(TOP, LEFT, RIGHT, BOTTOM), �⺻��ġ�� TOP���� ������
	tab=new JTabbedPane(JTabbedPane.LEFT);
    //tab = new JTabbedPane(); 	

    tab.addTab("ù��°", new JLabel("ù��° �� ����"));    
    tab.addTab("�ι�°", new JLabel("�ι�° �� ����"));    
    tab.addTab("����°", new JLabel("����° �� ����"));
    
    tab.setSelectedIndex(1); //ù��° ���� ���õǾ ��µ�    
    
    add(tab,"Center");   
        
    setSize(200, 300);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }//������ end      

  public static void main(String s[]){
		ShowTab01 st = new ShowTab01();
  }

}