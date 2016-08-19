import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest {
	private Frame f;
	private Button b1, b2, b3, b4, b5;

	public FlowLayoutTest() {
		// ������ ��ü ����
		f = new Frame("FlowLayout");

		// �ټ� ���� ��ư ��ü���� ����
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

		// Panel�� ������ ��, ��ư���� Panel�� ����
//		Panel p = new Panel();
//		p.add(b1);
//		p.add(b2);
//		p.add(b3);
//		p.add(b4);
//		p.add(b5);

// �������� ��ġ�����ڸ� BorderLayout�����ڿ���
// FlowLayout�����ڷ� �����϶�� �ǹ�		
		f.setLayout(new FlowLayout());
		
		// Panel�� Frame�� Center�� ����
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		// Frame�� ����� �����ϰ� ȭ�鿡 �����
		f.setSize(400, 100);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutTest ft = new FlowLayoutTest();
	}
}
