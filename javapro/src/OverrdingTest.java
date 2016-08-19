class OverridingParent {		// 부모 클래스
	void parentMethod() {
		System.out.println("parent method");
	}
}

class OverridingChild extends OverridingParent {
	void parentMethod() {	// 메소드 오버라이딩
		System.out.println("overridng method");
	}
}

public class OverrdingTest {
	/**
	 * Overridng 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild oc = new OverridingChild();
		oc.parentMethod();
	}
}
