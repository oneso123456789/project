import java.awt.*;
import java.awt.event.*;

public class MouseMotionAdapterTest extends MouseMotionAdapter {
    private Frame f;
    private TextField xField;
    private TextField yField;
    private TextField state;
	
    // ȭ�� ����
    public MouseMotionAdapterTest() {
	f = new Frame( "WindowEvent Test" );
	f.addWindowListener( new WindowAdapter() {
	    public void windowClosing( WindowEvent we ) {
		System.exit( 0 );
	    }
	});	

	xField = new TextField( 10 );
	yField = new TextField( 10 );
	state = new TextField( 20 );

	Panel p = new Panel();
	p.add( state );
	p.add( new Label( "X��ǥ", Label.RIGHT ));
	p.add( xField );
	p.add( new Label( "Y��ǥ", Label.RIGHT ));
	p.add( yField );

	f.add( p, "South" );
		
	f.setSize( 600, 400 );
	f.setVisible( true );

	// Frame ��ü�� MouseMotionListener�� ���
	f.addMouseMotionListener( this );

    }//������ end

    // ���콺�� �巡���� �� ȣ��Ǵ� �޼ҵ�
    public void mouseDragged( MouseEvent me ) {
		state.setText( "Mouse Dragged" );

		// ���콺�� x, y ��ǥ�� �о��
		xField.setText( String.valueOf( me.getX()) );
		yField.setText( String.valueOf( me.getY()) );
    }

    // ���콺�� ������ �� ȣ��Ǵ� �޼ҵ�
    public void mouseMoved( MouseEvent me ) {
		state.setText( "Mouse Moved" );

		xField.setText( String.valueOf( me.getX()) );
		yField.setText( String.valueOf( me.getY()) );
    }

    public static void main( String[] args ) {
	MouseMotionAdapterTest mmt = new MouseMotionAdapterTest();
    }
}
