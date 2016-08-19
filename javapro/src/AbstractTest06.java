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
		System.out.println(name + "�� �ȳ��ϼ���!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "�� �ȳ簡����!");
	}

	public void greeting(String name) {
		System.out.println(name + ", �ȳ�!");
	}
}

class AbstractTest06 {
	public static void main(String[] args) {
		SubClass06 test = new SubClass06();
		test.sayHello("ȫ�浿");
		test.sayGoodBye("ȫ�浿");
		test.greeting("ȫ�浿");
	}
}