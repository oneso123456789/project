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

// List�� Item�� ����(click)�Ҷ� ItemEvent�� �߻���. 
//List�� Item�� double click�Ҷ��� ActionEvent�� �߻���.
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

		// List ��ü ���� �� Item ���
		list = new List();
		list.add("gemini");
		list.add("johnharu");
		list.add("gracedew");

		frame.add(list, "Center");
		frame.add(tf, "South");

		frame.setSize(300, 200);
		frame.setVisible(true);

		// List ��ü�� ItemListener�� ��Ͻ�Ŵ
		// list.addItemListener( this );
		list.addActionListener(this);
		list.addItemListener(this);
		tf.addActionListener(this);
	}// ������ end

	// Item�� ���°� ��ȭ���� ��
	// public void itemStateChanged( ItemEvent ie ) {

	// ���� ���õ� Item�� ���� �޾� ������ ����
	// String item = list.getSelectedItem();
	// TextField�� ���� ���ý�Ŵ
	// tf.setText( item );
	// }

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == list) {
			String item = list.getSelectedItem();
			list.remove(item);
//			tf.setText(item + " ������");
		}else if(ae.getSource() == tf){
			list.add(tf.getText());
			tf.setText("");
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String item = list.getSelectedItem();
		tf.setText(item + " ������");
	}

	public static void main(String[] args) {
		ListEvent1 le = new ListEvent1();
	}
}