import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//public class ListTest implements ItemListener
public class ListTest2 implements ActionListener, ItemListener {
	Frame f;
	List list;
	String[] item = { "����", "����", "�뱸", "�λ�" };
	TextArea textA;

	public ListTest2() {

		f = new Frame("ItemEvent");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		list = new List(5, false);
		textA = new TextArea();

		for (int i = 0; i < item.length; i++) {
			list.add(item[i]);
		}

		f.add(list, "North");
		f.add(textA, "Center");

		f.setSize(300, 300);
		f.setLocation(500, 100);
		f.setResizable(false);
		f.setVisible(true);

		list.addItemListener(this);
		list.addActionListener(this);

	}// ������ end

	public void actionPerformed(ActionEvent ae) {
		String item = list.getSelectedItem();
		textA.setText(item + " ����");
	}

	public void itemStateChanged(ItemEvent e) {
		String item = list.getSelectedItem();
		textA.setText(item + " ����");
	}

	public static void main(String args[]) {
		ListTest2 lt = new ListTest2();
	}

}