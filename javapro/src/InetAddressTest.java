import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest implements ActionListener {
	private Frame f;
	private List list;
	private TextField tf;
	private InetAddress address;

	// constructor
	public InetAddressTest() {
		f = new Frame("InetAddress");
		list = new List(10);
		tf = new TextField(25);

		// window ���� �̺�Ʈ
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		Panel p = new Panel();
		p.add(new Label("HOST", Label.CENTER));
		p.add(tf);

		f.add(list, "Center");
		f.add(p, "South");
		f.setSize(300, 300);
		f.setLocation(300, 300);
		f.setResizable(false);
		f.setVisible(true);
		tf.addActionListener(this);
	}// ������ end

	// ��ư �̺�Ʈ�� ó���ϴ� �޼ҵ�
	public void actionPerformed(ActionEvent ae) {
		list.removeAll();
		// �ؽ�Ʈ �ʵ忡 �Էµ� ������ ����
		String name = tf.getText();// kbs.co.kr
		System.out.println("name = " + name);

		try {
			// Host ���� �޾Ƶ鿩 InetAddress Ŭ���� ��ü ����
			address = InetAddress.getByName(name);
		} catch (UnknownHostException e) {
			System.out.println(e);
		}

		// InetAddress Ŭ������ ���ǵ� �޼ҵ�
		list.add("InetAddress : " + address);
		list.add("Host Name : " + address.getHostName());
		list.add("Host Address : " + address.getHostAddress());

		try {
			list.add("");
			list.add("LocalHost : " + InetAddress.getLocalHost());
			list.add("LocalHost Name : " + InetAddress.getLocalHost().getHostName());
			list.add("LocalHost address : " + InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException ue) {
			System.out.println(ue);
		}

		// �ؽ�Ʈ �ʵ忡 ���� �Է��� �� ���͸� ġ�� �� �� �ؽ�Ʈ �ʵ带
		// ������ ����� ��Ŀ���� �ؽ�Ʈ �ʵ忡 �����.
		tf.setText("");
		tf.requestFocus();
	}

	public static void main(String[] args) {
		InetAddressTest it = new InetAddressTest();
	}
}
