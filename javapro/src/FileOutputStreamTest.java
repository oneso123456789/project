import java.io.*;

public class FileOutputStreamTest {
    public static void main( String[] args ) {
    	
	try {
		// * ù° �μ��� ������ ���� ��ü���� �о 
		// ��° �μ��� ������ ���� ��ü�� �����
		// (��, ������ ������ ������)
	    // File���� �����͸� �о���� FileInputStream ��ü ����	    
	    FileInputStream fis = new FileInputStream( "read.txt" );

	    // File�� �����͸� �����ϱ� ���� FileOutputStream ��ü ����	   
	    FileOutputStream fos = new FileOutputStream( "read1.txt" );

	    int input = 0;		
		
	    // File�� ����� ��� �����͸� ��Ʈ���� ���� 
		// �о� �鿩 File�� ����
		// ������ ������ ������ �� ������ -1�� ��ȯ��.
	    while(( input = fis.read() ) != -1 ) {
			System.out.print( (char)input ); //ȭ�鿡 ��� �κ�
			fos.write( input ); // �ٸ� ���Ͽ� ���� �κ�
	    }

	    // FileInputStream, FileOutputStream�� ����	   
	    fos.close();
	    fis.close();
	    
	} catch( Exception e ) {
	    System.out.println( e.getMessage() );	    
	}
    }//main() end
}
