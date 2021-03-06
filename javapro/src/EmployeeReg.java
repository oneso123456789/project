import java.awt.*;
import java.awt.event.*;

public class EmployeeReg {

	Frame f;
	Label name, sex, jumin, hyphen, address, hobby, buseo, intro;
	TextField tfName, tfJumin1, tfJumin2, tfAddress;
	CheckboxGroup fm;
	Checkbox cbMale, cbFemale;
	Checkbox cbSport, cbMusic, cbMovie, cbComp;
	Choice bu;
	TextArea ta;
	Button b1, b2;
	Panel p1, p2, p3, p4, p4_1, p5, p6, p7, p8, p9;

	public EmployeeReg() {
		f = new Frame("사원등록");

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
//				System.exit(0);
				f.dispose();
			}
		});

		name = new Label("성명");
		sex = new Label("성별");
		jumin = new Label("주민등록번호");
		hyphen = new Label("-");
		address = new Label("주소");
		hobby = new Label("취미");
		buseo = new Label("부서명");
		intro = new Label("자기소개");

		tfName = new TextField(18);
		tfJumin1 = new TextField(13);
		tfJumin2 = new TextField(14);
		tfAddress = new TextField(34);

		fm = new CheckboxGroup();
		cbMale = new Checkbox("남", fm, false);
		cbFemale = new Checkbox("여", fm, false);

		cbSport = new Checkbox("운동", true);
		cbMusic = new Checkbox("음악감상");
		cbMovie = new Checkbox("영화");
		cbComp = new Checkbox("컴퓨터");

		bu = new Choice();
		bu.add("부서명 선택");
		bu.add("기획부");
		bu.add("영업부");
		bu.add("총무부");

		ta = new TextArea(10, 40);

		b1 = new Button("저장");
		b2 = new Button("종료");

		p1 = new Panel();
		p1.setLayout(new GridLayout(5, 1, 0, 20));
		p1.add(name);
		p1.add(jumin);
		p1.add(address);
		p1.add(buseo);
		p1.add(hobby);

		p2 = new Panel();
		p2.add(tfName);
		p2.add(sex);
		p2.add(cbMale);
		p2.add(cbFemale);

		p3 = new Panel();
		p3.add(tfJumin1);
		p3.add(hyphen);
		p3.add(tfJumin2);

		p4 = new Panel();
		p4.add(tfAddress);

		p4_1 = new Panel();
		p4_1.add(bu);

		p5 = new Panel();
		p5.add(cbSport);
		p5.add(cbMusic);
		p5.add(cbMovie);
		p5.add(cbComp);

		p6 = new Panel();
		p6.setLayout(new GridLayout(5, 1, 0, 10));
		p6.add(p2);
		p6.add(p3);
		p6.add(p4);
		p6.add(bu);
		p6.add(p5);

		p7 = new Panel();
		p7.add(p1);
		p7.add(p6);

		p8 = new Panel();
		p8.setLayout(new BorderLayout());
		p8.add(intro, "North");
		p8.add(ta, "Center");

		p9 = new Panel();
		p9.add(b1);
		p9.add(b2);

		f.add(p7, "North");
		f.add(p8, "Center");
		f.add(p9, "South");

		f.setSize(400, 600);
		f.setBackground(Color.yellow);
		f.setLocation(400, 100);
		f.setVisible(true);
		f.setResizable(false);
	}

	public static void main(String[] args) {
		EmployeeReg er = new EmployeeReg();
	}
}
