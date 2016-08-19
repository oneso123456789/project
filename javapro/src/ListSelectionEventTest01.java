import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//java.util.Vector;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListSelectionEventTest01 extends JFrame implements ActionListener, ListSelectionListener {
	JLabel la1;
	JTextField in, out;
	JPanel inputPanel, p1, p2;
	JButton send;
	JList list;
	JTextArea textA;
	Vector v;

	public ListSelectionEventTest01() {
		super("텍스트필트와 버튼에서 ActionEvent 연습");

		inputPanel = new JPanel();
		la1 = new JLabel("입력");
		in = new JTextField(20);
		send = new JButton("전송");

		inputPanel.add(la1);
		inputPanel.add(in);
		inputPanel.add(send);

		out = new JTextField(20);

		p1 = new JPanel(new GridLayout(2, 1));
		p1.add(inputPanel);
		p1.add(out);

		p2 = new JPanel();
		v = new Vector();
		list = new JList();
		JScrollPane sp01 = new JScrollPane(list);

		textA = new JTextArea(7, 10);
		JScrollPane sp02 = new JScrollPane(textA);
		p2.add(sp01);
		p2.add(sp02);

		add(p2, "Center");
		add(p1, "South");

		setSize(400, 250);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		in.addActionListener(this);
		send.addActionListener(this);
		
		list.addListSelectionListener(this);
	}// 생성자 end

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		v.add(in.getText());
		list.setListData(v);
		
		textA.append(in.getText()+"\n");
		
		in.setText("");
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		String item=(String)list.getSelectedValue();
		 out.setText(item);
	}

	public static void main(String args[]) {
		ListSelectionEventTest01 action = new ListSelectionEventTest01();
	}

}