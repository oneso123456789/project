class MyDate7 {
	int year = 2006;
	int month = 4;
	int day = 1;
}

public class MethodTest07 {
	public static void main(String[] args) {
		MyDate7 d = new MyDate7(); // 객체 생성
		MyDate7 t = d;// t가 이미 선언된 d와 동일한 객체를 참조함
		System.out.println(d.year + "/" + d.month + "/" + d.day); // 2006/4/1
		System.out.println(t.year + "/" + t.month + "/" + t.day); // 2006/4/1

		t = new MyDate7(); // t가 새로 생성된 객체를 가리키므로 d와는 별개로 동작함
		t.year = 2007;
		t.month = 7;
		t.day = 19;
		
		if(d == t){		// 주소값을 비교
			System.out.println("같은 주소");
		}else{
			System.out.println("다른 주소");
		}
		System.out.println(d.year + "/" + d.month + "/" + d.day); // 2006/4/1
		System.out.println(t.year + "/" + t.month + "/" + t.day); // 2007/7/19
	}
}