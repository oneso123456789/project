
public class Oper06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 10;
		System.out.println(++a);	// 11
		System.out.println(a);		// 11

		System.out.println(b++);	// 10	
		System.out.println(b);		// 11

		a = b = 10;
		int c;

		c = ++a;
		System.out.println(c + "=>" + a);

		c = b++;
		System.out.println(c + "=>" + b);

	}

}
