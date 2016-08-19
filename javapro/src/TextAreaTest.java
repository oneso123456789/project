import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaTest {
	private Frame f;
	private TextArea ta1;
	private TextArea ta2;

	public TextAreaTest() {
		// ������ ����
		f = new Frame("TextArea");

		// ������ ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// TextArea ��ü ����
		ta1 = new TextArea(10, 30);
		// TextArea�� �� �� �Է�
		ta1.append("�ϰ� ���� ���� �־��\n");
		ta1.append("����?");

		ta1.setText("���ο� ����");

		// ta2 = new TextArea("��� ���� ���� �־��\n",
		// 10, 30, TextArea.SCROLLBARS_NONE );
		ta2 = new TextArea("��� ���� ���� �־��\n", 10, 30, 3);
		// Label�� TextArea�� ���� Panel ����
		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout());
		p1.add(new Label("�ϰ� ������", Label.CENTER), "North");
		p1.add(ta1, "Center");

		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		p2.add(new Label("��� ������", Label.CENTER), "North");
		p2.add(ta2, "Center");

		/*
		 * Panel p3 = new Panel(); p3.add( p1 ); p3.add( p2 );
		 */
		// TextArea�� �Էµ� Text�� ȭ������ ���
		System.out.println("ta1's text:" + ta1.getText());
		System.out.println("ta2's text:" + ta2.getText());

		f.setLayout(new FlowLayout());
		f.add(p1);
		f.add(p2);
		// f.add( p3, "Center" );

		f.setSize(500, 300);
		f.setVisible(true);
	}// ������ end

	public static void main(String[] args) {
		TextAreaTest tat = new TextAreaTest();
	}
}
