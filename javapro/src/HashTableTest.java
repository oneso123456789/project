import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

class HashTableTest {
	public static void main(String[] args) {
//		Map ht = new Hashtable();//업캐스팅
		Hashtable ht = new Hashtable();

		// 해쉬 테이블에 키/데이터를 입력한다.
		ht.put(new String("딸기"), "StrawBerry");
		ht.put("사과", "Apple");
		ht.put("포도", "Grapes");
//		ht.put(30,30);

		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
		// Object obj = ht.get("포도");
		String Val = (String) ht.get("포도");
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}

		Enumeration Enum = ht.keys();
		while (Enum.hasMoreElements()) {
			Object k = Enum.nextElement();
			Object v = ht.get(k);
			System.out.println(k + " : " + v);
		}
	}
}
