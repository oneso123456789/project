interface IHello06 {
	int a = 10;

	public abstract void sayHello(String name);
}

interface IGoodBye06 {
	public abstract void sayGoodBye(String name);
}

interface ITotal extends IHello06, IGoodBye06 {
	public abstract void greeting(String name);
}

class SubClass06 implements ITotal {
	public void sayHello(String name) {
		System.out.println(name + "¾¾ ¾È³çÇÏ¼¼¿ä!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "¾¾ ¾È³ç°¡¼¼¿ä!");
	}

	public void greeting(String name) {
		System.out.println(name + ", ¾È³ç!");
	}
}

class AbstractTest06 {
	public static void main(String[] args) {
		SubClass06 test = new SubClass06();
		test.sayHello("È«±æµ¿");
		test.sayGoodBye("È«±æµ¿");
		test.greeting("È«±æµ¿");
	}
}