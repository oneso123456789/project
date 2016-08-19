import java.util.Vector;

public class RefTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		// add(Object ob)
		// Object ob = new Integer(10);
		v.add(new Integer(10));    //박싱 + 업캐스팅
		v.add(new Double(3.14));   //박싱 + 업캐스팅
		v.add(new Character('j')); //박싱 + 업캐스팅
		v.add(new Boolean(true));  //박싱 + 업캐스팅
		v.add(new String("java")); // 업캐스팅
		System.out.println(v);
		System.out.println(v.get(2));
		
		Object ob = v.get(4);
		System.out.println(ob);
		
		// Object ob = v.get(4);
		// String str = (String) ob;
		String str = (String)v.get(4);// 다운 캐스팅
		
		Object ob1 = v.get(0);
		System.out.println(ob1);
		
		Integer it = (Integer)v.get(0);// 다운 캐스팅
		int n = it.intValue(); // 언박싱
		System.out.println(n);
		
		int n1 = ((Integer)v.get(0)).intValue();
		
	}

}
