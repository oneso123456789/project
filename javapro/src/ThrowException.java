public class ThrowException {

	public void exceptionMethod() throws ArrayIndexOutOfBoundsException {
		// �迭 ����
		int[] intA = { 1, 2, 3, 4 };

		// �迭�� ����� ���� ���
		for (int i = 0; i < 10; i++) {
			// ���ܸ� ����(���α׷��Ӱ� ���ܸ� �߻���Ŵ)
			if (i == 1)
				throw new ArrayIndexOutOfBoundsException();
			System.out.println(intA[i]);
		}
	}

	public static void main(String[] args) {
		ThrowException te = new ThrowException();

		try {
			te.exceptionMethod();
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("�迭�� index�� �ʰ��߽��ϴ�.");
			ab.printStackTrace();
		}

	}// main() end
}