import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.*;

public class Clock01 extends JFrame implements Runnable { 
		
	JLabel j;
	JTextField tf;
	
	public void run() {
		
	 while(true){	
		Date d = new Date();
		SimpleDateFormat ff = new 
        		SimpleDateFormat("yyyy년  MM월 dd일 HH시 mm분 ss초");
															
		System.out.println(ff.format(d));
		tf.setText(ff.format(d));
		
//		if(d.getMinutes() == 26){
//			break;
//		}
				
		try {			
		    Thread.sleep( 1000 ); //(단위: 1/1000 초)
		} catch ( InterruptedException ie ) {		    
		    System.out.println( ie.toString() );
		}
		
	}//while end	
//	}//for end
   }// run() end	
    
    	
    public Clock01(){
    	
    	super("시계"); 
    	
    	setLayout(new FlowLayout());
    	
    	j = new JLabel("현재 시간");
    	tf =  new JTextField(20); 
    	add(j);
    	add(tf);
    	
    	setSize(300, 100);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
    }
    
    public static void main( String[] args ) {
    	Clock01 tsl = new Clock01();
    	Thread first  = new Thread( tsl, "first1" );		
		first.start();
    }
}
