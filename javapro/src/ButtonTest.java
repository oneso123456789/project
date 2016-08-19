import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {
	private Frame f;
	private Button b1, b2;

	public ButtonTest() {
		// 프레임 생성
		f = new Frame("Button");

		// 윈도우 종료 이벤트
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 버튼 객체 생성
		b1 = new Button("");
		b2 = new Button("PUSH");
		
		b1.setBackground(Color.red);
		b2.setBackground(new Color(255,255,0));
		
		b1.setForeground(Color.white);

		// 버튼의 Label 값을 설정
		b1.setLabel("확인");

		// 버튼위의 Label값을 화면에 출력
		System.out.println("b1's label : " + b1.getLabel());
		System.out.println("b2's label : " + b2.getLabel());

		f.add(b1, "West");
		f.add(b2, "East");

		f.setSize(300, 100);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		ButtonTest bt = new ButtonTest();
	}
}