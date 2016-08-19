import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterTest extends WindowAdapter {
	private Frame f;

	public WindowAdapterTest() {
		f = new Frame("WindowEvent Test");

		f.setSize(400, 300);
		f.setVisible(true);

		f.addWindowListener(this);
	}

	// �����찡 Ȱ��ȭ �Ǿ��� �� ȣ��Ǵ� �޼ҵ�
	// public void windowActivated( WindowEvent we ) {
	// System.out.println( "�����찡 Ȱ��ȭ �Ǿ����ϴ�" );
	// }
	// �������� ���� �������� ������ �� ȣ��Ǵ� �޼ҵ�
	public void windowClosing(WindowEvent we) {
		System.out.println("�����찡 ������ �մϴ�");
		System.exit(0);
	}

	public static void main(String[] args) {
		WindowAdapterTest wat = new WindowAdapterTest();
	}
}
