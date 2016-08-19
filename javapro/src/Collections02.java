import java.util.ArrayList;
import java.util.List;
//import java.util.List;

class Collections02 {

	public static void main(String[] args) {
//		List li = new List();
		List list = new ArrayList();// 업캐스팅
//		ArrayList list = new ArrayList();
		
		// add(Object ob)
		list.add(new String("하나"));
		list.add(new Integer(2));
		list.add(2);
		list.add(new Double(3.42));
		list.add("넷");
		list.add("five");
		list.add(6);

		System.out.println(list);

	}
}
