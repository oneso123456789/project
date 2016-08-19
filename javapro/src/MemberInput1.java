import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MemberInput1 extends JFrame implements ActionListener {

	JTextField name, email, phone;
	JButton input, cancel;
	JPanel p1, p2, p3, p4;

//	String driver = "oracle.jdbc.driver.OracleDriver";
//	String url = "jdbc:oracle:thin:@localhost:1521:xe";

	String driver ="com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost/jsptest";
	
	Connection con = null;
	PreparedStatement pstmt = null;

	String sql;

//	String name, email, tel,

	public MemberInput1() {
		super("ȸ�� ����");

		name = new JTextField(20);
		email = new JTextField(20);
		phone = new JTextField(20);

		input = new JButton("ȸ������");
		cancel = new JButton("��  ��");

		p1 = new JPanel(new GridLayout(3, 1));
		p1.add(new JLabel("�̸�"));
		p1.add(new JLabel("E-Mail"));
		p1.add(new JLabel("��ȭ��ȣ"));

		p2 = new JPanel(new GridLayout(3, 1));
		p2.add(name);
		p2.add(email);
		p2.add(phone);

		p3 = new JPanel();
		p3.add(p1);
		p3.add(p2);

		p4 = new JPanel();
		p4.add(input);
		p4.add(cancel);

		add(p3, "Center");
		add(p4, "South");

		setBounds(300, 300, 350, 180);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		input.addActionListener(this);
		cancel.addActionListener(this);
	}

	public void input() {
		 try{
		      Class.forName(driver);
//		      con = DriverManager.getConnection(url, "scott", "tiger" );      
		      con = DriverManager.getConnection(url, "jspid", "jsppass" );
		     
		      // INSERT �������� �ۼ�
			  sql = "INSERT into mem01 values (?, ?, ?)";

			  pstmt = con.prepareStatement( sql );			
			  pstmt.setString(1, name.getText());
			  pstmt.setString(2, email.getText());
			  pstmt.setString(3, phone.getText());			 
			  int result=pstmt.executeUpdate();   
			  
			  	if(result == 1){
					 JOptionPane.showMessageDialog(this, "ȸ������ ����");
			  	}else{
			  		JOptionPane.showMessageDialog(this, "ȸ������ ����");
				}
		    } catch(Exception e){
		    	JOptionPane.showMessageDialog(this,"�����ͺ��̽� ���� ����!");
		    } finally{
				try{					        
					if( pstmt != null ) pstmt.close();
					if( con != null )  con.close();
				 } catch(Exception e){ 
					System.out.println( e.getMessage());
				}
		    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == input) { // ȸ������
			if (name.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "�̸��� �Է� �ϼ���");
				name.requestFocus();
			} else if (email.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "�̸��� �ּҸ� �Է��ϼ���");
				email.requestFocus();
			} else if (phone.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "��ȭ��ȣ�� �Է��ϼ���");
				phone.requestFocus();
			} else {
				input();
			}
		} else if (e.getSource() == cancel) {// ���
			name.setText("");
			email.setText("");
			phone.setText("");
			name.requestFocus();
		}

	}

	public static void main(String[] args) {
		MemberInput1 mi = new MemberInput1();
	}
}
