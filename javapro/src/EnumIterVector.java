import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumIterVector {

	public static void main(String[] args) {

		// Vector ��ü ����
		Vector v = new Vector(1, 1);

		// Vector�� Object ����
		v.add(30);
		v.addElement(new Integer(10));
		v.addElement("johnharu");
		v.addElement("gracedew");

		// ������
		// Vector�� Object�� �������� ����
		Enumeration e = v.elements();

		// Enumeration�� �̿��� Vector�� Object�� ���
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// Vector�� Object�� �������� ����
		Iterator ie = v.iterator();

		// Iterator�� �̿��� Vector�� Object�� ���
		while (ie.hasNext()) {
			System.out.println(ie.next());
		}

	} // main end
}
