import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
	public static void main(String[] args) {

		// ���� ������ �����ϰ� �����ϴ� ServerSocket
		// ��ü�� ����
		ServerSocket server = null;

		// ���ӿ� ���� ������ �����ϰ� �����ϴ� Socket ��ü ����
		Socket socket = null;

		// Ŭ���̾�Ʈ���� �����͸� �����ϱ� ���� ��Ʈ�� ����
		OutputStream os;
		DataOutputStream dos;

		// Ŭ���̾�Ʈ���� ���� �޽���
		String msg = "Hello, Client";

		try {
			// ��ǥ ��Ʈ 7777�� ���� ���� ��ü�� ����
			server = new ServerSocket(7777);
			System.out.println("Wait Client......");

			// Ŭ���̾�Ʈ�� ������ ��ٸ�
			socket = server.accept();
			System.out.println("Client Connection Success");
			System.out.println("server socket : " + socket.getInetAddress().getHostAddress());

			// ���� ���� ������ Ŭ���̾�Ʈ���� �����͸�
			// �����ϱ� ���ؼ� ��� ��Ʈ���� ����
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			dos.writeUTF(msg);

			// ��Ʈ���� ����
			dos.close();
			// ������ Ŭ���̾�Ʈ�� ������ �ΰ� �ִ� Socket��
			// Close �ؼ� ������ ����
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}