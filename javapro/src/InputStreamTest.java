
// ����¿� ���� ��Ű�� import
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputStreamTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// InputStream ��ü ����
		// System.in�� ǥ���Է� ��ġ�� Ű����� ���� �Է� �޴°��� �ǹ���.
		InputStream is = System.in;
		int inputValue = 0;

		System.out.print("Input Data : ");

		try {
			// Ű����κ��� ���� �Է� ����
			// read() �޼ҵ�� 1����Ʈ�� �о�鿩��
			// ascii �ڵ�(0~127)������ casting��.
			inputValue = is.read();
		} catch (IOException io) {
			// System.out.print(io.toString());
			System.out.print(io.getMessage());
		} // �ѱ� ó���� ����.

		System.out.println("InputData is " + inputValue);
		System.out.println("InputData is " + (char) inputValue);
	}
}
