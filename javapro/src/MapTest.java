import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		// HashMap ��ü ����
		// Map hm = new HashMap(); ��ĳ����
		HashMap hm = new HashMap();
		
		// Ű�� ������ ���� ����
		hm.put("woman", "gemini");
		hm.put("man", "johnharu");
		hm.put("age", new Integer(10));
		hm.put("city", "seoul");

		// HashMap�� �ִ� ��ü���� ���
		System.out.println(hm);

		// Ű ���� ���
		System.out.println(hm.keySet());

		// Ű�� �̿��� �ش� �����͸� ���
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
	}
}
