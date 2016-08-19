import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutTest {
	private Frame f;
	private Button b1, b2, b3, b4, b5;

	public GridLayoutTest() {
		// ������ ��ü ����
		f = new Frame("GridLayout");

		// ��ư ����
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

		// Panel ����
		// Panel p = new Panel(new GridLayout(3, 2));

		// Panel�� LayoutManager�� ������ �� ��ư�� ����
		// GridLayout g = new GridLayout( 2, 2 );
		// p.setLayout(g);
		// p.setLayout(new GridLayout(3, 2));
		// p.add(b1);
		// p.add(b2);
		// p.add(b3);
		// p.add(b4);
		// p.add(b5);

		f.setLayout(new GridLayout(3, 2, 10, 10));

		// Panel�� Frame�� �߾ӿ� ����
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		// �������� ũ�⸦ ��������, ȭ�鿡 ���
		f.setSize(300, 200);
		f.setVisible(true);
	}// ������ end

	public static void main(String[] args) {
		GridLayoutTest gt = new GridLayoutTest();
	}
}
