class Parent {		// �θ� Ŭ����
	public void parentPrn() {
		System.out.println("���� Ŭ���� : ParentPrn �޼���");
	}
}

class Child extends Parent {
	public void childPrn() {
		System.out.println("���� Ŭ���� : ChildPrn �޼���");
	}
}

class RefTest01 {
	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn();
		c.childPrn();
		
//		Parent p = new Child();	// ��ĳ����	
		
		Parent p;
		p = (Parent) c; // �Ͻ������� �� ĳ������ �Ͼ
		p.parentPrn(); // �� ĳ���� �Ŀ��� �θ�κ��� ��ӹ��� �޼��常 ȣ���� �� �ִ�,
//		p.childPrn(); //������ ������ �߻��ϰ� �ȴ�.
	}
}