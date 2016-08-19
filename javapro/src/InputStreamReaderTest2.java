import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest2 {
	public static void main(String[] args) {

		// byte Stream�� is ����
		InputStream is = System.in;

		// InputStreamReader ��ü ����
		InputStreamReader isr = new InputStreamReader(is);

		int inputValue = 0;
		// �迭�� ũ��:10, char�� 2byte
		char[] temp = new char[10];

		System.out.print("Input Value : ");

		try {
			// Ű����κ��� �����͸� �Է�
			inputValue = isr.read(temp);
		} catch (IOException io) {
		}

		System.out.println("InputValue : " + inputValue);

		// char[]�� ���� ���
		for (int i = 0; i < inputValue; i++) {
			System.out.print(temp[i]);
		}

		// char[]�� String type���� ��ȯ
		System.out.println("char[] -> String : " + new String(temp));
	}
}
