import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.net.*;


// �����带 �̿��� ��� Ŭ���̾�Ʈ���� �����͸� �������ִ� 
//  broadcasting�� ������ Ŭ����
public class ServerThread implements Runnable {
	
    // ������ Ŭ���̾�Ʈ�� �����ϴ� vector ��ü ����
    private static Vector list = new Vector();
    
    // BroadCastringServer�� �Ѱ��ִ� argument�� �����ϱ� ���� 
    //  ��� ���� ����
    private Socket socket;
    private TextArea state;
    private DataInputStream dis;
    private DataOutputStream dos;

    // ������� ��ȭ���� �����ϴ� ���� ���� 
	String talkName;

    // ������
    // BroadCastingServer���� �Ѱ��ִ� argument�� ��� ������ �Ҵ�
    public ServerThread( Socket socket, TextArea state, 
		DataInputStream dis, DataOutputStream dos, 
		String talkName) throws IOException{
    	
		this.socket = socket;
		this.state = state;
		this.dis = dis;
		this.dos = dos;
		this.talkName = talkName;
    }

    
    public void run() {
    	
		// ������ TextArea�� ���� ������ Ŭ���̾�Ʈ�� ���
		state.append( talkName + "���� �����ϼ̽��ϴ�.\n" );
		// ��� Ŭ���̾�Ʈ�鿡�� ���� ������ ����ڸ� �˷���
		compareState( "Login/" + talkName + "���� �����ϼ̽��ϴ�.\n" );

		try {
			// ���� ������ ����ڸ� ���Ϳ� �߰�
			list.addElement( this );

			while( true ) {
				String msg = dis.readUTF();
				compareState( msg );
			}//while end

		} catch( IOException ie ) {
			// ������ �������ų�, ��Ʈ���� ���� �Ǿ��� ���,
			// Exception�� �߻����� ���� ������ ����̹Ƿ�
			state.append( talkName + "���� �����ϼ̽��ϴ�\n" );
			compareState( "LogOut/" + talkName + "���� �����ϼ̽��ϴ� \n" );

			// ���Ϳ��� ���� Exception�� �� Object�� ����
			list.removeElement( this );

			try {
				socket.close();
			} catch( IOException e ) {
				System.out.println( "���� �ݴ� �� ���� �߻�" );
			}
		}// catch end
    }// run() end


    // ���� Login�� �Ϸ��� �ϴ���, �ƴϸ� ��ȭ ������ ������ ��������
    //  �Ǵ��ϱ� ���ؼ� ������ method
    public void compareState( String message ) {
    	
		StringTokenizer st = new StringTokenizer( message, "/" );
		String protocol = st.nextToken(); // Login,Logout,Message
		String msg = st.nextToken();
		System.out.println( msg );

		if( protocol.equals( "Login" ) || protocol.equals( "LogOut" )) {
			broadCasting( "NONE", msg );
		} else {
			broadCasting( talkName, msg );
		}
    }//compareState() end


    // ���� ������ ������ ��� Ŭ���̾�Ʈ���� �޽����� �����ִ� method
    public void broadCasting( String talkName, String message ) {
    	
		synchronized( list ) {
			Enumeration e = list.elements();

			while( e.hasMoreElements() ) {
				ServerThread temp = (ServerThread)e.nextElement();

				try {
					temp.dos.writeUTF( talkName );
					temp.dos.writeUTF( message );
				} catch( IOException ie ) {
					System.out.println( ie );
				}
			}//while end
		}//synchronized() end

    }//broadCasting
}