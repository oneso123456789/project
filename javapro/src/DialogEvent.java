import java.awt.*;
import java.awt.event.*;

public class DialogEvent implements ActionListener {
    // ��� ���� ����
    private Frame f;
    private TextField nameField;
    private Button ok, cancel;
    private List inputList;

    // Dialog�� ���� ��� ����
    private Dialog dialog;
    private Button dialOk, dialCancel;
    private TextField dialNameField;
	
    // GUI �Է� ���� ����
    public DialogEvent() {
	// ������ ����
	f = new Frame( "Input Name List" );

	// �������� ���� �̺�Ʈ
	f.addWindowListener( new WindowAdapter() {
	    public void windowClosing( WindowEvent e ) {
		System.exit( 0 );
	    }
	});

	// TextField ��ü ����
	nameField = new TextField( 15 );

	// Button ��ü ����
	ok = new Button( "Ȯ��" );
	cancel = new Button( "���" );

	// �Էµ� �����͸� ��Ÿ���� List ��ü ����
	inputList = new List(10);

	// Label�� TextField�� ���̴� �г�
	Panel p1 = new Panel();
	p1.add( new Label( "�̸�", Label.RIGHT ));
	p1.add( nameField );

	// ��ư �� ���� ���̴� �г�
	Panel p2 = new Panel();
	p2.add( ok );
	p2.add( cancel );

	// Lable�� TextField�� ���� Panel�� 
	// ��ư �� ���� ���̰� �ִ� Panel�� �ϳ��� ���� Panel
	Panel p3 = new Panel();
	p3.setLayout( new GridLayout( 2, 1, 0, 10 ));
	p3.add( p1 );
	p3.add( p2 );

	// Label�� �Էµ� ����� ��Ÿ���� List�� ���� Panel
	Panel p4 = new Panel();
	p4.setLayout( new BorderLayout() );
	p4.add( new Label( "�Էµ� ����Ÿ", Label.CENTER ), "North" );
	p4.add( inputList, "Center" );

	// �����ӿ� Panel�� �ٿ��� ȭ�� ����
	f.setLayout( new FlowLayout() );
	f.add( p3 );
	f.add( p4 );

	// �������� ȭ�� ������ ���
	f.setSize( 400, 230 );
	f.setVisible( true );

	registrationEvent();
	}//������ end

	// �� ������Ʈ�� Event Listener�� ���
	public void registrationEvent() {
		nameField.addActionListener( this );
		ok.addActionListener( this );
		cancel.addActionListener( this );
    }

    // Evnet�� �߻����� ��� ó���� ���ִ� Handler Method
    public void actionPerformed( ActionEvent ae ) {
        // �̺�Ʈ�� �߻���Ų ������Ʈ�� ������ ����
	Object o = ae.getSource();
//	String s = (String)ae.getSource(); //�ٿ�ĳ����
	
	// TextFied�� �Էµ� �����͸� ����
	String name = nameField.getText();

	// � ������Ʈ�� �̺�Ʈ�� �߻����״��� �Ǵ��ؼ�
	// �˸��� ��ɹ��� �����Ѵ�. 
	if( o == nameField ) {
	    // ������ �ԷµǸ�
        if( name.equals( "" )) {
	        // Dialog â�� ����
	        makeDialog();
	    } else {
	        addItemList( name );
	    }
	} else if( o == ok ) {
	    // ������ �ԷµǸ�
        if( name.equals( "" )) {
	        // Dialog â�� ����
	        makeDialog();
	    } else {
	        addItemList( name );
	    }
	} else if( o == cancel ) {
	    nameField.setText( "" );
		
	// Dialog�� �ִ� ok ��ư�� ��������
	} else if( o == dialOk ) {
	    String dialName = dialNameField.getText();
	    // Dialog������ ������ �ԷµǸ�
	    if( dialName.equals( "" ) ) {
		// TextField�� focus�� ����.
		dialNameField.requestFocus();
	    } else {
		// ������ �Էµ��� �ʾ�����, 
		// Dialog�� ȭ�鿡�� ������� �ϰ�
		dialog.setVisible( false );
//		dialog.dispose();
		// List�� name�� �߰�
		addItemList( dialName );
	    }
        // Dialog�� cancel ��ư�� ��������
	// Name Field�� ������ �����. 
	} else if( o == dialCancel ) {
	    dialNameField.setText( "" );
	} else if ( o == dialNameField ){
		String dialName = dialNameField.getText();		
		addItemList( dialName );
		dialog.setVisible( false );
	}
    }

    // Dialog ���� ����� method
    public void makeDialog() {
	dialog = new Dialog( f, "Input Name", true );
	dialog.addWindowListener( new WindowAdapter() {
	    public void windowClosing( WindowEvent e ) {
//		System.exit( 0 );
		dialog.dispose();
	    }
	});

	dialNameField = new TextField( 15 );
	dialOk = new Button( "OK" );
	dialCancel = new Button( "CANCEL" );

	dialOk.addActionListener( this );
	dialCancel.addActionListener( this );
	dialNameField.addActionListener( this );

	Panel dp1 = new Panel();
	dp1.add( dialOk );
	dp1.add( dialCancel );

	Panel dp2 = new Panel();
	dp2.add( new Label( "�̸�", Label.RIGHT ));
	dp2.add( dialNameField );

	Panel dp3 = new Panel();
	dp3.setLayout( new GridLayout( 2, 1, 0, 10 ));
	dp3.add( dp2 );
	dp3.add( dp1 );
		
	dialog.add( new Label( "������ �Է��Ͻ� �� �����ϴ�. �̸��� �Է��ϼ���", Label.CENTER ), "North" );
	dialog.add( dp3, "Center" );
	dialog.setSize( 400, 150 );
	dialog.setVisible( true );
    }

    // TextField�� ok ��ư�� �������� ��� List�� �����͸� �߰��ϰ�, 
    // TextField�� ������ �����ִ� method
    public void addItemList( String inputName ) {
		inputList.add( inputName );
		nameField.setText( "" );
    }

    public static void main( String[] args ) {
		DialogEvent mc = new DialogEvent();
    }
}		