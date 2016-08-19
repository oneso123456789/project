abstract class AbstractClass {	// 추상 클래스
	abstract void Method01();   // 추상 메소드

	void Method02() {
		System.out.println("Method02:  추상클래스에서 구현");
	}
}

class SubClass extends AbstractClass {

	@Override
	void Method01() {
		// TODO Auto-generated method stub
		System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
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
