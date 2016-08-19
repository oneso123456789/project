import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest {
	private Frame f;
	private TextField nameField;
	private TextField ageField;

	public TextFieldTest() {
		// ������ ��ü ����
		f = new Frame("TextField");

		// ������ ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// �� ���� TextField ��ü ����
		nameField = new TextField(15);
		ageField = new TextField("���̸� �Է��ϼ���", 15);
		// nameField.setEchoChar('*');

		nameField.setText("��ȭ��");

		// Label���� �����ϴ� Panel�� ������,
		// Label �� ���� Panel�� ����
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2, 1, 0, 10));
		p1.add(new Label("�̸�", Label.RIGHT));
		p1.add(new Label("����", Label.RIGHT));

		// TextField �� ���� GridLayout�� ����� Panel�� ����
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(2, 1, 0, 10));
		p2.add(nameField);
		p2.add(ageField);

		// �� ���� Panel�� FlowLayout���� ���̴� �г�
		Panel p3 = new Panel();
		p3.add(p1);
		p3.add(p2);

		// ���������� �پ� �ִ� �г��� �����ӿ� ����
		f.add(p3, "Center");

		// TextField�� ���� �Էµ� ���ڿ��� ȭ�鿡 ���
		System.out.println("nameField's Text : " + nameField.getText());
		System.out.println("ageField's Text : " + ageField.getText());
	
		f.setSize(300, 100);
		f.setVisible(true);
	}// ������ end

	public static void main(String[] args) {
		TextFieldTest tft = new TextFieldTest();
	}
}