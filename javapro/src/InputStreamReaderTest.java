import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {

		// byte Stream�� is ����
		InputStream is = System.in;

		// InputStreamReader ��ü ����
		InputStreamReader isr = new InputStreamReader(is);
		// InputStreamReader(System.in);
		int inputValue = 0;
		System.out.print("Input Value : ");
		try {
			// Ű����� ���� �����͸� �Է�
			// 2����Ʈ�� �о���̱� ������ �ѱ��� 1�� �ۿ� �Է��� �ȵ�.
			inputValue = isr.read();
		} catch (IOException io) {
			System.out.print(io.getMessage());
		}
		// �Է¹��� ����Ÿ�� ���
		System.out.println("Input Result : " + inputValue);
		System.out.println("Input Result : " + (char) inputValue);
	}
}
