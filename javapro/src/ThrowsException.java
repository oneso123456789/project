public class ThrowsException {

	// �������� ���ϴ� �޼ҵ�
	public void occurException() {
		try {
			int result = 3 / 0;
			System.out.println(result);
		} catch (ArithmeticException a) {
			System.out.println("0���� ������ �����ϴ�.");
		}
	}

	public static void main(String[] args) {
		// ��ü�� ����
		ThrowsException te = new ThrowsException();

		// �޼ҵ� ȣ��
		te.occurException();
	}
}
