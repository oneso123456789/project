import java.util.ArrayList;
import java.util.List;

interface IHello01 {
	public abstract void sayHello(String name);//�߻� �޼ҵ�
}

class Hello01 implements IHello01 {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + "�� �ȳ��ϼ���!");
	}
}

class InterfaceTest01 {
	public static void main(String[] args) {
//		IHello01 ih0 = new IHello01();
//		IHello01 ih1 = new Hello01();
		
//		List li = new List();
		List li0 = new ArrayList();
		
		Hello01 obj = new Hello01();
		obj.sayHello("ȫ�浿");
		obj.sayHello("�̼���");
	}
}
