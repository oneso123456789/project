import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ShowCombo extends JFrame {

	JComboBox combo;

	public ShowCombo() {

		super("미녀 영화배우");

		String[] act = {"한예슬","김태희","최강희"};
		
		Vector v = new Vector();
		v.add("한예슬");
		v.add("김태희");
		v.add("최강희");
		
		combo = new JComboBox(v);
//		combo.addItem("한예슬");
//		combo.addItem("김태희");
//		combo.addItem("최강희");
//		combo.add("안화수");

		add(combo, "Center");

		setSize(200, 60);
//		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}// 생성자 end

	public static void main(String s[]) {
		ShowCombo sc = new ShowCombo();
	}// main end

}