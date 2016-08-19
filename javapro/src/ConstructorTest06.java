class MyDate06 {
	private int year;
	private int month;
	private int day;

	// public MyDate06(){//default 생성자
	// }
	public MyDate06(int new_year, int new_month, int new_day) {
		year = new_year; // 2007
		month = new_month; // 7
		day = new_day; // 19
	}

	public void SetYear(int year) {
		// this.year=year;
		year = year;
	}

	public void SetMonth(int new_month) {
		month = new_month; // month=8
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2007, 7, 19);
		d.print();
		
		d.SetYear(2008); // 변경되지 않음
		d.print();
		
		d.SetMonth(8); // 변경됨
		d.print();
	}
}