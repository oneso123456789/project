class MyDate07 {
	private int year;
	private int month;
	private int day;

//	public MyDate07() {
//	}

	// ������ ���� �Ű������� �̸��� �Ӽ��� �����ϰ� �� �� �ִ�.
	public MyDate07(int year, int month, int day) {
		// ��������� �Ӽ� ���� �ʱ�ȭ�Ϸ��� ���Կ����� ���ʿ� this�� �ٿ��� �Ѵ�.
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void SetYear(int year) { // ���Կ����� ���ʿ� this�� �ٿ��⿡
		this.year = year; // �Ӽ� ���� �����
	}

	public void SetMonth(int month) {// ���Կ����� ���ʿ� this�� �ٿ��⿡
		this.month = month; // �Ӽ� ���� �����
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest07 {
	public static void main(String[] args) {
		MyDate07 d = new MyDate07(2007, 7, 19);
		d.print();
		
		d.SetYear(2008); // 2008������ ����
		d.SetMonth(8); // 8���� ����
		d.print();
	}
}