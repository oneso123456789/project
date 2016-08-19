import javax.swing.*;
import javax.swing.event.*; //javax.swing.event.ChangeListener;

//����ڿ� ���ؼ� ���� ���� ������ ChangeListener �������̽��� �̿��ؼ� ó����. 
public class ChangeEvent01 extends JFrame implements ChangeListener{ 
 
  JTabbedPane tab;
        
  public ChangeEvent01(){   
                
	super("ChangeEvent");

    tab = new JTabbedPane(); 
    tab.addTab("ù��°", new JLabel("ù��° �� ����"));    
    tab.addTab("�ι�°", new JLabel("�ι�° �� ����"));    
    tab.addTab("����°", new JLabel("����° �� ����"));
    
    tab.setSelectedIndex(1); //ù��° ���� ���õǾ ��µ�    
    
    add(tab,"Center");   
        
    setSize(200, 300);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    tab.addChangeListener(this);

  }//������ end    
 
    
  public void stateChanged(ChangeEvent e){  
	// JTabbedPane��ü�� index��ȣ���� ��ȯ��
    int cur = tab.getSelectedIndex();
    String curPaneTitle = tab.getTitleAt(cur);
        
    System.out.println(curPaneTitle + " ���� ���õǾ����ϴ�");
  }    

  public static void main(String s[]){
		ChangeEvent01 st = new ChangeEvent01();
  }

}