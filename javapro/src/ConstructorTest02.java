class MyDate02 {
	private int year;		// �������, field
	private int month;
	private int day;

	public MyDate02() {		// �⺻ ������
		System.out.println("[������] : ��ü�� ������ �� �ڵ� ȣ��˴ϴ�.");
	}

	public void print() {	// �޼ҵ�
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest02 {
	public static void main(String[] args) {
		MyDate02 d = new MyDate02();
		d.print();
//		 System.out.println(d.year);
		// MyDate dd = new MyDate();
	}
}