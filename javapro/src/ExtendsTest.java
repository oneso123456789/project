class Parent0{			// �θ� Ŭ����
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
	 * ��� �׽�Ʈ
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
