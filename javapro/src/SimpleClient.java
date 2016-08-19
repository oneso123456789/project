import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class SimpleClient {
	public static void main(String[] args) {

		// ���ӿ� ���� ������ �����ϰ� �����ϴ� Socket
		// ��ü ����
		Socket socket = null;

		// �������� �����ϴ� �����͸� �ޱ� ���� ��Ʈ��
		// ��ü ����
		InputStream is = null;
		DataInputStream dis = null;

		// �������� �����ϴ� �����͸� �����ϱ� ����
		// ���� ����
		String serverMsg = null;

		try {
			// �����Ϸ��� ������ IP�� Port�� argument��
			// Socket ��ü ����
			socket = new Socket("192.168.30.78", 7777);
			System.out.println("Server Connection Success");
			System.out.println("client Socket : " + socket);

			// ���� ������ ������ ��Ʈ�� ����
			is = socket.getInputStream();
			dis = new DataInputStream(is);
			serverMsg = new String(dis.readUTF());

			System.out.println("�������� ���۵� �޽��� : " + serverMsg);

			// ��Ʈ���� ����
			dis.close();
			// ������ ������ ����
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main() end
}