class MyDate03 {
	private int year;		// �������
	private int month;
	private int day;

	public MyDate03() { // �⺻ ������
		year = 2006;
		month = 4;
		day = 1;
	}

	public void print() {	// �޼ҵ�
		System.out.println(year + "/" + month + "/" + day);
	}
}// MyDate end

public class ConstructorTest03 {
	public static void main(String[] args) {
		MyDate03 d = new MyDate03();
//		d.year=2016;
		d.print();
	}
}