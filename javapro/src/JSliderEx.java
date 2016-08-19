//java.awt.Color
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
//javax.swing.event.ChangeLisener
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JSliderEx extends JFrame implements ChangeListener {

	// JSlider(int orientation, int min, int max, int initialvalue)
	JSlider red = new JSlider(0, 0, 255, 100);
	JSlider green = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
	JSlider blue = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);

	JLabel rgb = new JLabel("RGB(0,0,0)", JLabel.CENTER);

	JPanel p1 = new JPanel(new BorderLayout());
	JPanel p2 = new JPanel();
	JPanel west = new JPanel(new GridLayout(3, 1));
	JPanel cen = new JPanel(new GridLayout(3, 1));

	int r, g, b;

	public JSliderEx() {

		super("JSlider ����");

		red.setMajorTickSpacing(50); // �����̵��� �� ���� ����
		red.setMinorTickSpacing(5); // �����̵��� ���� ���� ����
		red.setPaintTicks(true); // �� ���ݰ� ���� ������ ǥ�� ����
		red.setPaintLabels(true); // �� ���ݿ� ǥ�õ� Label ǥ�� ����(����)

		green.setMajorTickSpacing(50);
		green.setMinorTickSpacing(5);
		green.setPaintTicks(true);
		green.setPaintLabels(true);

		blue.setMajorTickSpacing(50);
		blue.setMinorTickSpacing(5);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);

		JLabel rlabel = new JLabel("RED");
		JLabel glabel = new JLabel("GREEN");
		JLabel blabel = new JLabel("BLUE");

		rlabel.setForeground(Color.red); // ���� ���� ����
		glabel.setForeground(Color.green);
		blabel.setForeground(Color.blue);

		rgb.setFont(new Font("����ü", Font.BOLD, 24));

		west.add(rlabel);
		west.add(glabel);
		west.add(blabel);
		cen.add(red);
		cen.add(green);
		cen.add(blue);

		p1.add(west, "West");
		p1.add(cen, "Center");

		add(rgb, "North");
		add(p2, "Center");
		add(p1, "South");

		// setBounds(int x, int y, int width, int height)
		setBounds(300, 200, 400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		red.addChangeListener(this);
		green.addChangeListener(this);
		blue.addChangeListener(this);
	}

	public void stateChanged(ChangeEvent e) {
//		JSlider source = (JSlider) e.getSource();
//
//		if (e.getSource() == red) {
//			r = source.getValue();
//		} else if (e.getSource() == green) {
//			g = source.getValue();
//		} else if (e.getSource() == blue) {
//			b = source.getValue();
//		}
		r=red.getValue();
		g=green.getValue();
		b=blue.getValue();
		
		p2.setBackground(new Color(r, g, b));
		rgb.setText("RGB(" + r + "," + g + "," + b + ")");
	}

	public static void main(String[] str) {
		JSliderEx js = new JSliderEx();
	}
}
