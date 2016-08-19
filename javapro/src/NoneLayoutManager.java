import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NoneLayoutManager {
	// ������ ��ü ����
	Frame f;
	// �����ӿ� ���Խ�ų ��ư ��ü ����
	Button b1, b2, b3;

	public NoneLayoutManager() {
		// ������ ��ü ����
		f = new Frame("���� ������Ʈ ��ġ");

		// ��ư ��ü ����
		b1 = new Button("��ư1");
		b2 = new Button("��ư2");
		b3 = new Button("��ư3");

		// ������ ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// ���̾ƿ� �����ڸ� ������� ����
		f.setLayout(null);

		// ��ǥ���� �̿��� ��ư�� ��ġ��Ŵ
		b1.setBounds(50, 50, 100, 50);
		b2.setBounds(180, 50, 100, 50);
		b3.setBounds(310, 50, 100, 50);

		// �����ӿ� ������ ��ư�� ���Խ�Ŵ
		f.add(b1);
		f.add(b2);
		f.add(b3);

		// �������� ũ�⸦ ���ϰ� ȭ�鿡 �����
		f.setSize(460, 150);
		f.setVisible(true);
	} // ������ end

	public static void main(String[] args) {
		NoneLayoutManager nlm = new NoneLayoutManager();
	}
}
