import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;
import java.net.*;

public class TalkClient implements ActionListener, Runnable {	
   
    Frame first, second;
	TextField ipField;
    TextField idField;
	Button connection;
    TextArea view;
    TextField message;
	
	
    // ������ ������ ���� Ŭ���� ����
    Socket clientSocket;
    DataInputStream dis;
    DataOutputStream dos;	
   
//    String name = "gemini"; //��ȭ��

	// ������ 
    public TalkClient() {	
       
	first = new Frame( "���� ȭ��" );
	connection = new Button( "Connect" );
		
	// Server�� IP �ּҿ� id�� �޾� ���̴� TextField ��ü ����
	ipField = new TextField( 15 );
	idField = new TextField( 15 );
	
	Panel p1 = new Panel();
	p1.setLayout( new GridLayout( 2, 1, 0, 10 ));
	p1.add( new Label( "Server IP�ּ�", Label.CENTER ));
	p1.add( new Label( "��ȭ��(ID)", Label.CENTER ));
	
	Panel p2 = new Panel();
	p2.setLayout( new GridLayout( 2, 1, 0, 10 ));
	p2.add( ipField );
	p2.add( idField );	
	
	Panel p3 = new Panel();
	p3.add( p1 );
	p3.add( p2 );

	// ���� �õ� ������ ����( BorderLayout(int hgap, int vgap) )
	first.setLayout( new BorderLayout( 0, 10 ));
	first.add( p3, "Center" );
	first.add( connection, "South" );
	
	// ������ ���� �̺�Ʈ ó��
	first.addWindowListener( new WindowAdapter() {
	    public void windowClosing( WindowEvent e ) {
	    	System.exit( 0 );
	    }
	});  
	
	first.setSize( 300, 150 );	
	first.setLocation( 300, 300 );
	first.setVisible( true );
		
	// ��ư�� ActionEvent�� ��Ͻ�Ŵ
	connection.addActionListener( this );
    }//������ end


    // �ι�° ������ �κ�
    public void SecondFrame() throws Exception {
    	
	second = new Frame( "Client Chatting" );
	view = new TextArea( " ", 30, 50, TextArea.SCROLLBARS_NONE);
	view.setEditable( false );
	message = new TextField( 27 );

	Panel p = new Panel();
	p.add( new Label( "Message", Label.LEFT ));
	p.add( message );
		
	second.add( view, "Center" );
	second.add( p, "South" );		
	
	second.addWindowListener( new WindowAdapter() { 
	    public void windowClosing( WindowEvent e ) {
	    	System.exit( 0 );
	    }
	});	
			
	second.setSize( 300, 400 );	
	second.setLocation( 300, 300 );
	second.setVisible( true );

	message.addActionListener( this );

    }// SecondFrame() end

	 // Server���� ������ �õ��ϴ� �޼ҵ�
    public void connectServer( String id, String address ) {
    	
		try {
			// ������ ����
			clientSocket = new Socket( address, 3333 );
	
			// ���� ������ ������ ��Ʈ�� ����
			dis = new DataInputStream( clientSocket.getInputStream() );
			dos = new DataOutputStream( clientSocket.getOutputStream() );
			dos.writeUTF( idField.getText() );
	    
		} catch ( IOException e ) {
			System.out.println( "������ �����ϴ�." );
			System.exit( 0 );
		}
	
		// Ŭ���̾�Ʈ ��ü�� ������� ������Ŵ
		Thread t = new Thread( this );
		t.start(); // run() �޼ҵ� ȣ��
    }// connectServer() end


    // ������ ���� �� ���� ��ü�� �����ϴ� �޼ҵ�
	  public void run(){
		
		try {
			// �־��� IP�� port�� �̿��� ���� ��ü ����
//			clientSocket = new Socket( ipField.getText(), 3333 );

			System.out.println("ip�ּ� :"+ ipField.getText());
			System.out.println("ID :"+ idField.getText());
			view.append( "Server Connection Success \n" );
			
			// ��Ʈ�� ��ü ����
//			dos = new DataOutputStream(clientSocket.getOutputStream());
//			dis = new DataInputStream(clientSocket.getInputStream() );

			// ��Ʈ�� ��ü�� �������ڸ��� �������� ID�� ������
//			dos.writeUTF( idField.getText() );

			} catch( Exception ie ) {
				System.out.println("���� ���� ����");
			}//catch end
		
			// ���� ������ �����ϸ鼭 ������ ������ �޽����� ���
		while( true ) {

			try {
				String msg = dis.readUTF().trim();
				String msgPlus = "";
				
				// ���̵�� ��ȭ ������ �и��ϱ� ���� 
				// StringTokenizer Ŭ������ �̿��� "/"�� �������� �и�
				StringTokenizer st = new StringTokenizer( msg, "/" );
				view.append( "[" + st.nextToken() + "] : ");
				while(st.hasMoreTokens()){
					msgPlus += st.nextToken();
				}
					view.append(msgPlus + "\n");
			} catch( Exception e ) {
				System.out.println( e );
			}//catch end
      }//while end
    }//connect() end	
 

    // �ؽ�Ʈ �ʵ忡 �����͸� �Է��ϰ� ���͸� ġ�� �̺�Ʈ ó��
    public void actionPerformed( ActionEvent ae ) {

		if( ipField.getText().equals("") && 
			idField.getText().equals("") ) {
			System.exit(0);		

    	}else if(ae.getSource() == connection ){

			try {
				// ������ ���� �õ�
//				clientSocket = new Socket( ipField.getText(), 3333 );
				
//				dis = new DataInputStream(clientSocket.getInputStream() );
//				dos = new DataOutputStream(clientSocket.getOutputStream());

				// ������ ������ Ŭ���̾�Ʈ�� ��ȭ���� ������ ����
//				dos.writeUTF( idField.getText() );				
				
				// ���� �õ� �������� ȭ�鿡�� ������� ��
				first.setVisible( false );
				
				// ���� �õ� �������� �ڿ��� �ݳ�
				first.dispose(); 
				
				// �� ��° �������� ȭ�鿡 ��½�Ŵ
				SecondFrame();
				connectServer( idField.getText(), ipField.getText());
				

			}catch( Exception e ) {
//				System.out.println( "���� ���� ����" );
				System.out.println( "�ι�° �������� ��Ÿ���� �ʽ��ϴ�.");
			}

		}else if(ae.getSource() == message ){

		try {
			// ������ �����͸� �����ϴ� �κ� 
			// ������ ���� ������ ���̵�/������ ����
			dos.writeUTF( idField.getText() + "/" + message.getText() );

			view.append("[" + idField.getText() + "] : "+message.getText() + "\n" );
			message.setText( "" );
	    
		} catch( Exception e ) {
			System.out.println( "������ ���� ����" );
		}//catch end

	   }//if end

    }//actionPerformed() end

	
    public static void main( String[] args ) {
		TalkClient tc = new TalkClient();		
    }
}