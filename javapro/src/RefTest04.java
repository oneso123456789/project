import java.util.Vector;

public class RefTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		// add(Object ob)
		// Object ob = new Integer(10);
		v.add(new Integer(10));    //�ڽ� + ��ĳ����
		v.add(new Double(3.14));   //�ڽ� + ��ĳ����
		v.add(new Character('j')); //�ڽ� + ��ĳ����
		v.add(new Boolean(true));  //�ڽ� + ��ĳ����
		v.add(new String("java")); // ��ĳ����
		System.out.println(v);
		System.out.println(v.get(2));
		
		Object ob = v.get(4);
		System.out.println(ob);
		
		// Object ob = v.get(4);
		// String str = (String) ob;
		String str = (String)v.get(4);// �ٿ� ĳ����
		
		Object ob1 = v.get(0);
		System.out.println(ob1);
		
		Integer it = (Integer)v.get(0);// �ٿ� ĳ����
		int n = it.intValue(); // ��ڽ�
		System.out.println(n);
		
		int n1 = ((Integer)v.get(0)).intValue();
		
	}

}
