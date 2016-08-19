import java.io.*;
import java.net.*;

public class ConsoleServer {

    public static void main( String[] args ){
    	
	ServerSocket server = null;
	Socket socket = null;
	
	DataInputStream dis = null;
	DataOutputStream dos = null;

	try {
	    // ��ǥ ��Ʈ 9876�� ���� ServerSocket ��ü ����
	    server = new ServerSocket( 9876 );

	    System.out.println( "Wait Client........." );
	    // Ŭ���̾�Ʈ�� ������ ��ٸ�
	    socket = server.accept();
	    
	    System.out.println( "Client Connection Success" );
	    System.out.println();

	    // Ŭ���̾�Ʈ�� �����͸� �ְ�ޱ� ���� ����� ��Ʈ�� ����
		// InputStream is = socket.getInputStream();
		// OutputStream os = socket.getOutputStream();
	    dis = new DataInputStream(socket.getInputStream());
	    dos = new DataOutputStream(socket.getOutputStream()); 

	    // ���� ����
	    while( true ) {
			
			// �����͸� �о� ����
			System.out.println( "Client Message : " + dis.readUTF() );
			System.out.print( "Server input message : " );
			String message = TalkStatement.readString();
		    
			// Ű����κ��� �о���� �����͸� Ŭ���̾�Ʈ���� ���� 
			dos.writeUTF( message );
	    }//while end

	} catch ( Exception e ) {

	    try {
			// ��Ʈ���� ���� ��ü�� �����ϰ� �ڿ� �ݳ�
			dis.close();
			dos.close();
			socket.close();
	    } catch ( IOException io ) {
			System.out.println( io );
	    }//catch end

	}//catch end

    }//main end
}
			