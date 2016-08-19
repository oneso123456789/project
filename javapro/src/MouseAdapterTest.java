import java.awt.*;
import java.awt.event.*;

public class MouseAdapterTest extends MouseAdapter {
    private Frame f;
    private Button button;

    public MouseAdapterTest() {

	f = new Frame( "MouseAdapter Test" );
	f.addWindowListener( new WindowAdapter() {
	    public void windowClosing( WindowEvent e ) { 
		System.exit( 0 );
	    }
	});

	button = new Button( "Ȯ��" );	

	f.add( button, "Center" );

	f.setSize( 200, 100 );
	f.setVisible( true );

	// ��ư ��ü�� EventListener�� ��� ��Ŵ
	button.addMouseListener( this );
    }//������ end

    // ���콺�� �̿��� ��ư�� ������ �� ȣ��Ǵ� �޼ҵ�
    public void mousePressed( MouseEvent me ) {
		System.out.println( button.getLabel() + 
								" ��ư�� ���� ����" );
    }

    public static void main( String[] args ) {
		MouseAdapterTest mat = new MouseAdapterTest();
    }
}
