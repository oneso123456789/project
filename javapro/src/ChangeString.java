public class ChangeString {
	public static void main(String[] args) {

		// �⺻ ������ �� ����
		int a = 10;
		System.out.println(a + 10);

		// String ������ ��ȯ
		String sa1 = String.valueOf(a);//String sa1="10";
		System.out.println(sa1 + 10);

		// Wrapper Class ��ü ����
		Integer oint = new Integer(10);

		// String ������ ��ȯ
		String sa2 = oint.toString();//String sa2="10";
		System.out.println(sa2 + 10);

		// String���� int������ ��ȯ
		// int k = Integer.parseInt(sa2);
	}
}