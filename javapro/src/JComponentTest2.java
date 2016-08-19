import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class JComponentTest2 extends JFrame {
	JCheckBox c1, c2, c3;
	JPanel p, p1, p2;
	JRadioButton r1, r2;
	ButtonGroup bg;
	JComboBox com;
	JList jl;
	String major[] = { "��ǻ�Ͱ��а�", "�����а�", "���ڰ��а� ", "��������а�", "������а�" };
	String sports[] = { "��", "�߱�", "�౸", "�豸", "������" };

	public JComponentTest2() {
		super("JComponent����");

		// Container c = getContentPane();
		setLayout(new FlowLayout());

		p = new JPanel(new GridLayout(1, 2));

		p1 = new JPanel(new GridLayout(3, 1));
		c1 = new JCheckBox("���ڱ�", true);
		c2 = new JCheckBox("TV��û");
		c3 = new JCheckBox("��ȭ����");
		p1.add(c1);
		p1.add(c2);
		p1.add(c3);

		p2 = new JPanel(new GridLayout(2, 1));
		r1 = new JRadioButton("����", true);
		r2 = new JRadioButton("����", false);

		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		p2.add(r1);
		p2.add(r2);

		p.add(p1);
		p.add(p2);

		com = new JComboBox(major);

		jl = new JList(sports);
		JScrollPane s1 = new JScrollPane(jl);
		jl.setVisibleRowCount(4); // ȭ�鿡 ��µ� �������� ����

		add(p);
		add(com);
		add(s1);

		setSize(650, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		JComponentTest2 jc = new JComponentTest2();
	}
}