import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
//java.util.Date;
import java.util.Date;

public class SimpleServer2 {
	public static void main(String[] args) throws Exception {

		// ��ǥ ��Ʈ�� ���ϴ� ServerSocket ��ü ����
		ServerSocket serverSocket = null;

		// ���� ������ ���ϴ� Socket ��ü ����
		Socket socket = null;
		String msg = "Hello, Client";

		// Object Ÿ������ �����͸� �ְ�ޱ� ���� ��Ʈ�� ��ü ����
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		// ��ǥ ��Ʈ 1234�� ���ϴ� ServerSocket ��ü ����
		serverSocket = new ServerSocket(1234);

		while (true) {

			System.out.println("Wait Client ..........");

			// Ŭ���̾�Ʈ�� ������ ��ٸ�
			socket = serverSocket.accept();

			// Socket Ŭ������ �޼ҵ带 �̿���
			// Ŭ���̾�Ʈ�� ������ Ŭ���̾�Ʈ�� IP �ּҸ� ����
			System.out.println("Clinet IP : " + socket.getInetAddress().getHostAddress());
			System.out.println(socket);

			// ObjectOutputStream,InputStream ��ü ����
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());

			// Ŭ���̾�Ʈ�� ���� �����͸� �о� ����
			System.out.println(ois.readObject().toString() + "���� �����ϼ̽��ϴ�");

			// Ŭ���̾�Ʈ�� �����͸� ����
			oos.writeObject(msg);
			oos.writeObject(new Date());
			oos.writeObject(new String("Java Network Programming"));

			// ��Ʈ�� ��ü ����
			oos.close();
			ois.close();
			// ���� ��ü ����
			socket.close();
		} // while end
	}
}
