import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class BroadCastingClient implements Runnable, ActionListener {
	
    // Ŭ���̾�Ʈ�� ���� �����ϴ� component
    Frame first, second;
    Panel p;
    TextField ipField;
    TextField idField;
    Button connection;

    TextArea talkScreen;
    TextField tf;

    // �������� ������ ���� socket ��ü ����
    Socket socket;
    
    // ��Ʈ�� Ŭ���� ����
    DataInputStream dis;
    DataOutputStream dos;

    Thread listen;
	
    // ������. Ŭ���̾�Ʈ GUI ���� ����
    public BroadCastingClient( ) {
    	
		first = new Frame( "LOGIN" );
//		second = new Frame( "���� ����" );

        connection = new Button( "Connect" );

		// Server�� IP�� ��ȭ���� �޾� ���̴� TextField ��ü ����
        ipField = new TextField( 15 );
        idField = new TextField( 15 );

		// Label�� ���� Panel
        Panel p1 = new Panel();
        p1.setLayout( new GridLayout( 2, 1, 0, 10 ));
        p1.add( new Label( "Server", Label.CENTER ));
        p1.add( new Label( "ID", Label.CENTER ));

		// TextField�� ���� Panel
        Panel p2 = new Panel();
        p2.setLayout( new GridLayout( 2, 1, 0, 10 ));
        p2.add( ipField );
        p2.add( idField );	

        Panel p3 = new Panel();
        p3.add( p1 );
        p3.add( p2 );

		// ���� �õ� ������ ����
        first.setLayout( new BorderLayout( 0, 10 ));
        first.add( p3 , "Center" );
        first.add( connection , "South" );
        
        // Window�� ���� �̺�Ʈ ó�� 
        first.addWindowListener( new WindowAdapter() { 
			public void windowClosing( WindowEvent e ) {
	    		System.exit( 0 );
			}
		});
	
        first.setSize( 300, 120 );        
        first.setLocation( 300, 300 );
        first.setVisible( true );

		// ��ư�� ActionEvent�� ��Ͻ�Ŵ
        connection.addActionListener( this );
    }// ������ end


    // �α��� �������� ������ �Ŀ� ��ȭ�� ���� �� �ִ� 
    // GUI ���� ������ �ִ� �޼ҵ�
    public void secondFrame( String id ) {
		second = new Frame( id + " : Client" );

		tf = new TextField( 15 );
		talkScreen = new TextArea( "", 30, 50, TextArea.SCROLLBARS_NONE );
		talkScreen.setEditable( false );

		second.add( "Center", talkScreen );
		second.add( "South", tf );		

		second.setSize( 320, 420 );
		second.setVisible( true );
	
		// Window�� ���� �̺�Ʈ ó�� 
		second.addWindowListener( new WindowAdapter() { 
			public void windowClosing( WindowEvent e ) {
	    		System.exit( 0 );
			}
		});	

		tf.addActionListener( this );
    }// secondFrame() end


    // Server���� ������ �õ��ϴ� �޼ҵ�
    public void connectServer( String id, String address, int port ) {
    	
		try {
			// ������ ����
			socket = new Socket( address, port );
	
			// ���� ������ ������ ��Ʈ�� ����
			dis = new DataInputStream( socket.getInputStream() );
			dos = new DataOutputStream( socket.getOutputStream() );
			dos.writeUTF( id );
	    
		} catch ( IOException e ) {
			System.out.println( "������ �����ϴ�." );
			System.exit( 0 );
		}
	
		// Ŭ���̾�Ʈ ��ü�� ������� ������Ŵ
		listen = new Thread( this );
		listen.start(); // run() �޼ҵ� ȣ��
    }// connectServer() end


    public void run() {

		// ������ ���� ���� �����͸� �ڽ��� TextArea�� ��½�Ŵ.
		try {
			while( true ) { // ServerThread.java���� 99,100����
				String id = dis.readUTF(); // ��ȭ��(talkName)�� ����
				String line = dis.readUTF(); // message�� ����

				if( id.equals( "NONE" )) {
					talkScreen.append( line + "\n" );		
				} else {
					talkScreen.append( "[" + id + "] : " + line + "\n" );
				}
			}//while end

		} catch ( IOException ex ) {
			talkScreen.append( "�������� �����͸� �д� �� ������ �߻�" );

			try {
				Thread.sleep( 1000 ); // 1�� ���� block ���·� ����
			} catch ( InterruptedException e ) {}
				System.exit( 0 );
			}
		}// catch end


    // �ؽ�Ʈ �ʵ忡�� �����͸� �Է��ϰ� ���͸� ġ�� ActionEvent ó��
    public void actionPerformed( ActionEvent av ) {
    	
		// TextField���� Event�� �߻����� ���(TextField�� �� �Է��� ����Ű)
		if( av.getSource() == tf ) {

			try {
				// ���������� ����Ÿ ����
				dos.writeUTF( "Message/" + tf.getText() );
				tf.setText( " " );
			} catch ( IOException e ) {
				System.out.println( e );
			}
	    
		// Button���� Event�� �߻����� ���(Button Ŭ��) 
		} else if( av.getSource() == connection ) { 
				String address = ipField.getText();
				String id = idField.getText();

				first.setVisible( false );
				first.dispose();
			
				secondFrame( id );
				connectServer( id, address, 6666 );
		}
    }


    public static void main( String[] args ) {
		BroadCastingClient bcc = new BroadCastingClient();
    }
}