//java.awt.Font
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ItemEventTest1 extends JFrame implements ItemListener {

	JTextField text;
	JCheckBox bold, italic;
	JPanel p;
	int valBold = Font.PLAIN;
	int valItalic = Font.PLAIN;

	public ItemEventTest1() {
		super("üũ�ڽ����� ItemEvent ����");

		setLayout(new GridLayout(2, 1));

		text = new JTextField("JAVA ����");
		text.setFont(new Font("����", Font.PLAIN, 18));

		p = new JPanel();
		bold = new JCheckBox("���ϰ�");
		italic = new JCheckBox("�����");
		p.add(bold);
		p.add(italic);

		add(text);
		add(p);

		setSize(250, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		bold.addItemListener(this);
		italic.addItemListener(this);
	} // ������ end

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == bold) {		// ���ϰ�
			if (e.getStateChange() == 1) {	// ����
				valBold = Font.BOLD;
			} else {						// ����
				valBold = Font.PLAIN;
			}

		} else if (e.getSource() == italic) {// �����
			if (e.getStateChange() == ItemEvent.SELECTED) {
				valItalic = Font.ITALIC;
			} else {
				valItalic = Font.PLAIN;
			}
		}
		text.setFont(new Font("����", valBold + valItalic, 18));
	}

	public static void main(String args[]) {
		ItemEventTest1 item = new ItemEventTest1();
	}

}