import java.awt.*;
import java.awt.event.*;

public class WindowEventTest implements WindowListener {
    private Frame f;
	
    public WindowEventTest() {
	f = new Frame( "WindowEvent Test" );

	f.setSize( 400, 300 );
	f.setVisible( true );

	f.addWindowListener( this );
    }// ������ end

    // �����찡 Ȱ��ȭ �Ǿ��� �� ȣ��Ǵ� �޼ҵ�
    public void windowActivated( WindowEvent we ) {
		System.out.println( "�����찡 Ȱ��ȭ �Ǿ����ϴ�" );
    }

    // �����찡 ���� �Ŀ� ȣ��Ǵ� �޼ҵ�
    public void windowClosed( WindowEvent we ) {
		System.out.println( "�����찡 �������ϴ�" );
    }

    // �������� ���� �������� ������ �� ȣ��Ǵ� �޼ҵ�
    public void windowClosing( WindowEvent we ) {
		System.out.println( "�����찡 ������ �մϴ�" );
		System.exit( 0 );
    }

    // �����찡 ��Ȱ��ȭ�Ǿ��� �� ȣ��Ǵ� �޼ҵ�
    public void windowDeactivated( WindowEvent we ) {
		System.out.println("�����찡 ��Ȱ��ȭ �ǿ����ϴ�.");
    }

    // �����찡 ������ȭ �Ǿ��ٰ� �ٽ� Ȱ��ȭ�Ǿ��� �� ȣ��
	// �Ǵ� �޼ҵ�
    public void windowDeiconified( WindowEvent we ) {
		System.out.println("�����찡 �۾� ǥ���ٿ��� �ٽ� ��Ÿ�����ϴ�" );
    }

    // �����찡 ������ȭ�Ǿ��� �� ȣ��Ǵ� �޼ҵ�
    public void windowIconified( WindowEvent we ) {
		System.out.println("�����찡 �۾� ǥ���ٿ� �������ϴ�");
    }

    // �����찡 ó�� ����� �� ȣ��Ǵ� �޼ҵ�
    public void windowOpened( WindowEvent we ) {
		System.out.println("�����찡 ȭ�鿡 ó�� ��Ÿ�����ϴ�");
    }

    public static void main( String[] args ) {
		WindowEventTest wet = new WindowEventTest();
    }
}
