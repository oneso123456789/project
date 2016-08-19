import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutTest {
	private Frame f;
	private Button b1, b2, b3, b4, b5;

	public BorderLayoutTest() {
		// Frame ��ü ����
		f = new Frame("��ư");

		// ��ư ������Ʈ ����
		b1 = new Button("Button1");
		b2 = new Button("Button2");
		b3 = new Button("Button3");
		b4 = new Button("Button4");
		b5 = new Button("Button5");

		// ������ ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// ��ư�� �����ӿ� ����
		f.add(b1, "East");
		f.add(b2, BorderLayout.WEST);
		f.add(b3, BorderLayout.NORTH);
		f.add(b4, BorderLayout.SOUTH);
		f.add(b5, BorderLayout.CENTER);

		// �������� ũ�⸦ �����ϰ�, ȭ�鿡 �����
		f.setSize(300, 300);
		f.setVisible(true);
	}// ������ end

	public static void main(String[] args) {
		BorderLayoutTest fb = new BorderLayoutTest();
	}
}
