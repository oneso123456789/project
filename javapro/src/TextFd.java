import java.awt.*;
import java.awt.event.*;

public class TextFd { 

  Frame f;
  Panel p1, p2;           
  TextField  txtID;       
  TextField  txtPW;      
   
  public TextFd( ) {
	f = new Frame("TextField Test"); 
	
	f.addWindowListener(new WindowAdapter( ){
      public void windowClosing(WindowEvent e) {         
        System.exit(0); 
      }
    });  

    txtID=new TextField(20);  
    txtPW=new TextField(20);

   // �н����带 �Է¹��� �ؽ�Ʈ �ʵ�� ������ ���� 
   // �Է¹��� ���� ��� ����� ���� ���� 
    txtPW.setEchoChar('*');    

	p1=new Panel();   
    p1.add(new Label("��   ��  �� : "));   
    p1.add(txtID);   

	p2=new Panel();
    p2.add(new Label("�н� ���� : "));    
    p2.add(txtPW);     

	f.add(p1, "North");    
    f.add(p2, "Center");  

    f.setSize(400,100); 
    f.setVisible(true);
   
  }//�������� ��  

  public static void main(String[] args) {
    TextFd tf = new TextFd( );   
  }    
}
