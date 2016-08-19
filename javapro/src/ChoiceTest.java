import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {
	Frame f;
	Choice choice;

	public ChoiceTest() {
		// ������ ����
		f = new Frame("choice");

		// ������ ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// choice ��ü ������, item�� �߰�
		choice = new Choice();
		choice.add("gemini");
		choice.add("johnharu");
		choice.add("gracedew");
		choice.add("ȫ�浿");

		// Panel�� �߰�
		// Panel p = new Panel();
		// p.setLayout( new BorderLayout() );

		// p.add( new Label( "�̸��� �����ϼ���",Label.CENTER ), "North" );
		// p.add( choice, "Center" );

		// �������� ���� �ƿ� �����ڸ� FlowLayout�����ڷ�
		// ��ȯ�Ŀ� Panel�� �����ӿ� �����Ѵ�.

		// f.setLayout( new FlowLayout() );
		// f.add(p,"Center");
//		f.add(new Label("�̸��� �����ϼ���", Label.CENTER), "North");
//		f.add(choice, "Center");
		
		f.setLayout(new FlowLayout());
		f.add(new Label("�̸��� �����ϼ���", 1));
		f.add(choice);
	
		f.setSize(200, 100);
		f.setVisible(true);
	}// ������ end

	public static void main(String[] args) {
		ChoiceTest ct = new ChoiceTest();
	}
}