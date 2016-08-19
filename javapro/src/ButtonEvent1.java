import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonEvent1 implements ActionListener {

	private Frame f;
	private Button push;

	public ButtonEvent1() {

		f = new Frame("ActionEvent");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		push = new Button("PUSH");

		// ��ư�� Event Listener�� ��Ͻ�Ŵ
		// ButtonEventHandler my = new ButtonEventHandler();
		// push.addActionListener( my );

		push.addActionListener(this);

		f.setLayout(new FlowLayout());
		f.add(push);
		f.setSize(200, 100);
		f.setVisible(true);
	}// ������ end

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("��ư�� ���� �����.");
	}

	public static void main(String[] args) {
		ButtonEvent1 be = new ButtonEvent1();
	}
}
