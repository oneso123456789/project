import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventSelf implements ActionListener {
	Frame f;
	Button b;
	TextArea textA;

	public EventSelf() {
		f = new Frame("ActionEvent");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		b = new Button("�����ּ���!!");
		textA = new TextArea();

		b.addActionListener(this);

		f.add(b, "North");
		f.add(textA, "Center");

		f.setSize(300, 300);
		f.setLocation(500, 100);
		f.setResizable(false);
		f.setVisible(true);
	} // ������ end

	public void actionPerformed(ActionEvent e) {
		// textA.setText( textA.getText() +
		// "��ư�� ���Ⱦ��" + "\n" );
		textA.append("��ư�� ������� \n");
		// textA.setBackground(Color.red);
		textA.setBackground(new Color(255, 100, 100));
	}

	public static void main(String args[]) {
		EventSelf et = new EventSelf();
	}
}