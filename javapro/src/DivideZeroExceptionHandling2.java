public class DivideZeroExceptionHandling2 {
	public static void main(String[] args) {

		// int type�� ���� ����
		int b = 20;
		int a = 0;
		int c = 0;

		// �� ���� ������ ����� ���Ѵ�
		try {
			c = b / a;
			int total = a + b;
			int sub = b - a;
			System.out.println(c);
		} catch (Exception e) {
			// java.lang.Throwable�� �޼ҵ�
			// ���� ������ �ڼ��� ���
			e.printStackTrace();

			// ���� ������ ���ڿ��� ��ȯ��.
			System.out.println(e.getMessage());

			// ������ ������ ������ ��ȯ��.
			System.out.println(e.toString());
		}
	}// main end
}
