class MyDate10 {

	private int year;
	private int month;
	private int day;

	// 생성자 오버로딩
	public MyDate10() {	// 기본 생성자
		this(2006, 1, 1);//같은 클래스 안에 있는 생성자를 
	}					 // 호출	

	public MyDate10(int new_year) {
		this(new_year, 1, 1);
	}

	public MyDate10(int new_year, int new_month) {
		this(new_year, new_month, 1);
	}

	public MyDate10(int new_year, int new_month, int new_day) {
		year = new_year;	// 2007
		month = new_month;	// 1
		day = new_day;		// 1
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest10 {
	public static void main(String[] args) {
		MyDate10 d = new MyDate10(2007, 7, 19);
		d.print();
		
		MyDate10 d2 = new MyDate10(2007, 7);
		d2.print();
		
		MyDate10 d3 = new MyDate10(2007);
		d3.print();
		
		MyDate10 d4 = new MyDate10();
		d4.print();
	}
}