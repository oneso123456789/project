public class UserExceptionTest {

	// Exception�� ȣ���� �޼ҵ�� ����
	public void printNumber() throws UserDefineException {
		for (int i = 0; i < 10; i++) {
			// Excpetion�� �߻���Ŵ
			if (i == 5)
				throw new UserDefineException("����ڰ� ������ Exception�Դϴ�");
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		UserExceptionTest uet = new UserExceptionTest();

		try {
			uet.printNumber();
		} catch (UserDefineException ue) {
			System.out.println(ue.toString());
		}
	}
}
