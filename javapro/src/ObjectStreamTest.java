
// ��ü�� ������ ��.��� ��Ű�� Ŭ����

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//java.util.Date;
import java.util.Date;

public class ObjectStreamTest {

	// PersonInforamtion ��ü�� ����
	PersonInformation gemini;
	PersonInformation johnharu;
	Date d;

	// ������
	public ObjectStreamTest() {

		// PersonInforamtion ��ü�� ����
		gemini = new PersonInformation("gemini", 10, "seoul", "02-321-3234");
		johnharu = new PersonInformation("johnharu", 20, "seoul", "02-473-4232");

		// ��¥ ������ ���ϴ� Data ��ü ����
		d = new Date();
	}// ������ end

	// File�� ��ü�� �����ϴ� �޼ҵ�
	public void writeObjectFile() {
		try {
			// ���Ͽ� �����ϱ� ���� FileOutputStream ����
			FileOutputStream fos = new FileOutputStream("person.txt");

			// ���Ͽ� ��ü�� �����ϱ� ���� ObjectOutputStream ��ü ����
			// argument�� FileOutputStream ��ü�� ����
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// write()�� �̿��� ��ü�� file�� ����
			oos.writeObject(gemini);
			oos.writeObject(johnharu);
			oos.writeObject(d);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	// File���� ��ü�� �о���� �޼ҵ�
	public void readObjectFile() {
		try {
			// ���Ͽ��� �����͸� �о���� ���� FileInputStream ��ü ����
			FileInputStream fis = new FileInputStream("person.dat");

			// File�� ����� ��ü�� �о� ���� ����
			// FileInputStream ��ü�� ������ argument�� �޾� ��ü ����
			ObjectInputStream ois = new ObjectInputStream(fis);

			Object o = null;
			// ����(person.dat)�� ����� ��ü�� ��� �о� �� ������ �ݺ�
			while ((o = ois.readObject()) != null) {

				// if( ���� instanceof Ŭ������)
				// : ������ �� Ŭ������ instance���� �ƴ����� üũ��.
				// ���� �о�� ��ü�� PersonInforamtion ��ü�̸�
				if (o instanceof PersonInformation) {
					System.out.print(((PersonInformation) o).getName() + " : ");
					System.out.print(((PersonInformation) o).getAge() + " : ");
					System.out.print(((PersonInformation) o).getAddress() + " : ");
					System.out.print(((PersonInformation) o).getTelephone());

					System.out.println();
				} else {
					System.out.println(o.toString());
				}
			} // while end
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		ObjectStreamTest ost = new ObjectStreamTest();
		ost.writeObjectFile();
		ost.readObjectFile();
	}
}
