import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ColorEvent implements  ActionListener {
 
  Frame f;
  Button redBtn, blueBtn, yellBtn; 

  public ColorEvent( ) {
    
	f = new Frame("Event Test");

	f.addWindowListener(new WindowAdapter( ){
      public void windowClosing(WindowEvent e) {          
         System.exit(0); 
      }
    });  

    redBtn = new Button("빨간색");
    blueBtn = new Button("파란색");
    yellBtn = new Button("노랑색");

    f.setLayout(new FlowLayout());
    f.add(redBtn);  
    f.add(blueBtn);    
    f.add(yellBtn);

    f.setSize(300,200); 
    f.setVisible(true); 

	redBtn.addActionListener(this);
    blueBtn.addActionListener(this);    
    yellBtn.addActionListener(this);
  }//생성자 끝

  public void actionPerformed(ActionEvent e){
	 // java.util.EventObject;
	if(e.getSource() == redBtn){	
		f.setBackground(new Color(255,0,0));
	} else if(e.getSource() == blueBtn){
		f.setBackground(Color.blue);
	} else if(e.getSource() == yellBtn){
		f.setBackground(Color.yellow);
	}

// java.awt.event.ActionEvent; 
/*		if(e.getActionCommand()=="빨간색"){ 
			f.setBackground(Color.red); 
		} else {
			f.setBackground(Color.blue);
		}*/
  }

  public static void main(String[] args) {
      ColorEvent ce = new ColorEvent( );                                 
  }

}       