abstract class AbstractClass0 {	// �߻� Ŭ����
	abstract void Method01();	// �߻� �޼ҵ�

	void Method02() {
		System.out.println("Method02:  �߻�Ŭ�������� ����");
	}
}

abstract class MiddleClass extends AbstractClass0 {
	void Method01() {	// �޼ҵ� �������̵�
		System.out.println("Method01: ����Ŭ�������� ������ �߻�޼ҵ�");
	}
	public void Method03() {
		System.out.println("Method03: �߻�Ŭ�������� ����");
	}
}

class SubClass0 extends MiddleClass {
//	 void Method01(){ // �޼ҵ� �������̵�
//		 System.out.println("Method01: ����Ŭ�������� ������ �߻�޼ҵ�");
//	 }
}

class AbstractTestB {
	public static void main(String args[]) {
		SubClass0 obj = new SubClass0();
		obj.Method01();
		obj.Method02();
		obj.Method03();
	}
}
