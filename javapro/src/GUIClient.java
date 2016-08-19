import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
//java.util.Date;
import java.util.Date;

public class GUIClient implements ActionListener {

	// Client GUI�� �����ϱ� ���� component ����
	Frame first;
	Frame second;
	TextField ipField;
	TextField idField;
	Button connection;
	TextArea connectState;

	// ������ �����ϱ� ���� Socket ��ü ����
	Socket socket;

	// ��Ʈ�� Ŭ���� ����
	ObjectInputStream dis;
	ObjectOutputStream dos;

	// �������� �����ϴ� �޽����� ������ ���� ����
	String serverMsg = null;

	// ������
	public GUIClient() {

		first = new Frame("���� �õ�");
		connection = new Button("Connect");

		// Server�� IP �ּҿ� id�� �޾� ���̴� TextField ��ü ����
		ipField = new TextField(15);
		idField = new TextField(15);

		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(2, 1, 0, 10));
		p1.add(new Label("Server", Label.CENTER));
		p1.add(new Label("ID", Label.CENTER));

		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(2, 1, 0, 10));
		p2.add(ipField);
		p2.add(idField);

		Panel p3 = new Panel();
		p3.add(p1);
		p3.add(p2);

		// ���� �õ� ������ ����( BorderLayout(int hgap, int vgap) )
		first.setLayout(new BorderLayout(0, 10));
		first.add(p3, "Center");
		first.add(connection, "South");

		// ������ ���� �̺�Ʈ ó��
		first.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		first.setSize(300, 150);
		first.setLocation(300, 300);
		first.setVisible(true);

		// ��ư�� ActionEvent�� ��Ͻ�Ŵ
		connection.addActionListener(this);
	}// ������ end

	// �������� ������ ���������� �̷������ ���, ȭ�鿡
	// ��µǴ� �� ��° �������� �����ϴ� �޼ҵ�
	public void secondFrame() throws Exception {

		second = new Frame("Client");
		connectState = new TextArea(80, 80);

		// ������ ���� �̺�Ʈ ó��
		second.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		second.add(connectState, "Center");

		// �������� ������ ���������� �̷�������� TextArea�� ���
		connectState.append("Connection Success" + "\n");

		// Object�� �޾Ƶ��̱� ���� ObjectInputStream ��ü ����
		// InputStream is = socket.getInputStream();
		dis = new ObjectInputStream(socket.getInputStream());

		// �������� ���۵� �����͸� ����
		// serverMsg = new String( dis.readObject().toString() );
		serverMsg = (String) dis.readObject();
		Date d = (Date) dis.readObject();

		// TextArea�� �����͸� ���
		connectState.append(serverMsg + "\n");
		// connectState.append( d.toString() + "\n" );
		connectState.append(d + "\n");

		second.setSize(300, 200);
		second.setLocation(300, 300);
		second.setVisible(true);
	}// secondFrame() end

	// ��ư�� �̺�Ʈ�� �߻��ϸ� ó�����ִ� method ����
	public void actionPerformed(ActionEvent ae) {

		// �� ���� TextField�� ������ �ԷµǸ� ���α׷� ����
		if (ipField.getText().equals("") && idField.getText().equals("")) {
			System.exit(0);

			// connect ��ư�� ��������
		} else if (ae.getSource() == connection) {

			try {
				// ������ ���� �õ�
				socket = new Socket(ipField.getText(), 2222);

				// ObjectOutputStream ��ü�� ������ ID ���� ����
				// OutputStream os = socket.getOutputStream();
				dos = new ObjectOutputStream(socket.getOutputStream());
				dos.writeObject(idField.getText());

				// ���� �õ� �������� ȭ�鿡�� ������� ��
				first.setVisible(false);

				// ���� �õ� �������� �ڿ��� �ݳ�
				first.dispose();

				// �� ��° �������� ȭ�鿡 ��½�Ŵ
				secondFrame();

			} catch (Exception e) {
				System.out.println("���� ���� ����");
			}
		} // if ~ else if end
	}// actionPerformed() end

	public static void main(String[] args) {
		GUIClient gui = new GUIClient();
	}
}