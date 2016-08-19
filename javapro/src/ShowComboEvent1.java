import java.awt.event.*;

import javax.swing.*;

public class ShowComboEvent1 extends JFrame implements ItemListener{

	JComboBox combo; 
	JTextArea textA;
	JScrollPane jsp;

	public ShowComboEvent1(){    
        
		super("�̳� ��ȭ���");    

		combo = new JComboBox();        
		combo.addItem("�ѿ���");
		combo.addItem("������");
		combo.addItem("�ְ���");
		
		textA = new JTextArea();
		jsp = new JScrollPane(textA);

		add(combo, "North");
		add(jsp, "Center");  
        
//		setSize(200, 300);
		setBounds(300, 300, 200, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		combo.addItemListener(this);
//		combo.addActionListener(this);
	}//������ end

//	public void actionPerformed(ActionEvent arg0) {
//		System.out.println(combo.getSelectedItem());
//		textA.setText(combo.getSelectedItem()+" ���� \n");
//		
//	}

	public void itemStateChanged(ItemEvent e){
		System.out.println(combo.getSelectedItem());
		textA.setText(combo.getSelectedItem()+" ���� \n");
    }
     
  public static void main(String s[]) {
		ShowComboEvent1 sc = new ShowComboEvent1();    
  }//main end

}