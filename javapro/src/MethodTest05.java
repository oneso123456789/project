class MyDate5 {
	int year = 2006;
	int month = 4;
	int day = 1;
}

public class MethodTest05 {
	public static void main(String[] args) {

		MyDate5 d;
		System.out.println(d.year + "/" + d.month + "/" + d.day);

// Garbage Collection(쓰레기 수집기능)
// : 레퍼런스 변수가 없는 Heap 메모리 영역의 데이터를 
//   쓰레기로 인식하고 모아서 지워주는 기능.
		new MyDate5();
		
		d = new MyDate5();
		System.out.println(d.year + "/" + d.month + "/" + d.day);
		
		MyDate5 t = new MyDate5();
		System.out.println(t.year + "/" + t.month + "/" + t.day);
	}
}