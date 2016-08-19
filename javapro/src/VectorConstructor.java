import java.util.Vector;

public class VectorConstructor {
	public static void main(String[] args) {

		// �⺻���� vector ���� ���
		Vector vector1 = new Vector();
		System.out.println("size1=" + vector1.size());
		System.out.println("capacity1=" + vector1.capacity());

		// �ʱ� capacity�� ������ ���� ���
		Vector vector2 = new Vector(3);
		System.out.println("size2=" + vector2.size());
		System.out.println("capacity2=" + vector2.capacity());

		// vector�� ���� �߰�
		vector2.add("gemini");
		vector2.add("johnharu");
		vector2.add("gracedew");
		vector2.add("bidon");
		System.out.println("size2=" + vector2.size());
		System.out.println("capacity2=" + vector2.capacity());

		// �ʱ� capacity�� ���� capacity�� ������ ���� ���
		Vector vector3 = new Vector(1, 1);
		vector3.add("opendb");
		System.out.println("size3 = " + vector3.size());
		System.out.println("capacity3=" + vector3.capacity());

		vector3.add("moon");
		System.out.println("size3 = " + vector3.size());
		System.out.println("capacity3=" + vector3.capacity());
	}
}
