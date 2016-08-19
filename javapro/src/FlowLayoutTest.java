import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest {
	private Frame f;
	private Button b1, b2, b3, b4, b5;

	public FlowLayoutTest() {
		// 프레임 객체 생성
		f = new Frame("FlowLayout");

		// 다섯 개의 버튼 객체들을 생성
		b1 = new Button("Button1");
		b2 = new Button("Button2");
		b3 = new Button("Button3");
		b4 = new Button("Button4");
		b5 = new Button("Button5");

		// 윈도우 종료 이벤트
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// Panel을 생성한 후, 버튼들을 Panel에 붙임
//		Panel p = new Panel();
//		p.add(b1);
//		p.add(b2);
//		p.add(b3);
//		p.add(b4);
//		p.add(b5);

// 프레임의 배치관리자를 BorderLayout관리자에서
// FlowLayout관리자로 변경하라는 의미		
		f.setLayout(new FlowLayout());
		
		// Panel을 Frame의 Center에 붙임
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		// Frame의 사이즈를 결정하고 화면에 출력함
		f.setSize(400, 100);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutTest ft = new FlowLayoutTest();
	}
}
