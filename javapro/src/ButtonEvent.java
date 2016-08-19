import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonEvent {
	private Frame f;
	private Button push;

	public ButtonEvent() {
		f = new Frame("ActionEvent");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		push = new Button("PUSH");

		// ��ư�� Event Listener�� ��Ͻ�Ŵ
		ButtonEventHandler my = new ButtonEventHandler();
		push.addActionListener(my);

		f.setLayout(new FlowLayout());
		f.add(push);
		f.setSize(200, 100);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		ButtonEvent be = new ButtonEvent();
	}
}
