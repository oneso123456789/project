import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {
	private Frame f;
	private Button b1, b2;

	public ButtonTest() {
		// ������ ����
		f = new Frame("Button");

		// ������ ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// ��ư ��ü ����
		b1 = new Button("");
		b2 = new Button("PUSH");
		
		b1.setBackground(Color.red);
		b2.setBackground(new Color(255,255,0));
		
		b1.setForeground(Color.white);

		// ��ư�� Label ���� ����
		b1.setLabel("Ȯ��");

		// ��ư���� Label���� ȭ�鿡 ���
		System.out.println("b1's label : " + b1.getLabel());
		System.out.println("b2's label : " + b2.getLabel());

		f.add(b1, "West");
		f.add(b2, "East");

		f.setSize(300, 100);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		ButtonTest bt = new ButtonTest();
	}
}