import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Collections01 {
	public static void main(String[] args) {
		// Set s = new Set();
		Set set = new HashSet(); // ��ĳ����
		// HashSet set = new HashSet();

		System.out.println("����� ����->" + set.size());
		set.add("�ϳ�");
		set.add(2);
		set.add(3.42);
		set.add("��");
		set.add("five");
		set.add(6);
		set.add(6);
		System.out.println("����� ����->" + set.size());
		System.out.println(set);

		Iterator elements = set.iterator();
		while (elements.hasNext()) {
			System.out.println("\t\t" + elements.next());
		}

		// Vector���� ����
//		Enumeration enu = set.elements();
//		while (enu.hasMoreElements()) {
//			System.out.println(enu.nextElement());
//		}

	}
}
