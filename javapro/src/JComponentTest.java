import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JComponentTest extends JFrame implements ActionListener{
	JLabel label1, la1, la2;
	JTextField id;
	JPasswordField passwd;
	JPanel idPanel, paPanel, loginPanel;
	JButton b1, b2;
	JTextArea content;

	public JComponentTest() {
		super("JComponent�׽�Ʈ");

		setLayout(new FlowLayout());

		label1 = new JLabel("���̵�� �н����带 �Է��� �ּ���");

		idPanel = new JPanel();
		la1 = new JLabel("���̵�");
		id = new JTextField(10);
		idPanel.add(la1);
		idPanel.add(id);

		paPanel = new JPanel();
		la2 = new JLabel("�н�����");
		passwd = new JPasswordField(10);
		paPanel.add(la2);
		paPanel.add(passwd);

		loginPanel = new JPanel();
		b1 = new JButton("�α���");
		b2 = new JButton("ȸ������");
		loginPanel.add(b1);
		loginPanel.add(b2);

		add(label1);
		add(idPanel);
		add(paPanel);
		add(loginPanel);

		content = new JTextArea(3, 20);
		content.setLineWrap(true); // �ڵ� �ٹٲ�
		JScrollPane s = new JScrollPane(content);
		
		add(s);

		setSize(250, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1){		//�α���
			if(id.getText().equals("")){
				JOptionPane.showMessageDialog(this,"ID�� �Է� �ϼ���");
			}else if(passwd.getText().equals("")){
				JOptionPane.showMessageDialog(this,"��й�ȣ�� �Է� �ϼ���");
			}else{
				content.setText("ID:"+ id.getText()+"\n"+
							    "��й�ȣ:"+passwd.getText());
			}
		}else if(e.getSource() == b2){	// ȸ������
			EmployeeReg er = new EmployeeReg();
		}
		
	}

	public static void main(String args[]) {
		JComponentTest la = new JComponentTest();
	}
}