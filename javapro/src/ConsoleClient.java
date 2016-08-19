import java.io.*;
import java.net.*;

public class ConsoleClient {

    public static void main( String[] args ) {
		
	Socket socket = null;
	DataOutputStream dos = null;
	DataInputStream dis = null;

	try {
	    // ������ �����ϴ� ���� ��ü ����
	    socket = new Socket("192.168.30.78", 9876 );

	    // ������ �����͸� �ְ�ޱ� ���� ��Ʈ�� ����
	    dos = new DataOutputStream( socket.getOutputStream() );
	    dis = new DataInputStream( socket.getInputStream() );

	    // ���� ����
		while( true ) {
			
		    System.out.print( "Client input Message : " );
		    String message = TalkStatement.readString();
		    
		    // Ű����κ��� �о� ���� �����͸� �������� ����
		    dos.writeUTF( message );
		    
		    // ��Ʈ���� ���� �����͸� �о� ����
		    System.out.println( "Server Message : " + dis.readUTF() );
		}//while end

	} catch ( Exception e ) {
	    try {
			// ��Ʈ�� ��ü�� ���� ��ü ����
			dos.close();
			dis.close();
			socket.close();
	    } catch ( IOException io ) {
			System.out.println( io );
	    }
	}// catch end
    }// main end
}
