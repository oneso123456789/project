import java.awt.*;
import java.awt.event.*;

public class GridLayoutTest1 {
    private Frame f;
    private Button b1, b2, b3, b4;

    public GridLayoutTest1() {
	// ������ ��ü ����
	f = new Frame( "GridLayout" );

	// ��ư ����
	b1 = new Button( "Button1" );
	b2 = new Button( "Button2" );
	b3 = new Button( "Button3" );
	b4 = new Button( "Button4" );

	// ������ ���� �̺�Ʈ
	f.addWindowListener( new WindowAdapter() {
	    public void windowClosing( WindowEvent e ) {
		System.exit( 0 );
	    } 
	});

	// Panel ����
	Panel p = new Panel();
		
	// Panel�� LayoutManager�� ������ �� ��ư�� ����
	p.setLayout( new GridLayout( 2, 2, 10, 10 ));
	p.add( b1 );
	p.add( b2 );
	p.add( b3 );
	p.add( b4 );

	// Panel�� Frame�� �߾ӿ� ����
	f.add( p, "Center" );
		
	// �������� ũ�⸦ ��������, ȭ�鿡 ���
	f.setSize( 300, 200 );
	f.setVisible( true );
	}

	public static void main( String[] args ) {
		GridLayoutTest1 gt = new GridLayoutTest1();
	}
}
