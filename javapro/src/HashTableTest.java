import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

class HashTableTest {
	public static void main(String[] args) {
//		Map ht = new Hashtable();//��ĳ����
		Hashtable ht = new Hashtable();

		// �ؽ� ���̺� Ű/�����͸� �Է��Ѵ�.
		ht.put(new String("����"), "StrawBerry");
		ht.put("���", "Apple");
		ht.put("����", "Grapes");
//		ht.put(30,30);

		// �ؽ� ���̺��� ���� Ű�� �̿��Ͽ� ��´�.
		// Object obj = ht.get("����");
		String Val = (String) ht.get("����");
		if (Val != null) {
			System.out.println("����-> " + Val);
		}

		Enumeration Enum = ht.keys();
		while (Enum.hasMoreElements()) {
			Object k = Enum.nextElement();
			Object v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}
