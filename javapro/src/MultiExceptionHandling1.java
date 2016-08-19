public class MultiExceptionHandling1 {
	public static void main(String[] args) {

		int value = 20;
		int div = 10;

		int[] intArray = { 1, 2, 3 };

		try {
			// �μ��� �������� ����
			int result = value / div;
			System.out.println(result);

			// �迭�� Ư�� ���� ����
			int arrayValue = intArray[2];
			System.out.println(arrayValue);

		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();
		} finally {
			System.out.println("���ܰ� �߻�����!");
		}
	}
}
