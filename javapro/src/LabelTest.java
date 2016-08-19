import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelTest {

	private Frame f;
	// Label ��ü ����
	private Label first, second, third;

	public LabelTest() {
		// ������ ��ü ����
		f = new Frame("Label");

		// ������ Label ��ü ����
		// left:0 center:1 right:2
		first = new Label();
		second = new Label("����");
		// third = new Label( "�ּ�", Label.RIGHT );
		third = new Label("�ּ�", 2);

		// ������ ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// �� Label�� ������ ����
		// first.setBackground( Color.pink );
		first.setBackground(new Color(255, 0, 255));
		second.setBackground(Color.yellow);
		third.setBackground(Color.green);

		first.setText("�̸�");
		second.setAlignment(Label.CENTER);

		System.out.println("Text Of lb2 : " + second.getText());
		System.out.println("Alignment of lb3 : " + third.getAlignment());

		// �����ӿ� Label ��ü�� ����
		f.add(first, "North");
		f.add(second, "Center");
		f.add(third, "South");

		// �������� ����� �����ϰ�, ȭ�鿡 ���
		f.setSize(300, 100);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		LabelTest lt = new LabelTest();
	}
}
