
/* ���ݱ��� ��� Ŭ�������� ��� �����͸� ����Ʈ�� ���� �����θ� ����ϰ�    */
/*  ��,����� �߾���.                                                        */
/* �������̳� �Ǽ��� ���� �⺻ ������ Ÿ���� ���� �ϸ鼭 ��.����ϴ� �����? */
/* DataInputStream, DataOutputStream Ŭ������ �̿��ϴ� ���                  */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOTest {

	public static void main(String[] args) {
		try {
			// ���Ͽ� �����ϱ� ���� FileOutputStream ��ü ����
			FileOutputStream fos = new FileOutputStream("iodata.txt");

			// FileOutputStream ��ü�� argument�� �޾� ���̴�
			// DataOutputStream ��ü ����
			DataOutputStream dos = new DataOutputStream(fos);

			// �� ������ Ÿ�Կ� �´� write �޼ҵ带 ȣ���� ���Ͽ�
			// �����͸� ����
			dos.writeBoolean(true);
			dos.writeChar('j');
			dos.writeInt(1234);
			dos.writeFloat(3.14F);
			dos.writeDouble(123.5423);
			dos.writeUTF("gemini");

			// ���Ͽ��� �����͸� �о� ���̱� ���� FileInputStream ��ü
			// ����
			FileInputStream fis = new FileInputStream("iodata.txt");

			// �� ������ Ÿ�Ժ��� �����͸� �о� ���̱� ����
			// DataInputStream ��ü ����
			DataInputStream dis = new DataInputStream(fis);

			// �� ������ Ÿ�Կ� �°� read()�� ȣ����
			// ���Ͽ��� �����͸� �о� �鿩 ȭ�� ���
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt()+1);
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());

			// ���� ��Ʈ�� ����
			dos.close();
			dis.close();
		} catch (IOException io) {
			System.out.println(io.toString());
		}
	}
}
