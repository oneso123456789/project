import java.util.Vector;

class Collections05 {
	public static void main(String[] args) {

		Vector vec = new Vector();
		vec.add(new String("Apple"));	// ��ĳ����
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(new Integer(30)); // �ڽ� + ��ĳ����
//		vec.add(new Double(3.14));

		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = (String) vec.get(i); // �ٿ� ĳ����
			// temp=vec.get(i);
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}
	}
}
