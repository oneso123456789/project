import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList();
		// ArrayList list = new ArrayList();
		// add(Object ob)
		list.add(new String("�ϳ�")); // ��ĳ����
		list.add(2);
		list.add(3.42);
		list.add("��");
		list.add("five");
		// list.add(6);
		System.out.println(list);
		System.out.println(list.get(1));
		String str = (String) list.get(0);// �ٿ� ĳ����

		for (int i = 0; i < list.size(); i++) {
			// System.out.println( i + " ��° ��Ҵ� " + list.get(i));
			Object s = list.get(i);
			// String s =(String)(list.get(i));
			System.out.println(s);
		}

		// �ݺ���
		Iterator elements = list.iterator();
		while (elements.hasNext()) {
			System.out.println("\t\t" + elements.next());
		}

	}
}
