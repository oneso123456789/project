import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxTest3 implements ItemListener {

	Frame f;
	Panel p;
	Checkbox cb1, cb2, cb3;
	TextArea ta;

	public CheckboxTest3() {

		f = new Frame("Checkbox Test");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		cb1 = new Checkbox("���� ��");
		cb2 = new Checkbox("�Ķ� ��");
		cb3 = new Checkbox("�ʷ� ��");
		ta = new TextArea();

		p = new Panel();
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);

		f.add(p, "North");
		f.add(ta, "Center");

		f.setSize(400, 200);
		f.setVisible(true);

		// üũ�ڽ��� ������ �̺�Ʈ ó�� ������ ��ü(this) �����
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);

	}// �������� ��

	// ������(üũ �ڽ�)�� ���°� ������ �� ȣ��Ǵ� �޼���
	public void itemStateChanged(ItemEvent e) {

		String strState = "";
		Object obj = e.getSource();

		if (obj == cb1) {		//  ������
			if (e.getStateChange() == 1) {
				strState = "����";
				ta.setBackground(Color.red);
			} else {
				strState = "����";
				ta.setBackground(Color.yellow);
			}
		} else if (obj == cb2) { // �Ķ���
			if (e.getStateChange() == 1) {
				strState = "����";
				ta.setBackground(Color.blue);
			} else {
				strState = "����";
				ta.setBackground(Color.pink);
			}
		} else if (obj == cb3) {// �ʷϻ�
			if (e.getStateChange() == 1) {
				strState = "����";
				ta.setBackground(Color.green);
			} else {
				strState = "����";
				ta.setBackground(Color.orange);
			}
		}
		ta.append(e.getItem() + "�� " + strState + "�Ǿ����ϴ�.\n");
	}

	public static void main(String[] args) {
		CheckboxTest3 cbt = new CheckboxTest3();
	}

}