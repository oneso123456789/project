import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumIterVector {

	public static void main(String[] args) {

		// Vector 객체 생성
		Vector v = new Vector(1, 1);

		// Vector에 Object 저장
		v.add(30);
		v.addElement(new Integer(10));
		v.addElement("johnharu");
		v.addElement("gracedew");

		// 열거형
		// Vector의 Object의 나열형을 리턴
		Enumeration e = v.elements();

		// Enumeration을 이용해 Vector의 Object를 출력
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// Vector의 Object의 나열형을 리턴
		Iterator ie = v.iterator();

		// Iterator을 이용해 Vector의 Object를 출력
		while (ie.hasNext()) {
			System.out.println(ie.next());
		}

	} // main end
}
