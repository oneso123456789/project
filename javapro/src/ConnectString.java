public class ConnectString {

	public static void main(String[] args) {
		// String ��ü ����
		String gemini = "gemini";
		String johnharu = "johnharu";

		// �� String ��ü�� "+" ���� ����
		String tempString1 = gemini + johnharu;
		System.out.println(tempString1);
		System.out.println("gemini" + "johnharu");

		// String + ������
		String tempString2 = tempString1 + 100;
		System.out.println(tempString2);
	}
}
