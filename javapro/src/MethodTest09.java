class MyDate9 {
	int year = 2006;
	int month = 4;
	int day = 1;
}

class RefMethod {
// Call by reference(주소값 전달에 의한 메소드 호출)	
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
		System.out.println(" 함수 호출 전 d->" + d.year + "/" + d.month + "/" + d.day);
		
		rm.changeDate(d);
		System.out.println(" 함수 호출 후 d->" + d.year + "/" + d.month + "/" + d.day);
		System.out.println(" 함수 호출 후 d->" + t.year + "/" + t.month + "/" + t.day);
	}
}