import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// List의 Item을 선택(click)할때 ItemEvent가 발생함. 
//List의 Item을 double click할때는 ActionEvent가 발생함.
public class ListEvent1 implements ActionListener, ItemListener {
	private Frame frame;
	private List list;
	private TextField tf;
	private TextArea ta;

	public ListEvent1() {

		frame = new Frame("List Event");
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		tf = new TextField(20);

		// List 객체 생성 및 Item 등록
		list = new List();
		list.add("gemini");
		list.add("johnharu");
		list.add("gracedew");

		frame.add(list, "Center");
		frame.add(tf, "South");

		frame.setSize(300, 200);
		frame.setVisible(true);

		// List 객체에 ItemListener를 등록시킴
		// list.addItemListener( this );
		list.addActionListener(this);
		list.addItemListener(this);
		tf.addActionListener(this);
	}// 생성자 end

	// Item의 상태가 변화했을 때
	// public void itemStateChanged( ItemEvent ie ) {

	// 현재 선택된 Item을 리턴 받아 변수에 저장
	// String item = list.getSelectedItem();
	// TextField에 값을 세팅시킴
	// tf.setText( item );
	// }

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == list) {
			String item = list.getSelectedItem();
			list.remove(item);
//			tf.setText(item + " 선택함");
		}else if(ae.getSource() == tf){
			list.add(tf.getText());
			tf.setText("");
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String item = list.getSelectedItem();
		tf.setText(item + " 선택함");
	}

	public static void main(String[] args) {
		ListEvent1 le = new ListEvent1();
	}
}