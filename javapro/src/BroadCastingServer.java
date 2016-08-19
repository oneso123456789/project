import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// Ŭ���̾�Ʈ�� ������ �޾� �鿩 ��� Ŭ���̾�Ʈ���� 
// �����͸� ���۽��� �ִ� ServerThread ��ü�� ���� 
public class BroadCastingServer {

	// ������ ���� �����ϴ� Component
	private Frame f;
	private TextArea state;

	// Ŭ���̾�Ʈ�� ������ �����ϱ� ���� Ŭ���� ����
	private ServerSocket server;
	private Socket socket;

	// �����͸� �ְ���� �� �ֵ��� Thread�� ������ Ŭ���� ����
	private ServerThread st;

	// ��������. GUI �� ����
	public BroadCastingServer() {

		f = new Frame("Server");
		state = new TextArea("", 30, 50, TextArea.SCROLLBARS_NONE);
		state.setEditable(false);

		f.add(state, "Center");

		f.setSize(300, 400);
		f.setLocation(300, 300);
		f.setResizable(false);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}// ������ end

	// ������ �����Ű�� �޼ҵ�
	public void startServer() {

		try {
			// ��ǥ ��Ʈ 7777�� ������ Ŭ���̾�Ʈ�� ������
			// ��ٸ��� ServerSocket ��ü ����
			server = new ServerSocket(6666);

			while (true) {

				// Ŭ���̾�Ʈ�� ������ �������� ���� ����
				socket = server.accept();

				// ��Ʈ�� ����
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

				// Ŭ���̾�Ʈ�� �����ϴ� ID ���� �޾� ����
				String name = dis.readUTF();

				// broadcasting�� ���ִ� ServerThread ��ü ����
				st = new ServerThread(socket, state, dis, dos, name);
				Thread t = new Thread(st);
				t.start();
			} // while end

		} catch (IOException ie) {
			System.out.println(ie.getMessage());
		}

	}// startServer() end

	public static void main(String[] args) {
		BroadCastingServer ser = new BroadCastingServer();
		ser.startServer();
	}
}
