import java.awt.*; //java.awt.FlowLayout;
import javax.swing.*;

public class JButtonTest extends JFrame{ 

  JButton b1, b2, b3;
 
  public JButtonTest(){    

    b1=new JButton("��ư1");
	b2=new JButton("��ư2");
	b3=new JButton("��ư3");

	//ǳ�� ����
	b1.setToolTipText(" ����!! ");
	b2.setToolTipText(" �Ǻ�!! ");
	b3.setToolTipText(" �ڲٺ�!! ");

	setLayout(new FlowLayout());

    add(b1);
    add(b2);
    add(b3);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    setSize(300, 100);  
    setVisible(true);  
  }// ������ end

  public static void main(String[] args){
     JButtonTest jbt = new JButtonTest( );
  }

}                                                           
