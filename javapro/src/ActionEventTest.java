import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ActionEventTest extends JFrame implements ActionListener {
	JLabel la1;
	JTextField in;
	JPanel inputPanel;
	JPanel output;
	JButton send;
	JTextArea content;
	JList jl;
	Vector v;

	public ActionEventTest() {
		super("�ؽ�Ʈ��Ʈ�� ��ư���� ActionEvent ����");

		v = new Vector();
		
		inputPanel = new JPanel();
		la1 = new JLabel("����");
		in = new JTextField(20);

		send = new JButton("����");

		inputPanel.add(la1);
		inputPanel.add(in);
		inputPanel.add(send);

		output = new JPanel(new GridLayout(1, 2, 10, 0));
		content = new JTextArea(5, 30);
		JScrollPane s = new JScrollPane(content);

		jl = new JList();
		output.add(s);
		output.add(jl);

		add(output, "Center");
		add(inputPanel, "South");

		setSize(350, 200);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		in.addActionListener(this);// �̺�Ʈ�� �߻��ϸ� actionPerformed()�޼ҵ带 ����
		send.addActionListener(this);// �̺�Ʈ�� �߻��ϸ� actionPerformed()�޼ҵ带 ����
	}

	public void actionPerformed(ActionEvent e) {
		// if (e.getSource() == in || e.getSource() == send) {
		content.append(in.getText() + "\n");		
		
		v.add(in.getText());
		jl.setListData(v);
		
		in.setText("");
		// }
	}

	public static void main(String args[]) {
		ActionEventTest action = new ActionEventTest();
	}

}