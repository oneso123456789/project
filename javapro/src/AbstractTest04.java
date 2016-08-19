interface IHello {
	 void sayHello(String name);
}

abstract class GoodBye04 {
	public abstract void sayGoodBye(String name);
}

class SubClass04 extends GoodBye04 implements IHello {
	public void sayHello(String name) {
		System.out.println(name + "�� �ȳ��ϼ���!");
	}
	public void sayGoodBye(String name) {
		System.out.println(name + "�� �ȳ��� ������!");
	}
}

class AbstractTest04 {
	public static void main(String[] args) {
		SubClass04 test = new SubClass04();
		test.sayHello("ȫ�浿");
		test.sayGoodBye("ȫ�浿");
	}
}