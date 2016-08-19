import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonEvent2 implements ActionListener {

	Frame f;
	Button redBtn, blueBtn;

	public ButtonEvent2() {
		f = new Frame("Event Test");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
				System.exit(0);
			}
		});

		redBtn = new Button("���� ��");
		blueBtn = new Button("�Ķ� ��");

		f.setLayout(new FlowLayout());
		f.add(redBtn);
		f.add(blueBtn);

		redBtn.addActionListener(this);
		blueBtn.addActionListener(this);

		f.setSize(300, 200);
		f.setVisible(true);
	}// ������ ��

	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		// System.out.println(e.getSource());
	}

	public static void main(String[] args) {
		ButtonEvent2 fe = new ButtonEvent2();
	}

}
