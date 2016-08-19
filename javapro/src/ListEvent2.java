import java.awt.*;
import java.awt.event.*;

// List�� Item�� ����(click)�Ҷ� ItemEvent �߻���. 
// List�� Item�� double click�Ҷ��� ActionEvent �߻���.
public class ListEvent2 implements ItemListener {
    private Frame f;
    private List list;
    private TextField tf;

    public ListEvent2() {	
	f = new Frame( "List Event" );
	f.addWindowListener( new WindowAdapter() {
	    public void windowClosing( WindowEvent e ) {
		System.exit( 0 );
	    }
	});
	tf = new TextField( 20 );
	// List ��ü ���� �� Item ���
	list = new List();
	list.add( "gemini" );
	list.add( "johnharu" );
	list.add( "gracedew" );	
	
	f.add( list, "Center" );
	f.add( tf, "South" );
	f.setSize( 300, 200 );
	f.setVisible( true );

	// List ��ü�� ItemListener�� ��Ͻ�Ŵ
	list.addItemListener( this );
//	list.addActionListener( this );

    }//������ end

    // Item�� ���°� ��ȭ���� ��
    public void itemStateChanged( ItemEvent ie ) {
		// ���� ���õ� Item�� ���� �޾� ������ ����
		String item = list.getSelectedItem();
		// TextField�� ���� ���ý�Ŵ
		tf.setText( item );	
    }

	public static void main( String[] args ) {
		ListEvent2 le = new ListEvent2();
    }
}