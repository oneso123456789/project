import java.awt.*;
import java.awt.event.*;

public class DialogTest implements ActionListener {
    private Frame f;
    private Button exit;

    private Dialog dialog;

    public DialogTest() {
	
	f = new Frame( "Dialog Test" );
	
	f.addWindowListener( new WindowAdapter() {
	    public void windowClosing( WindowEvent e ) {
			System.exit( 0 );
 	    }
	});	
		
	exit = new Button( "����" );	

	f.setLayout( new FlowLayout() );
	f.add( exit );
		
	f.setSize( 400, 200 );
	f.setVisible( true );

	exit.addActionListener( this );

    }// ������ end


    // ��ư�� �������� ��� ó���ϴ� �޼ҵ�
    public void actionPerformed( ActionEvent ae ) {
		// modal Dialog ��ü ����
		dialog = new Dialog( f, "Dialog �Դϴ�.", true );

		//dialog ���� ó�� �κ�
		dialog.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent e ) {
				dialog.dispose();
//				System.exit( 0 );
 			}
		});
		
		// dialog�� Label�� ����
	dialog.setLayout( new FlowLayout() );
	dialog.add( new Label( "Dialog �Դϴ�", Label.CENTER ));
		
		// Dialog�� size�� �����ϰ�, ȭ�鿡 ���
		dialog.setSize( 300, 100 );
		dialog.setVisible( true );
    }

    public static void main( String[] args ) {
		DialogTest dt = new DialogTest();
    }
}