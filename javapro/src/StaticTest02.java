class StaticTest2 {
	private static int a = 10;// ���� �������
	private int b = 20;		  // �ν��Ͻ� �������

	public static void setA(int new_a) {//�����޼ҵ�
		a = new_a;  // a=10000;
//		b=30;
	}
	public static int getA() {//�����޼ҵ�
		return a;
	}
}

public class StaticTest02 {
	public static void main(String[] args) {
//		System.out.println(StaticTest2.a);// a�� private���� ����Ǿ ������ ���� �߻�
		System.out.println(StaticTest2.getA());

		StaticTest2 s1 = new StaticTest2();
		StaticTest2 s2 = new StaticTest2();

		s1.setA(10000);
		int res1 = s1.getA();
		System.out.println(res1);
		System.out.println(s2.getA());
	}
}