interface IHello02 {
	public abstract void sayHello(String name);
}
interface IGoodBye02 {
	public abstract void sayGoodBye(String name);
}

// �� �������̽��κ��� ����� �޴� Ŭ���� ����
class SubClass02 implements IHello02, IGoodBye02 {
	public void sayHello(String name) {
		System.out.println(name + "�� �ȳ��ϼ���!");
	}
	public void sayGoodBye(String name) {
		System.out.println(name + "�� �ȳ��� ������!");
	}
}

class InterfaceTest02 {
	public static void main(String[] args) {
		SubClass02 test = new SubClass02();
		test.sayHello("ȫ�浿");
		test.sayGoodBye("ȫ�浿");
	}
}