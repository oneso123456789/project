class MyDate6 {
	int year = 2006;
	int month = 4;
	int day = 1;
}

public class MethodTest06 {
	public static void main(String[] args) {

		int x = 7;	// ���� ����(���ø޸𸮿� �����)
		int y = x;

		MyDate6 d = new MyDate6();
		MyDate6 t = d;	// �ּҰ��� �Ҵ�
		// MyDate6 t=new MyDate6();
		if(d == t){		// �ּҰ��� ��
			System.out.println("���� �ּ�");
		}else{
			System.out.println("�ٸ� �ּ�");
		}		

		System.out.println("x->" + x + " y->" + y);
		System.out.println(d.year + "/" + d.month + "/" + d.day); // 2006/4/1
		System.out.println(t.year + "/" + t.month + "/" + t.day);// 2006/4/1

		y = 10;
		System.out.println("x->" + x + " y->" + y);

		// ���۷��� ���� t�� �����ؼ� MyDate ��ü�� ���� �����ϸ�
		t.year = 2007;
		t.month = 7;
		t.day = 19;
		// ���۷��� ���� d�� �������� ������ ����Ǿ��� ���� ���
		System.out.println(d.year + "/" + d.month + "/" + d.day); // 2007/7/19
		System.out.println(t.year + "/" + t.month + "/" + t.day); // 2007/7/19
	}
}