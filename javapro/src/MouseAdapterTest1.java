import java.awt.event.*; //java.awt.event.MouseListener, java.awt.MouseEvent
import javax.swing.*;

public class MouseAdapterTest1 extends JFrame {
	JLabel statusBar;

	public MouseAdapterTest1() {
		super("MouseEvent����  MouseListener ���");

		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				statusBar.setText("[" + e.getX() + ", " + e.getY() + "] �������� ���콺 Click");
			}

			public void mousePressed(MouseEvent e) {
				statusBar.setText("[" + e.getX() + ", " + e.getY() + "] �������� ���콺 Press");
			}

			public void mouseReleased(MouseEvent e) {
				statusBar.setText("[" + e.getX() + ", " + e.getY() + "] �������� ���콺 Release");
			}

			public void mouseEntered(MouseEvent e) {
				statusBar.setText("���콺 �����Ͱ�  �ش�  ������ȿ� ����");
			}

			public void mouseExited(MouseEvent e) {
				statusBar.setText("���콺 �����Ͱ�  �ش�  ����������� ����");
			}
		});

		statusBar = new JLabel();
		add(statusBar, "South");

		setSize(300, 150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		MouseAdapterTest1 mouse = new MouseAdapterTest1();
	}
}
