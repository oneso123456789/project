import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventTest implements MouseListener {
    private Frame f;
    private Button button;

    public MouseEventTest() {
	f = new Frame( "Mouse Event" );
	f.addWindowListener( new WindowAdapter() {
	    public void windowClosing( WindowEvent e ) { 
	        System.exit( 0 );
	    }
	});

	button = new Button( "Button" );	

	f.add( button, "Center" );
	f.setSize( 200, 100 );
	f.setVisible( true );

	// ��ư ��ü�� EventListener�� ��Ͻ�Ŵ
	button.addMouseListener( this );
    }//������ end

    // ���콺�� Ŭ���� ������ ȣ��Ǵ� �޼ҵ�
    public void mouseClicked( MouseEvent me ) {
		System.out.println( "Mouse Cliceked" );
    }

    // ���콺�� ������Ʈ ������ ��� ���� �� ȣ��Ǵ� �޼ҵ�
    public void mouseEntered( MouseEvent me ) {
		System.out.println( "Mouse Entered" );
    }

    // ���콺�� ������Ʈ ������ ������ �� ȣ��Ǵ� �޼ҵ�
    public void mouseExited( MouseEvent me ) {
		System.out.println( "Mouse Exited" );
    }

    // ���콺�� ������Ʈ�� ������ �� ȣ��Ǵ� �޼ҵ�
    public void mousePressed( MouseEvent me ) {
		System.out.println( "Mouse Pressed" );
    }

    // ���콺�� ������Ʈ�� ���� �Ŀ� ������ �� ȣ��Ǵ� �޼ҵ�
    public void mouseReleased( MouseEvent me ) {
		System.out.println( "Mouse Released" );
    }

    public static void main( String[] args ) {
		MouseEventTest met = new MouseEventTest();
    }
}
