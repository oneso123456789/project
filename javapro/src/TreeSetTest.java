import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	/**
	 * HashSet �׽�Ʈ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs = new TreeSet();

		if (hs.add("korea")) {
			System.out.println("ù ��° korea �߰� ����");
		} else {
			System.out.println("ù ��° korea �߰� ����");
		}
		if (hs.add("japan")) {
			System.out.println("japan �߰� ����");
		} else {
			System.out.println("japan �߰� ����");
		}
		if (hs.add("america")) {
			System.out.println("america �߰� ����");
		} else {
			System.out.println("america �߰� ����");
		}
		if (hs.add("britain")) {
			System.out.println("britain �߰� ����");
		} else {
			System.out.println("britain �߰� ����");
		}
		if (hs.add("korea")) {
			System.out.println("�� ��° korea �߰� ����");
		} else {
			System.out.println("�� ��° korea �߰� ����");
		}

		System.out.println(hs);
		
//		Iterator it = hs.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
}
