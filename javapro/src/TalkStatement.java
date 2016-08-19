import java.io.*;

public class TalkStatement {

    public static String readString() {
     	
        // Ű����� �Է¹޴� byte stream�� character stream���� 
		// ��ȯ��Ű�� InputStreamReader ��ü ����       
        InputStreamReader isr = new InputStreamReader( System.in );
        
        // buffer�� ����ϱ� ���� BufferedReader ��ü ����
        BufferedReader br = new BufferedReader( isr );

        // �Է¹��� �����͸� �����ϱ� ���� ���� ����
        String line = null;

        // �� ������ �о� ����
        try {
			line = br.readLine();	
			
        } catch ( IOException io ) {
			System.out.println( io );
/*        } finally{
			if (br != null) 
                     try {
                             br.close(); 
                     } catch(IOException iex) {}*/
		}

        return line;
    }// readString() end	
}

