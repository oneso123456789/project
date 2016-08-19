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
		super("JComponent테스트");

		setLayout(new FlowLayout());

		label1 = new JLabel("아이디와 패스워드를 입력해 주세요");

		idPanel = new JPanel();
		la1 = new JLabel("아이디");
		id = new JTextField(10);
		idPanel.add(la1);
		idPanel.add(id);

		paPanel = new JPanel();
		la2 = new JLabel("패스워드");
		passwd = new JPasswordField(10);
		paPanel.add(la2);
		paPanel.add(passwd);

		loginPanel = new JPanel();
		b1 = new JButton("로그인");
		b2 = new JButton("회원가입");
		loginPanel.add(b1);
		loginPanel.add(b2);

		add(label1);
		add(idPanel);
		add(paPanel);
		add(loginPanel);

		content = new JTextArea(3, 20);
		content.setLineWrap(true); // 자동 줄바꿈
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
		if(e.getSource() == b1){		//로그인
			if(id.getText().equals("")){
				JOptionPane.showMessageDialog(this,"ID를 입력 하세요");
			}else if(passwd.getText().equals("")){
				JOptionPane.showMessageDialog(this,"비밀번호를 입력 하세요");
			}else{
				content.setText("ID:"+ id.getText()+"\n"+
							    "비밀번호:"+passwd.getText());
			}
		}else if(e.getSource() == b2){	// 회원가입
			EmployeeReg er = new EmployeeReg();
		}
		
	}

	public static void main(String args[]) {
		JComponentTest la = new JComponentTest();
	}
}