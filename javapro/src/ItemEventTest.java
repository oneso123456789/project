import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class ItemEventTest implements ActionListener, ItemListener {
	private Frame f;
	private Choice nameChoice;
	private Choice select;
	private List fruitList;
	private TextField tf;
	private Button sel, all;

	public ItemEventTest() {
		f = new Frame("Mutiple Event");

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		nameChoice = new Choice();
		nameChoice.add("�̸��� �Է��ϼ���");

		select = new Choice();
		select.add("name");
		select.add("fruit");

		fruitList = new List(7);
		tf = new TextField(20);

		sel = new Button("���� ����");
		all = new Button("��ü ����");

		Panel p = new Panel();
		p.add(sel);
		p.add(all);

		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2, 1, 0, 10));
		p1.add(new Label("�̸�", Label.CENTER));
		p1.add(nameChoice);

		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		p2.add(new Label("����", Label.CENTER), "North");
		p2.add(fruitList, "Center");
		p2.add(p, "South");

		Panel p3 = new Panel();
		p3.add(p1);
		p3.add(p2);

		Panel p4 = new Panel();
		p4.add(select);
		p4.add(tf);

		f.add(p3, "Center");
		f.add(p4, "South");

		f.setSize(400, 250);
		f.setVisible(true);

		// registerationEventListener();

		sel.addActionListener(this);
		all.addActionListener(this);
		tf.addActionListener(this);
		// select.addItemListener( this );
		nameChoice.addItemListener(this);
		fruitList.addItemListener(this);
	}// ������ end

	// ������Ʈ�� EventListener�� ��Ͻ�Ű�� method
	// public void registerationEventListener() {
	/*
	 * tf.addActionListener( this ); select.addItemListener( this );
	 * nameChoice.addItemListener( this ); fruitList.addItemListener( this );
	 */
	// }

	// TextField���� �߻��ϴ� Event�� ó���ϴ� method
	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == tf) {
			String where = select.getSelectedItem();
			System.out.println(where);

			// name�� fruit�� ���� item�� ��Ͻ�Ŵ
			if (where == "name") {
				nameChoice.add(tf.getText());
				tf.setText("");
			} else {
				fruitList.add(tf.getText());
				tf.setText("");
			}

		} else if (ae.getSource() == sel) {// ���� ����
			if (fruitList.getSelectedIndex() == -1) {
				JOptionPane.showMessageDialog(f, "������ �׸��� ���� �ϼ���");
			} else {
				fruitList.remove(fruitList.getSelectedItem());
			}

		} else if (ae.getSource() == all) {// ��ü ����
			fruitList.removeAll();
		}
	}

	// Choice�� List���� ItemEvent�� �߻��ϸ� ó���ϴ�
	// Handler Method
	public void itemStateChanged(ItemEvent ie) {
		Object o = ie.getSource();
		String item = null;

		// Choice���� List������ �����ؼ� TextField�� ���� ���ý�Ų��.
		if (o == nameChoice) {
			item = nameChoice.getSelectedItem();
			tf.setText(item);
		} else if (o == fruitList) {
			item = fruitList.getSelectedItem();
			tf.setText(item);
		}
	}

	public static void main(String[] args) {
		ItemEventTest it = new ItemEventTest();
	}
}
