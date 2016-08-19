import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
//java.util.StringTokenizer;
import java.util.StringTokenizer;

public class TalkServer implements ActionListener {

	Frame serverTalk;
	TextArea view;
	TextField message;

	// Ŭ���̾�Ʈ���� ������ ���� Ŭ���� ����
	ServerSocket serverSocket;
	Socket socket;

	// �����͸� �ְ�ޱ� ���� ��Ʈ�� Ŭ���� ����
	DataInputStream dis;
	DataOutputStream dos;

	// ��������. ���� ���� �����
	// ��ȭ�� ������ ȭ�鿡 ��½�Ű�� ȭ�� ����
	public TalkServer() {

		serverTalk = new Frame("Server");

		view = new TextArea(" ", 30, 50, TextArea.SCROLLBARS_NONE);
		view.setEditable(false); // ���� �Ұ���

		message = new TextField(27);

		Panel p = new Panel();
		p.add(new Label("Message", Label.LEFT));
		p.add(message);

		serverTalk.add(view, "Center");
		serverTalk.add(p, "South");

		serverTalk.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		serverTalk.setSize(300, 400);
		serverTalk.setLocation(300, 300);
		serverTalk.setResizable(false);
		serverTalk.setVisible(true);

		message.addActionListener(this);

	}// ������ end

	// Ŭ���̾�Ʈ�� ���� �� ������ ������Ű�� �޼ҵ�
	public void waitClient() {

		try {
			// ��ǥ ��Ʈ 3333���� ������ ServerSocket ��ü
			serverSocket = new ServerSocket(3333);
			view.append("Wait Client..........\n");

			// Ŭ���̾�Ʈ�� ������ ��ٸ�
			socket = serverSocket.accept();
			view.append("Clinet Connect........\n");

			// ����� ��Ʈ�� ����
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());

			// Ŭ���̾�Ʈ�� �������ڸ��� ������ ID�� TextArea�� ���
			view.append(dis.readUTF() + "���� �����ϼ̽��ϴ�.\n");

		} catch (IOException ie) {
			System.out.println("���� ���� ���� ����");
		}

		// ���� ������ �����ϸ鼭 Ŭ���̾�Ʈ�� ������ �޽����� ���
		while (true) {

			try {
				String msg = dis.readUTF().trim();
				String msgPlus = "";

				// ���̵�� ��ȭ ������ �и��ϱ� ����
				// StringTokenizer Ŭ������ �̿��� "/"�� �������� �и�
				StringTokenizer st = new StringTokenizer(msg, "/");
				view.append("[" + st.nextToken() + "] : ");
				while (st.hasMoreTokens()) {
					msgPlus += st.nextToken();
				}
				view.append(msgPlus + "\n");
			} catch (Exception e) {
				System.out.println(e);
			} // catch end

		} // while end

	}// waitClient() end

	// �ؽ�Ʈ �ʵ忡 �����͸� �Է��ϰ� ���͸� ������ �̺�Ʈ ó��
	public void actionPerformed(ActionEvent ae) {

		try {
			// Ŭ���̾�Ʈ���� �����͸� ����
			// ������ ���� ������ ���̵�/������ ����
			dos.writeUTF("Server/" + message.getText());

			view.append("[Server] : " + message.getText() + "\n");
			message.setText("");

		} catch (Exception e) {
		}

	}// actionPerformed() end

	public static void main(String[] args) {
		TalkServer talk = new TalkServer();
		talk.waitClient();
	}
}