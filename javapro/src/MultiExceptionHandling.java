public class MultiExceptionHandling {
	public static void main(String[] args) {

		int value = 20;
		int div = 0;
		int[] intArray = { 1, 2, 3 };

		try {
			// int arrayValue = intArray[4];
			// System.out.println(arrayValue);

			// �μ��� �������� ����
			int result = value / div;
			System.out.println(result);

			// �迭�� Ư�� ���� ����
			int arrayValue = intArray[4];
			System.out.println(arrayValue);

		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		}
	}
}
