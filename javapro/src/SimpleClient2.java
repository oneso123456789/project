import java.net.*;
import java.io.*;
import java.util.Date;

public class SimpleClient2 {
    public static void main( String[] args ) throws Exception {
    	
        // ������ �����ϱ� ���� Socket ��ü ����
        Socket socket;

        // Object�� �����͸� �ְ� �ޱ� ���� ��Ʈ�� ��ü ����
        ObjectInputStream ois;
        ObjectOutputStream oos;

        // �������� �����ϴ� �����͸� �����ϱ� ���� ���� ����
        String serverMsg = null;
        
        // �������� ������ ���̵� �����ϴ� ����
        String ID = "gemini";

        // ������ �����ϴ� Socket ��ü ����
        // ���� ���� ������ ����
        socket = new Socket( "192.168.30.78",1234 );
        System.out.println( "Server Connection Success" );
		
        // ������ ObjectInputStream, ObjectOutputStream ��Ʈ��
		// ����
        ois = new ObjectInputStream(socket.getInputStream());
		oos = new ObjectOutputStream(socket.getOutputStream());

		//���������� ID ����
		oos.writeObject( ID );

		// �������� �����ϴ� �޽����� ����
		serverMsg = new String( ois.readObject().toString() );
		Date d = (Date)ois.readObject();

		// �޽��� ���
		System.out.println( "�������� ���۵� �޽���" );
		System.out.println( serverMsg );
		System.out.println( d.toString() );
		System.out.println( ois.readObject().toString() );

		// ��Ʈ�� ��ü ����
		oos.close();
		ois.close();
		// ���� ��ü ����
		socket.close();
    }//main() end
}