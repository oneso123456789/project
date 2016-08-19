import javax.swing.*;

public class JTabbedPaneEx extends JFrame{

	ImageIcon icon1, icon2;	
	JButton b1, b2;
	JTabbedPane tab;
	
	public JTabbedPaneEx(){

		super("JTabbedPane ¿¬½À");
			
		icon1=new ImageIcon("baby.gif");
		icon2=new ImageIcon("ahn.jpg");				

		b1=new JButton(icon1);
		b2=new JButton(icon2);
		
		//ÅÇÀÇ À§Ä¡¸¦ ÁöÁ¤(TOP, LEFT, RIGHT, BOTTOM), ±âº»À§Ä¡´Â TOPÀ¸·Î ¼³Á¤µÊ
		//tab=new JTabbedPane(JTabbedPane.LEFT);
		tab=new JTabbedPane();
		
		tab.addTab("ÅÇ1", b1);		
		tab.addTab("ÅÇ2", b2);
		tab.addTab("ÅÇ3", new JTextArea(7,20));

		add(tab,"Center");
		
		setSize(500,500);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	
	public static void main(String[] args){
		JTabbedPaneEx jtp = new JTabbedPaneEx();
	}
}

