abstract class AbstractClass {	// �߻� Ŭ����
	abstract void Method01();   // �߻� �޼ҵ�

	void Method02() {
		System.out.println("Method02:  �߻�Ŭ�������� ����");
	}
}

class SubClass extends AbstractClass {

	@Override
	void Method01() {
		// TODO Auto-generated method stub
		System.out.println("Method01: ����Ŭ�������� ������ �߻�޼ҵ�");
	}	
//	abstract void Method0(); 
}

class AbstractTest01 {
	public static void main(String args[]) {
//		AbstractClass ac = new AbstractClass();
		
		SubClass obj = new SubClass();
		obj.Method01();
		obj.Method02();
	}
}
