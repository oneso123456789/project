import java.util.*;

class HashTableTest02 {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("���", "Apple");
		ht.put("����", "StrawBerry");
		ht.put("����", "Grapes");
//		ht.put(30,30);
		
		// �ؽ� ���̺��� ���� Ű�� �̿��Ͽ� ��´�.
		String Val = ht.get("����");
		if (Val != null) {
			System.out.println("����-> " + Val);
		}
		
		
		Enumeration<String> Enum = ht.keys(); // �ؽ� ���̺��� Ű ��ҵ鿡 ���� Enumeration
										// ��ü ��ȯ
		while (Enum.hasMoreElements()) {
			String k = Enum.nextElement();
			String v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}