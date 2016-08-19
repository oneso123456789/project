
//import java.awt.*;
import javax.swing.*;
import java.util.*; // java.util.Vector;

public class JListTest extends JFrame {

	String[] str = { "HTML", "XML", "C", "C++", "�ڹ�", "����Ŭ", "COM" };
	Vector vec;
	JList list;

	public JListTest() {

		vec = new Vector();
		list = new JList();

		// ���Ϳ� �迭�� �ִ� ���(element)�� �߰�
		for (int i = 0; i < str.length; i++) {
			vec.addElement(str[i]);
		}

		// JList ������Ʈ�� ���� Item�� �߰� �� �� ���� ������
		// ���� ��ü�� Item�� ��Ƽ� �߰���.
		list.setListData(vec);

//		list = new JList(vec);
		
		
		add(new JLabel("����Ʈ �ڽ� ����"), "North");

		// ����Ʈ�� Item�� ���� ��� �ڵ����� ��ũ�ѹٰ� ��Ÿ������ �Ϸ���
		// JScrollPaneŬ������ �����ڿ� JList�� ��ü ������ �־� JScrollPane��ü��
		// �����Ͽ� �����ӿ� ������.
		add(new JScrollPane(list), "Center");

		// ����Ʈ ������Ʈ�� ù ��° �׸��� ���õǵ��� �Ѵ�.
		list.setSelectedIndex(1); // XML �� ���õǾ ��µ�.

		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// ������ end

	public static void main(String[] args) {
		JListTest jf = new JListTest();
	}

}