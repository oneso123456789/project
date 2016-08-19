import java.awt.*;
import java.awt.event.*;

public class CheckboxTest1 implements ItemListener {
	Frame f;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup colorGrp;

	public CheckboxTest1() {
		f = new Frame("Checkbox ����");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		colorGrp = new CheckboxGroup();

		cb1 = new Checkbox("������", colorGrp, false);
		cb2 = new Checkbox("�ʷϻ�", colorGrp, false);
		cb3 = new Checkbox("�Ķ���", colorGrp, false);

		f.setLayout(new FlowLayout());
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.setSize(400, 200);
		// f.setBackground(new Color(255,0,0));
		f.setBackground(Color.red);
		f.setVisible(true);

		// üũ�ڽ��� ������ �̺�Ʈ ó�� ������ ��ü(this) �����
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
	}// ������ end

	// ������(üũ �ڽ�)�� ���°� ������ �� ȣ��Ǵ� �޼���
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();

		if (obj == cb1) {
			cb1.setBackground(Color.red);
			cb2.setBackground(Color.red);
			cb3.setBackground(Color.blue);
			f.setBackground(Color.red);
			// f.setBackground(new Color(255,0,0));
		} else if (obj == cb2) {
			cb1.setBackground(Color.green);
			cb2.setBackground(Color.green);
			cb3.setBackground(Color.green);
			f.setBackground(Color.green);
		} else if (obj == cb3) {
			cb1.setBackground(Color.blue);
			cb2.setBackground(Color.blue);
			cb3.setBackground(Color.blue);
			f.setBackground(Color.blue);
		}
		/*
		 * Object obj = e.getItem(); 
		 * if(obj == "������"){
		 * f.setBackground(Color.red); // f.setBackground(new Color(255,0,0));
		 * }else if(obj == "�ʷϻ�"){ f.setBackground(Color.green); }else if(obj ==
		 * "�Ķ���"){ f.setBackground(Color.blue); }
		 */
	}

	public static void main(String[] args) {
		CheckboxTest1 ct1 = new CheckboxTest1();
	}
}