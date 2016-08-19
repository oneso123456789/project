class MyDate05 {
	private int year;			// 멤버변수
	private int month;
	private int day;

// 기본 생성자는 컴파일러가 자동으로 생성해 주지만,
// 매개변수를 가진 생성자가 있을 경우에는 더이상
// 기본 생성자를 만들어 주지 않는다.	
	
	// 생성자 오버로딩
	public MyDate05() {		// 기본 생성자
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
		MyDate05 d = new MyDate05(); // 기본 생성자 호출
//		d.year=2016;
		d.print();

		MyDate05 d2 = new MyDate05(2007, 7, 19);
		d2.print();
//		System.out.println(d2.year);
		
		
		
	}
}