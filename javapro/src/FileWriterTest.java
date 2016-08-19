import java.io.*;

public class FileWriterTest {
	public static void main(String[] args) {
		try {
			// ����� ù��° �μ��� ������ ����
			// �μ��� �޾� �鿩 FileReader ��ü ����
			FileReader fr = new FileReader("data.txt");

			// ����� �ι�° �μ���
			// �������� argument�� �޾� �鿩 FileWriter ��ü ����
			FileWriter fw = new FileWriter("data1.txt");

			int input = 0;

			// File�� ����� ��� �����͸� ��Ʈ���� ����
			// �о� �鿩 �ٸ�File�� ����
			while ((input = fr.read()) != -1) {
				System.out.print((char) input); // ȭ�鿡 ��� �κ�
				fw.write(input); // �ٸ� ���Ͽ� ���� �κ�
			}

			// FileInputStream, FileOutputStream�� ����
			fr.close();
			fw.close();
		} catch (IOException io) {
			System.out.println(io);
		}
	}// main() end
}
