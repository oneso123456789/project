class MyDate5 {
	int year = 2006;
	int month = 4;
	int day = 1;
}

public class MethodTest05 {
	public static void main(String[] args) {

		MyDate5 d;
		System.out.println(d.year + "/" + d.month + "/" + d.day);

// Garbage Collection(������ �������)
// : ���۷��� ������ ���� Heap �޸� ������ �����͸� 
//   ������� �ν��ϰ� ��Ƽ� �����ִ� ���.
		new MyDate5();
		
		d = new MyDate5();
		System.out.println(d.year + "/" + d.month + "/" + d.day);
		
		MyDate5 t = new MyDate5();
		System.out.println(t.year + "/" + t.month + "/" + t.day);
	}
}