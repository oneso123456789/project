import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList();
		// ArrayList list = new ArrayList();
		// add(Object ob)
		list.add(new String("하나")); // 업캐스팅
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		// list.add(6);
		System.out.println(list);
		System.out.println(list.get(1));
		String str = (String) list.get(0);// 다운 캐스팅

		for (int i = 0; i < list.size(); i++) {
			// System.out.println( i + " 번째 요소는 " + list.get(i));
			Object s = list.get(i);
			// String s =(String)(list.get(i));
			System.out.println(s);
		}

		// 반복자
		Iterator elements = list.iterator();
		while (elements.hasNext()) {
			System.out.println("\t\t" + elements.next());
		}

	}
}
