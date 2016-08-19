import java.io.FileReader;

public class FileReaderTest {
	public static void main(String[] args) {

		// FileReader ��ü ����
		FileReader file = null;
		int inputValue = 0;

		try {
			// "data.txt" File�� stream ����
			file = new FileReader("data.txt");

			// file�� ���� ���� ������ �����͸� �о� ����
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}

			// stream�� ����
			file.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}// main() end
}
