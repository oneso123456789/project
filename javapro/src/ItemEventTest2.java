//java.awt.GridLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ItemEventTest2 extends JFrame implements ItemListener {

	JTextField tex;
	JRadioButton m, f;
	JPanel p;
	ButtonGroup gender;

	public ItemEventTest2() {
		super("������ư���� ItemEvent ����");

		setLayout(new GridLayout(2, 1));

		tex = new JTextField("������ ǥ���մϴ�.");
		tex.setFont(new Font("����", Font.PLAIN, 16));

		p = new JPanel();
		m = new JRadioButton("����(Male)");
		f = new JRadioButton("����(Female)");

		gender = new ButtonGroup();
		gender.add(m);
		gender.add(f);

		p.add(m);
		p.add(f);

		add(tex);
		add(p);

		setSize(250, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		m.addItemListener(this);
		f.addItemListener(this);
	}// ������ end

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == m) {
//			if (e.getStateChange() == ItemEvent.SELECTED) {
				tex.setText("���� �Դϴ�.");
//			}
		} else if (e.getSource() == f) {
//			if (e.getStateChange() == ItemEvent.SELECTED) {
				tex.setText("���� �Դϴ�.");
//			}
		}
	}

	public static void main(String args[]) {
		ItemEventTest2 item = new ItemEventTest2();
	}

}