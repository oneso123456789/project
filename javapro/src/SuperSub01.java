class Parent {		// �θ� Ŭ����
	public void parentPrn() {
		System.out.println("���� Ŭ���� �޼���� ��ӵȴ�.");
	}
}

// Parent�� ���� Ŭ������ �ϴ� ���� Ŭ���� Child ����
class Child extends Parent {	// �ڽ� Ŭ����
	public void childPrn() {
		System.out.println("���� Ŭ���� �޼���� ���۰� ��� ���Ѵ�.");
	}
}

class SuperSub01 {
	public static void main(String[] args) {
		Child c = new Child(); // ���� Ŭ������ ��ü�� ����
		c.parentPrn(); // ���� Ŭ�������� ��� ���� �޼��� ȣ��
		c.childPrn(); // ���� Ŭ���� �ڱ� �ڽ��� �޼��� ȣ��
		System.out.println("-------------------------------------->> ");
		
		Parent p = new Parent(); // ���� Ŭ������ ��ü ����
		p.parentPrn(); // ���� Ŭ���� �ڱ� �ڽ��� �޼��� ȣ��
//		p.childPrn( ); //���� Ŭ���� �޼���� ������ ��� ����
	}
}


