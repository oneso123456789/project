import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest01 {

	public static void main(String[] args) {

		Frame f = new Frame("프레임 연습");
		f.setSize(400, 300);
		f.setLocation(100, 100);
		
//		f.setBackground(Color.green);
//		Color c = new Color(255,0,0);
//		f.setBackground(c);
		
		f.setBackground(new Color(255,0,0));
		
		f.setResizable(true);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}// main end
}