import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ShowCombo extends JFrame {

	JComboBox combo;

	public ShowCombo() {

		super("�̳� ��ȭ���");

		String[] act = {"�ѿ���","������","�ְ���"};
		
		Vector v = new Vector();
		v.add("�ѿ���");
		v.add("������");
		v.add("�ְ���");
		
		combo = new JComboBox(v);
//		combo.addItem("�ѿ���");
//		combo.addItem("������");
//		combo.addItem("�ְ���");
//		combo.add("��ȭ��");

		add(combo, "Center");

		setSize(200, 60);
//		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// ������ end

	public static void main(String s[]) {
		ShowCombo sc = new ShowCombo();
	}// main end

}