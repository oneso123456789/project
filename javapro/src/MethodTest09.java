class MyDate9 {
	int year = 2006;
	int month = 4;
	int day = 1;
}

class RefMethod {
// Call by reference(�ּҰ� ���޿� ���� �޼ҵ� ȣ��)	
	void changeDate(MyDate9 k) {// MyDate9 k = d;
		k.year = 2007;
		k.month = 7;
		k.day = 19;
	}
}
public class MethodTest09 {
	public static void main(String[] args) {
		RefMethod rm = new RefMethod();
		MyDate9 d = new MyDate9();
		MyDate9 t = d;
		System.out.println(" �Լ� ȣ�� �� d->" + d.year + "/" + d.month + "/" + d.day);
		
		rm.changeDate(d);
		System.out.println(" �Լ� ȣ�� �� d->" + d.year + "/" + d.month + "/" + d.day);
		System.out.println(" �Լ� ȣ�� �� d->" + t.year + "/" + t.month + "/" + t.day);
	}
}