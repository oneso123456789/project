class Parent03 {				// �θ� Ŭ����
	public void parentPrn() {
		System.out.println("���� Ŭ���� : ParentPrn �޼���");
	}
}

class Child03 extends Parent03 {// �ڽ� Ŭ����
	public void childPrn() {
		System.out.println("���� Ŭ���� : ChildPrn �޼���");
	}
}

class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03(); // ���� Ŭ������ �ν��Ͻ� ����
		p.parentPrn();
//		p.childPrn();//-������ ����
		
		Child03 c; // ���� Ŭ������ ���۷��� ���� ����
		System.out.println("---------------->>");
		// ���� Ŭ���� ���۷��� ������ ���� Ŭ������ ���۷��� ���� ���Ե�
		c = (Child03) p; // ���� ����ȯ���� �ٿ� ĳ����
		c.parentPrn();
		c.childPrn();
	}
}