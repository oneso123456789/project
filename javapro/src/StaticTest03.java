class StaticTest3 {
	private static int a = 10;
	private int b = 20;

	public static void printA() { // ���� �޼��忡���� this�� ������� ����
		System.out.println(a);
//		System.out.println(this.a); //������ ���� �߻�
	}

	public void printB() { // this�� �ν��Ͻ� �޼��忡�� ���� ��ü�� ���ؼ�
		System.out.println(b); // �޼��尡 ȣ��� �� �̸� �����ϱ� ���ؼ� ���ȴ�.
	}
}

public class StaticTest03 {
	public static void main(String[] args) {
		StaticTest3.printA();
		StaticTest3 s1 = new StaticTest3();
		StaticTest3 s2 = new StaticTest3();
		s1.printB();
		s2.printB();
	}
}