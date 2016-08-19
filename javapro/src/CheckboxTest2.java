import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxTest2 implements ItemListener {

	Frame f;
	Panel p;
	Checkbox cb1, cb2, cb3;
	TextArea ta;

	public CheckboxTest2() {

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

		// e.getStateChange(): üũ�ڽ��� ���� ���¸� �˾Ƴ���(����, ����)
		// if(e.getStateChange() == ItemEvent.SELECTED){
		if (e.getStateChange() == 1) {
			strState = "����";
		} else {
			strState = "����";
		}
//		strState = "����";
		// e.getItem(): ���õ� �������� �˾Ƴ���
		ta.append(e.getItem() + "�� " + strState + "�Ǿ����ϴ�.\n");
	}

	public static void main(String[] args) {
		CheckboxTest2 cbt = new CheckboxTest2();
	}
}