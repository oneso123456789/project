import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelTest {

	private Frame f;
	private Panel p;

	public PanelTest() {

		f = new Frame("Panel Test");
		p = new Panel();

		// �������� ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

		// �������� ������ green���� ����
		f.setBackground(Color.green);
		// Panel�� ������ blue�� ����
		p.setBackground(Color.blue);

		// �����Ӱ� Panel�� ������ ����
		f.setSize(300, 200);
		p.setSize(100, 100);

		f.setLayout(null);// ��ġ�����ڸ� ������� ����.

		// �����ӿ� Panel�� ����
		f.add(p);
		// �������� ȭ�鿡 ������
		f.setVisible(true);
	}

	public static void main(String[] args) {
		PanelTest pt = new PanelTest();
	}
}
