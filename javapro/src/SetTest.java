// HashSet�� Date Ŭ������ �ִ� ��Ű���� ����Ʈ
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {

		// HashSet Ŭ������ ��ü ����
		Set hs = new HashSet();
		// HashSet hs = new HashSet();

		// hs ��ü�� ������ ��ü ����
		hs.add(new String("gemini"));
		hs.add("johnharu");
		// Date d=new Date();
		// hs.add( d );
		hs.add(new Date());

		// hs ��ü�� �����ϰ� �ִ� ������ ��ü ���
		System.out.println("hs�� ���� : " + hs);

		// "johnharau" ������ ��ü�� hs ��ü���� ����
		hs.remove("johnharu");
		System.out.println("hs�� ���� : " + hs);

		// hs ��ü�� �ִ� ������ ��ü�� ������ ���
		System.out.println("hs�� ������ ����" + hs.size());
	
	
	}
}