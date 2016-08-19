import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// ListSelectionEvent�� JList�� �������� �����Ҷ� �߻���
public class ListSelectionEventTest extends JFrame implements ListSelectionListener {
	JList list;
	JLabel label;

	String imageNames[] = { "blue.jpg", "black.jpg", "red.jpg", "green.jpg", "pink.jpg" };
	String listNames[] = { "blue", "black", "red", "green", "pink" };
	Icon icons[];

	public ListSelectionEventTest() {
		super("JLIst���� ListSelectionEvent ����");

		setLayout(new GridLayout(1, 2));

		list = new JList(listNames);
		list.setVisibleRowCount(5);

		// ����Ʈ�� ����� �����Ҷ� ���� ���ø��� ����
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		icons = new ImageIcon[imageNames.length];// 5

		for (int i = 0; i < icons.length; i++) {
			icons[i] = new ImageIcon(imageNames[i]);
		}

		label = new JLabel(icons[0]);

		add(new JScrollPane(list));
		add(label);

		setSize(350, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		list.addListSelectionListener(this);
	} // ������ end

	public void valueChanged(ListSelectionEvent e) {
		label.setIcon(icons[list.getSelectedIndex()]);
	}

	public static void main(String args[]) {
		ListSelectionEventTest list = new ListSelectionEventTest();
	}

}
