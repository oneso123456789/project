import java.util.StringTokenizer;

public class StringTokenizerTest1 {

	public static void main(String[] args) {
	
		String source1="111-111|������|��õ��|��赿";
		StringTokenizer st1=
				new StringTokenizer(source1,"|");
		
		String zip=st1.nextToken();	// 111-111
		String dou=st1.nextToken(); // ������
		String si=st1.nextToken();  // ��õ��
		String dong=st1.nextToken();// ��赿

		System.out.println("�����ȣ:" +zip);
		System.out.println("��:" +dou);
		System.out.println("��:" +si);
		System.out.println("��:" +dong);
	}

}
