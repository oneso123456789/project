import java.util.ArrayList;
import java.util.List;
//import java.util.List;

class Collections02 {

	public static void main(String[] args) {
//		List li = new List();
		List list = new ArrayList();// ��ĳ����
//		ArrayList list = new ArrayList();
		
		// add(Object ob)
		list.add(new String("�ϳ�"));
		list.add(new Integer(2));
		list.add(2);
		list.add(new Double(3.42));
		list.add("��");
		list.add("five");
		list.add(6);

		System.out.println(list);

	}
}
