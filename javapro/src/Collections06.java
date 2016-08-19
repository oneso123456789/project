import java.util.Vector;

class Collections06 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();

//		Vector<Integer> v = new Vector<Integer>();
		
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
//		vec.add(30);

		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = vec.get(i);
			System.out.println(temp.toUpperCase());
		}
	}
}
