
//java.util.Vector;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ShowList extends JFrame implements ListSelectionListener {

	JList list;
	Vector data;

	public ShowList() {

		super("�̳� ��ȭ����");
		String[] name = { "Ȳ����", "��ҿ�", "�̽¿�", "ä�ö�", "ä����", "������" };
		list = new JList(name);
		/*
		 * list = new JList();
		 * 
		 * data = new Vector(); data.addElement("Ȳ����"); data.addElement("��ҿ�");
		 * data.addElement("�̽¿�"); data.addElement("ä�ö�");
		 * data.addElement("ä����"); data.add("������");
		 * 
		 * list.setListData(data);
		 */
		// �ڵ����� ��ũ�ѹٰ� ���� �ǵ��� �ϴ� �κ�
		JScrollPane jp = new JScrollPane(list);
		add(jp, "Center");
//		add(list,"Center");

		setSize(200, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		list.addListSelectionListener(this);
	}// ������ end

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(list.getSelectedValue());
	}

	public static void main(String s[]) {
		ShowList sl = new ShowList();
	}// main end

}