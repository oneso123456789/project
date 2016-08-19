class MyDate6 {
	int year = 2006;
	int month = 4;
	int day = 1;
}

public class MethodTest06 {
	public static void main(String[] args) {

		int x = 7;	// 지역 변수(스택메모리에 저장됨)
		int y = x;

		MyDate6 d = new MyDate6();
		MyDate6 t = d;	// 주소값을 할당
		// MyDate6 t=new MyDate6();
		if(d == t){		// 주소값을 비교
			System.out.println("같은 주소");
		}else{
			System.out.println("다른 주소");
		}		

		System.out.println("x->" + x + " y->" + y);
		System.out.println(d.year + "/" + d.month + "/" + d.day); // 2006/4/1
		System.out.println(t.year + "/" + t.month + "/" + t.day);// 2006/4/1

		y = 10;
		System.out.println("x->" + x + " y->" + y);

		// 레퍼런스 변수 t로 접근해서 MyDate 객체의 값을 변경하면
		t.year = 2007;
		t.month = 7;
		t.day = 19;
		// 레퍼런스 변수 d로 접근했을 때에도 변경되어진 값이 출력
		System.out.println(d.year + "/" + d.month + "/" + d.day); // 2007/7/19
		System.out.println(t.year + "/" + t.month + "/" + t.day); // 2007/7/19
	}
}