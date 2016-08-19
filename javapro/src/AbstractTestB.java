abstract class AbstractClass0 {	// 추상 클래스
	abstract void Method01();	// 추상 메소드

	void Method02() {
		System.out.println("Method02:  추상클래스에서 구현");
	}
}

abstract class MiddleClass extends AbstractClass0 {
	void Method01() {	// 메소드 오버라이딩
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
	public void Method03() {
		System.out.println("Method03: 추상클래스에서 구현");
	}
}

class SubClass0 extends MiddleClass {
//	 void Method01(){ // 메소드 오버라이딩
//		 System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
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
