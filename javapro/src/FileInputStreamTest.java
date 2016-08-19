import java.io.*;

public class FileInputStreamTest {
    public static void main( String[] args ) {
    	
	// �Է��� �޾Ƶ��̴� ���� ����
	int inputValue = 0;
	
	// FileInputStream ��ü ����
	FileInputStream file = null;
		
	try {
	    // "read.txt"�� InputStream ����
	    file = new FileInputStream( "d:/read.txt" );
			
	    // file�� ���� ���� ������ �����͸� �о� ����
		// read() �޼ҵ�� File���� �� byte�� �����͸� �о��.
		// �о�� �����͸� int�� ��ȯ�ؼ� ����,������ ���� 
		// ������ -1�� ��ȯ��.
	    while(( inputValue = file.read() ) != -1 ) {
			System.out.print(( char )inputValue );
	    }
	} catch ( Exception e ) {
	    System.out.println( e.toString() );
	}

	// stream�� ������ file�� ����
	try {
	    file.close();
	} catch ( IOException io ) {
	    System.out.println( io.toString() );
	}
    }//main() end
}
