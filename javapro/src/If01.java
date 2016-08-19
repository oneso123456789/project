
public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 5;

		if (a > b) {	// true
			System.out.println("출력1");
			System.out.println("출력2");
		}

		if (true) {
			System.out.println("출력3");
		}

		if (a < b)		// false
			System.out.println("출력4");
		System.out.println("무조건 출력");

	}

}
