class MyDate {
	int year;		// �������, field
	int month;
	int day;
	boolean a;
	double b;
	String c;

	public void print() {
		System.out.println(year + "/" + month + "/" 
	        + day + "/" + a + "/" + b + "/" + c);
	}

}

public class ConstructorTest01 {
	public static void main(String[] args) {
		MyDate d = new MyDate(); // ����Ʈ ������ ȣ��
		d.year=2016;	
		
		System.out.println(d.year + "/" + d.month + "/" + d.day + "/" + d.a + "/" + d.b + "/" + d.c);
		
	    d.print();
	}
}