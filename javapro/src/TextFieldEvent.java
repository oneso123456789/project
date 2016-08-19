import java.awt.*;
import java.awt.event.*;

// ActionEvent�� �߻��ϱ� ������, ActionListenr�� 
//implements �ؼ�, Event�� ó���� �ִ� Handler 
//method�� actionPeformed �޼ҵ带 overriding 
//���־�� ��. 

public class TextFieldEvent implements ActionListener {
	private Frame f;
	private TextField nameField;

	public TextFieldEvent() {

		f = new Frame("TextField Event");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		nameField = new TextField(15);

		f.setLayout(new FlowLayout());
		f.add(new Label("�̸�", Label.RIGHT));
		f.add(nameField);

		f.setSize(300, 70);
		f.setVisible(true);

		nameField.addActionListener(this);

	}// ������ end

	// TextField���� ActionEvent�� �߻��ϴ�
	// ActionListner�� ���ؼ� �Ѿ���� ActionEvent��
	// �Ѱ� �޾� �̸� ó�����ִ� Handler method
	public void actionPerformed(ActionEvent ae) {
		String inputString = nameField.getText();
		System.out.println(inputString);
		nameField.setText(" ");
	}

	public static void main(String[] args) {
		TextFieldEvent tf = new TextFieldEvent();
	}
}