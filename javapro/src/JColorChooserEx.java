import java.awt.*; //java.awt.Color;
import java.awt.event.*; //java.awt.event.ActionListener
import javax.swing.*;

public class JColorChooserEx extends JFrame implements ActionListener{
	
	JMenuBar mb;
	JMenu selectMenu;
	JMenuItem colorItem;
	JLabel l;
	JTextArea ta;
			
	public JColorChooserEx(){

		super("JColorChooser �׽�Ʈ");
	
		mb =new JMenuBar();
		selectMenu = new JMenu("����");
		colorItem=new JMenuItem("����");
		l=new JLabel("���â");
		ta=new JTextArea();
			
		selectMenu.add(colorItem);
		
		mb.add(selectMenu);
		
		setJMenuBar(mb);
		
		add(l, "North");
		add(ta, "Center");
		
		setSize(300, 200);		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		colorItem.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == colorItem){
//			JColorChooser jcc = new JColorChooser();
			//showDialog(������Ʈ, Ÿ��Ʋ, �ʱ����)
			Color col = JColorChooser.showDialog(this,"������ ������",Color.blue);
			l.setText("������ ������"+col);
			ta.setBackground(col);
		}
	}
	
	public static void main(String[] args){
		JColorChooserEx jcc = new JColorChooserEx();
	}

}