public class DivideZeroExceptionHandling {
	public static void main(String[] args) {

		// int type�� ���� ����
		int b = 20;
		int a = 0;
		int c = 0;

		// �� ���� ������ ����� ���Ѵ�

		try {
			c = b / a;		// ���� �߻�
			int total = a + b;
			int sub = b - a;
		} catch (ArithmeticException ae) {
			System.out.println("0���� ������ �����ϴ�.");
			a = 2;
			c = b / a;
		}
		System.out.println(c);
	}
}
