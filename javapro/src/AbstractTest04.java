interface IHello {
	 void sayHello(String name);
}

abstract class GoodBye04 {
	public abstract void sayGoodBye(String name);
}

class SubClass04 extends GoodBye04 implements IHello {
	public void sayHello(String name) {
		System.out.println(name + "¾¾ ¾È³çÇÏ¼¼¿ä!");
	}
	public void sayGoodBye(String name) {
		System.out.println(name + "¾¾ ¾È³çÈ÷ °¡¼¼¿ä!");
	}
}

class AbstractTest04 {
	public static void main(String[] args) {
		SubClass04 test = new SubClass04();
		test.sayHello("È«±æµ¿");
		test.sayGoodBye("È«±æµ¿");
	}
}