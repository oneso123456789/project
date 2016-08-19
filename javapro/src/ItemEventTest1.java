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
		super("체크박스에서 ItemEvent 연습");

		setLayout(new GridLayout(2, 1));

		text = new JTextField("JAVA 연습");
		text.setFont(new Font("굴림", Font.PLAIN, 18));

		p = new JPanel();
		bold = new JCheckBox("진하게");
		italic = new JCheckBox("기울임");
		p.add(bold);
		p.add(italic);

		add(text);
		add(p);

		setSize(250, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		bold.addItemListener(this);
		italic.addItemListener(this);
	} // 생성자 end

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == bold) {		// 진하게
			if (e.getStateChange() == 1) {	// 선택
				valBold = Font.BOLD;
			} else {						// 해제
				valBold = Font.PLAIN;
			}

		} else if (e.getSource() == italic) {// 기울임
			if (e.getStateChange() == ItemEvent.SELECTED) {
				valItalic = Font.ITALIC;
			} else {
				valItalic = Font.PLAIN;
			}
		}
		text.setFont(new Font("굴림", valBold + valItalic, 18));
	}

	public static void main(String args[]) {
		ItemEventTest1 item = new ItemEventTest1();
	}

}