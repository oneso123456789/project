import java.awt.*;
import java.awt.event.*;

public class ScrollbarTest {
    Frame f;
    Scrollbar hbar1, hbar2, hbar3, vbar1, vbar2;

    public ScrollbarTest() {

	// ������ ������ ������ ���� �̺�Ʈ
	f = new Frame( "Scrollbar" );

	f.addWindowListener( new WindowAdapter() {
		public void windowClosing( WindowEvent e ) {
			System.exit( 0 );
		} 
     });

// Scrollbar ( ����(����0,����1),
		    // ��ũ�ѹ��� �ʱ� ��ġ,
		    // ��ũ�ѹ��� ����,
		    // ��ũ�ѹٰ� �����ϼ� �ִ� �ּҰ�,
		    // ��ũ�ѹٰ� �����ϼ� �ִ� �ִ밪)
hbar1 = new Scrollbar( 0, 50, 100, 0, 300 );
hbar2 = new Scrollbar( Scrollbar.HORIZONTAL, 0, 30, 0, 300 );
hbar3 = new Scrollbar( Scrollbar.HORIZONTAL, 0, 30, 0, 300 );
vbar1 = new Scrollbar( Scrollbar.VERTICAL, 0, 100, 0, 250 );
vbar2 = new Scrollbar( Scrollbar.VERTICAL, 0, 20, 0, 250 );

	// ��, ��, ��, �Ͽ� ��ũ�� �ٸ� ����
	f.add( hbar1, "North" );
	f.add( hbar2, "South" );
	f.add( hbar3, "Center" );
	f.add( vbar1, "East" );
	f.add( vbar2, "West" );	

	f.setSize( 500, 300 );
	f.setVisible( true );
    }//������ end
	
    public static void main( String[] args ) {
		ScrollbarTest st = new ScrollbarTest();
    }
}
