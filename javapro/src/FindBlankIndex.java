public class FindBlankIndex {
	public static void main(String[] args) {

		String message = "Java program creates many objects.";

		// message�� ���̸� ����.
		int len = message.length();

		System.out.println(len); // len = 34;

		// message �߿��� ' '�� ã��
		for (int i = 0; i < len; i++) {
			char c = message.charAt(i);//char c='J';
			if (c == ' ') {
				System.out.println("index = " + i);
			}
		} // for end
	}
}
