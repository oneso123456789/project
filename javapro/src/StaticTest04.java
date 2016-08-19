class StaticTest4 {
	private static int a = 10;
	private int b = 20;

	public static void printA() {
		System.out.println(a);
		System.out.println(b); // ������ ���� �߻�
	}
	public void printB() {
		System.out.println(b);
	}
}

public class StaticTest04 {
	public static void main(String[] args) {
		StaticTest4.printA();
		StaticTest4 s1 = new StaticTest4();
		StaticTest4 s2 = new StaticTest4();
		s1.printB();
		s2.printB();
	}
}