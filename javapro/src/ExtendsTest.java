class Parent0{			// 부모 클래스
	int parentVar = 10;
	void parentMethod(){
		System.out.println("parent Method");
	}
}
class Child0 extends Parent0{
	int childVar = 20;
	void childMethod(){
		System.out.println("child Method");
	}
}
public class ExtendsTest {
	/**
	 * 상속 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child0 child = new Child0();
		System.out.println("child.parentVar = " + child.parentVar);
		System.out.println("child.childVar = " + child.childVar);
		child.parentMethod();
		child.childMethod();
	}
}
