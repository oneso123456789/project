
public class Oper03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ������(>, >=, <, <=, ==, !=)

		int a = 10, b = 4;
		boolean test;

		test = a > b;  // true
		System.out.println(a + ">" + b + "=" + test);

		test = a < b;  // false
		System.out.println(a + "<" + b + "=" + test);

		System.out.println(a+b > a-b);
		
		if(a > b){
			System.out.println(a+"�� "+b+"���� ũ��");
		}		
		
	}

}
