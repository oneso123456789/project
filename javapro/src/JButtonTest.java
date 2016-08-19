import java.awt.*; //java.awt.FlowLayout;
import javax.swing.*;

public class JButtonTest extends JFrame{ 

  JButton b1, b2, b3;
 
  public JButtonTest(){    

    b1=new JButton("¹öÆ°1");
	b2=new JButton("¹öÆ°2");
	b3=new JButton("¹öÆ°3");

	//Ç³¼± µµ¿ò¸»
	b1.setToolTipText(" ¹»ºÁ!! ");
	b2.setToolTipText(" ¶ÇºÁ!! ");
	b3.setToolTipText(" ÀÚ²ÙºÁ!! ");

	setLayout(new FlowLayout());

    add(b1);
    add(b2);
    add(b3);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    setSize(300, 100);  
    setVisible(true);  
  }// »ý¼ºÀÚ end

  public static void main(String[] args){
     JButtonTest jbt = new JButtonTest( );
  }

}                                                           
