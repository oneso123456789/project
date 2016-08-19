import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListTest {
	Frame f;
	List nameList;
	List fruitList;

	public ListTest() {
		// �����Ӱ� List ��ü ����
		f = new Frame("List");

		// ������ ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// �� ���� List ��ü ����
		nameList = new List(10);
		fruitList = new List(10, true);

		// nameList�� Item �߰�
		nameList.add("gemini");
		nameList.add("johnharu");
		nameList.add("gracedew");

		// fruitList�� Item �߰�
		fruitList.add("apple");
		fruitList.add("banana");
		fruitList.add("grape");

		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout());
		p1.add(new Label("�̸�", Label.CENTER), "North");
		p1.add(nameList, "Center");

		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		p2.add(new Label("����", Label.CENTER), "North");
		p2.add(fruitList, "Center");
		/*
		 * Panel p3 = new Panel(); p3.add( p1 ); p3.add( p2 );
		 */
		f.setLayout(new FlowLayout());
		f.add(p1);
		f.add(p2);
		// f.add( p3 ,"Center");

		// List���� index�� 0�� ���� ���Ϲ޾� ȭ�鿡 ���
		System.out.println("Item:" + nameList.getItem(0));
		// List�� item�� �� ������ ���Ϲ���
		System.out.println("Item count:" + nameList.getItemCount());

		// ��� �������� String[]�� ���� �� ȭ�鿡 ���
		String[] items = nameList.getItems();
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}

		f.setSize(400, 250);
		f.setVisible(true);
	}// ������ end

	public static void main(String[] args) {
		ListTest lt = new ListTest();
	}
}
