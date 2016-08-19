
// File Ŭ������ �����͵��� ��.��� �ϸ鼭 ����ϴ� �����̳�
// ���丮 ü���� �����ϴ� Ŭ������.

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		try {
			// File ��ü ����
			// c:/java01/temp ������ �����ǰ�, �� ��ġ ������
			// test������ ������
			File temp = new File("C:/java01", "temp");
			File tempFile = new File("test");

			// ���丮 ����(mkdirs()�� ���丮�� ����� true��
			// ��ȯ��)
			System.out.println("create directory state : " + temp.mkdirs());
			System.out.println("create directory state : " + tempFile.mkdirs());

			temp.delete();//�ڽ� ������ ������
			File d = temp.getParentFile();// �θ� ������ ����
			d.delete();
			
			
			// ������ ������ �ִ� ���� ����
			File[] f = tempFile.listFiles();
			for(int i=0; i<f.length; i++)
				f[i].delete();
			
			tempFile.delete();
			
			
			
			// File Ŭ�������� �����ϴ� �޼ҵ�� ���� �ý��ۿ� ����
			// �������� ������ ������ ����

//			System.out.println("temp canRead : " + temp.canRead());
//			System.out.println("temp canWrite : " + temp.canWrite());
//			System.out.println("temp getAbsoluteFile : " + temp.getAbsoluteFile());
//			System.out.println("temp getName : " + temp.getName());
//			System.out.println("temp getParent : " + temp.getParent());
//			System.out.println("temp getPath : " + temp.getPath());
//			System.out.println("temp isDirectory : " + temp.isDirectory());
//			System.out.println("temp isFile : " + temp.isFile());
		} catch (Exception e) {
		}
	}
}
