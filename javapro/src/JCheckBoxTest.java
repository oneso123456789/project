import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JCheckBoxTest extends JFrame {
	JCheckBox cb1, cb2, cb3;
	JRadioButton rb1, rb2, rb3, rb4, rb5;
	JPanel p1, p2, p3;

	public JCheckBoxTest() {

		p1 = new JPanel(); // üũ �ڽ� ���
		cb1 = new JCheckBox("C", true);
		cb2 = new JCheckBox("C++", false);
		cb3 = new JCheckBox("�ڹ�", false);
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);

		p2 = new JPanel(); // ���� ������ ���� ���� ��ư ���
		ButtonGroup bg1 = new ButtonGroup();
		rb1 = new JRadioButton("����", true);
		rb2 = new JRadioButton("����", false);
		bg1.add(rb1);
		bg1.add(rb2);
		p2.add(rb1);
		p2.add(rb2);

		p3 = new JPanel(); // ���� ��ư ���
		ButtonGroup bg2 = new ButtonGroup();
		rb3 = new JRadioButton("����", true);
		rb4 = new JRadioButton("����", false);
		rb5 = new JRadioButton("����", false);
		bg2.add(rb3);
		bg2.add(rb4);
		bg2.add(rb5);

		p3.add(rb3);
		p3.add(rb4);
		p3.add(rb5);

		add(p1, "North");
		add(p2, "Center");
		add(p3, "South");

		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// ������ end

	public static void main(String[] args) {
		JCheckBoxTest jcb = new JCheckBoxTest();
	}
}