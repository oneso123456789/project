import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneTest extends JFrame implements ActionListener {

	JButton b1, b2, b3, b4;

	public JOptionPaneTest() {
		setLayout(new FlowLayout());
		b1 = new JButton("Message");
		b2 = new JButton("ConFirm");
		b3 = new JButton("Intput");
		b4 = new JButton("Option");

		add(b1);
		add(b2);
		add(b3);
		add(b4);

		setSize(400, 100);
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}// ������ end

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(this, "�޼����� �����ݴϴ�.");
		} else if (e.getSource() == b2) {
			int an = JOptionPane.showConfirmDialog(this, "���� �ұ��?","����",JOptionPane.OK_CANCEL_OPTION);
//			if (an == JOptionPane.YES_OPTION) {
//				System.exit(0);
				 System.out.println(an);
//			}
		} else if (e.getSource() == b3) {
			String str = JOptionPane.showInputDialog(this, "��ȭ���� �Է��Ͻÿ�.");
			System.out.println(str);
		} else if (e.getSource() == b4) {
			String[] str = { "�߰�", "�˻�", "����" };
			int an = JOptionPane.showOptionDialog(this, "���ϴ� �۾��� �����Ͻÿ�.", "�ɼǴ�ȭ����", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
			System.out.println(an); // �߰�:0, �˻�:1, ����:2
			if (an == 2) {
				System.exit(0);
			}
		}
	}// actionPerformed() end

	public static void main(String[] args) {
		JOptionPaneTest jop = new JOptionPaneTest();
	}

}
