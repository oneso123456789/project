import java.awt.*;
import java.awt.event.*;

public class TextA implements ActionListener {

  Frame f; 
  TextArea   txtState;
  TextField  txtF;        
  Button     b;    

  public TextA( ) {
	f = new Frame("TextArea Test");	

	f.addWindowListener(new WindowAdapter( ){
      public void windowClosing(WindowEvent e) {        
        System.exit(0); 
      }
    });

    txtF = new TextField(40);
	txtState = new TextArea();
	txtState.setEditable( false );
    b = new Button("��  ��" );

	Panel p = new Panel();
	p.add(txtF);
	p.add(b);

    f.add(txtState, "North"); 
	f.add(p, "Center");   
                   
    f.setSize(400,250); 
    f.setVisible(true); 
	
	//��ư�� �߻��� �̺�Ʈ�� ó���� �̺�Ʈ ������ ��ü�� ������ 
	b.addActionListener(this);
	txtF.addActionListener(this);
  }//�������� ��  

  public void actionPerformed(ActionEvent e){
//�ؽ�Ʈ �ʵ忡 ���ڿ��� �ԷµǾ��ٸ�
//�ؽ�Ʈ �ʵ尪�� ���ͼ� �ؽ�Ʈ ���� �߰�
//�ؽ�Ʈ �ʵ��� ������ �ʱ�ȭ�Ѵ�. 
/*
	if(txtF.getText() != ""){ 
      txtState.append(txtF.getText()+"\n"); 
      txtF.setText("");     
    }*/
  //java.util.EventObject;
//	if(e.getSource() == txtF){
		txtState.append(txtF.getText()+"\n"); 
        txtF.setText("");      
//	} else if(e.getSource() == b){
//		txtState.append(txtF.getText()+"\n"); 
//        txtF.setText("");     
//	}

  }

  public static void main(String[] args) {
    TextA ta = new TextA( );   
  }
}