class MyDate05 {
	private int year;			// �������
	private int month;
	private int day;

// �⺻ �����ڴ� �����Ϸ��� �ڵ����� ������ ������,
// �Ű������� ���� �����ڰ� ���� ��쿡�� ���̻�
// �⺻ �����ڸ� ����� ���� �ʴ´�.	
	
	// ������ �����ε�
	public MyDate05() {		// �⺻ ������
	}

	public MyDate05(int new_year, int new_month, int new_day) {
		year = new_year;//	2007
		month = new_month;//	7
		day = new_day;//	19
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest05 {
	public static void main(String[] args) {
		MyDate05 d = new MyDate05(); // �⺻ ������ ȣ��
//		d.year=2016;
		d.print();

		MyDate05 d2 = new MyDate05(2007, 7, 19);
		d2.print();
//		System.out.println(d2.year);
		
		
		
	}
}