class MyDate7 {
	int year = 2006;
	int month = 4;
	int day = 1;
}

public class MethodTest07 {
	public static void main(String[] args) {
		MyDate7 d = new MyDate7(); // ��ü ����
		MyDate7 t = d;// t�� �̹� ����� d�� ������ ��ü�� ������
		System.out.println(d.year + "/" + d.month + "/" + d.day); // 2006/4/1
		System.out.println(t.year + "/" + t.month + "/" + t.day); // 2006/4/1

		t = new MyDate7(); // t�� ���� ������ ��ü�� ����Ű�Ƿ� d�ʹ� ������ ������
		t.year = 2007;
		t.month = 7;
		t.day = 19;
		
		if(d == t){		// �ּҰ��� ��
			System.out.println("���� �ּ�");
		}else{
			System.out.println("�ٸ� �ּ�");
		}
		System.out.println(d.year + "/" + d.month + "/" + d.day); // 2006/4/1
		System.out.println(t.year + "/" + t.month + "/" + t.day); // 2007/7/19
	}
}