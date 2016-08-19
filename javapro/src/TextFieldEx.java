import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class TextFieldEx implements ActionListener {

	Frame f;
	TextField id, pass;
	Button ok, cancel;

	public TextFieldEx() {
		f = new Frame("로그인 폼");
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		id = new TextField(20);
		pass = new TextField(20);

		ok = new Button("확인");
		cancel = new Button("취소");

		Panel p1 = new Panel();
		p1.add(new Label("I   D"));
		p1.add(id);

		Panel p2 = new Panel();
		p2.add(new Label("PASS"));
		p2.add(pass);

		Panel p3 = new Panel();
		p3.add(p1);
		p3.add(p2);

		Panel p4 = new Panel();
		p4.add(ok);
		p4.add(cancel);

		f.add(new Label("로그인 하세요", 1), "North");
		f.add(p3, "Center");
		f.add(p4, "South");

		f.setBackground(Color.yellow);
		f.setSize(300, 180);
		f.setVisible(true);

		ok.addActionListener(this);
		cancel.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ok) {		// 확인
			if (id.getText().equals("")) {
				JOptionPane.showMessageDialog(f, "아이디를 입력 하세요");
				id.requestFocus();
			} else if (id.getText().length() > 8) {
				JOptionPane.showMessageDialog(f, "8자 미만만 입력 하세요");
				id.setText("");
				id.requestFocus();
			} else if (pass.getText().equals("")) {
				JOptionPane.showMessageDialog(f, "비밀번호를 입력하세요");
				pass.requestFocus();
			} else if (pass.getText().length() > 8) {
				JOptionPane.showMessageDialog(f, "비밀번호는 8자 미만만 입력 하세요");
				pass.setText("");
				pass.requestFocus();
			} else {
				JOptionPane.showMessageDialog(f, "로그인 성공");
			}

		} else if (e.getSource() == cancel) { //취소
			id.setText(" ");
			pass.setText(" ");
			id.requestFocus();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFieldEx te = new TextFieldEx();
	}

}
