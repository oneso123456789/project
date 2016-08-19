import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutTest01 {

	Frame f;
	Checkbox man, woman;
	Checkbox bibim, jung, yuk;
	CheckboxGroup gender;
	Choice c;
	
	public LayoutTest01(){
		f=new Frame("배치 연습");
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}			
		});
		
		gender = new CheckboxGroup();
		man =new Checkbox("남자",gender, true);
		woman =new Checkbox("여자",gender, false);
		
		bibim = new Checkbox("비빔밥", true);
		jung = new Checkbox("정식", true);
		yuk = new Checkbox("육계장", false);
		
		c = new Choice();
		c.add("아침");
		c.add("점심");
		c.add("저녁");
		
		Panel p1 = new Panel();
		p1.add(man);
		p1.add(woman);
		
		Panel p2 = new Panel();
		p2.add(bibim);
		p2.add(jung);
		p2.add(yuk);
		
		Panel p3 = new Panel(new BorderLayout());
		p3.add(p1,"North");
		p3.add(p2,"Center");
		
		f.add(p3, "Center");
		f.add(c, "South");
		
		f.setSize(300,150);
		f.setVisible(true);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LayoutTest01 lt = new LayoutTest01();
	}

}
