class OverridingParent {		// �θ� Ŭ����
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild extends OverridingParent {
	void parentMethod() {	// �޼ҵ� �������̵�
		System.out.println("overridng method");
	}
}

public class OverrdingTest {
	/**
	 * Overridng �׽�Ʈ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
	}
}
