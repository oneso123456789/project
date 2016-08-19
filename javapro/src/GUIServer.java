import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//java.util.Date;
import java.util.Date;

public class GUIServer {

	Frame f;
	TextArea view;
	ServerSocket serversocket;
	Socket socket;

	// Ŭ���̾�Ʈ�� ������ �޽���
	String msg = "Hello, Client";

	// Ŭ���̾�Ʈ�� ��Ʈ���� ������ ��ü ����
	ObjectOutputStream dos;
	ObjectInputStream dis;

	// ������ �޼ҵ��̹Ƿ� ���� ���� �����
	// Server�� GUI ���� ȭ�鿡 �����
	public GUIServer() {

		f = new Frame("Server");
		view = new TextArea();

		// Window�� ���� �̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		f.add(view, "Center");
		f.setSize(400, 150);
		f.setLocation(300, 300);
		f.setVisible(true);
	}// ������ end

	// server�� ������ ������Ű�� �޼ҵ�
	public void startServer() throws Exception {

		// ��ǥ ��Ʈ�� 2222���� ���ϴ� ServerSocket ��ü ����
		serversocket = new ServerSocket(2222);

		// ���� ������ ���鼭 Ŭ���̾�Ʈ�� ������ ��ٸ�
		while (true) {
			view.append("Client�� ������ ��ٸ��ϴ�....\n");

			// Ŭ���̾�Ʈ�� ������ ó���ϴ� �κ�
			socket = serversocket.accept();

			// Ŭ���̾�Ʈ�� ������ ������ IP�� TextArea�� ���
			view.append("IP:" + socket.getInetAddress().getHostAddress() + "\n");

			// ��Ʈ�� ����
			// InputStream is = socket.getInputStream();
			// OutputStream os = socket.getOutputStream();
			dis = new ObjectInputStream(socket.getInputStream());
			dos = new ObjectOutputStream(socket.getOutputStream());

			// Ŭ���̾�Ʈ�� �����ϴ� ID�� TextArea�� ���
			// view.append( "[" +dis.readObject().toString() + "]" +
			view.append("[" + dis.readObject() + "]" + " ���� �����ϼ̽��ϴ�.\n");

			// Ŭ���̾�Ʈ�� Object ����
			dos.writeObject(msg);
			dos.writeObject(new Date());

			// ��Ʈ���� Socket ����
			dos.close();
			dis.close();
			socket.close();
		} // while end
	}// startServer() end

	public static void main(String[] args) { // throws Exception {
		GUIServer server = new GUIServer();

		try {
			server.startServer();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}// main() end
}