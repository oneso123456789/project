class Sawon3{					// �θ� Ŭ����
	String name = "ȫ�浿";
}
class Sales3 extends Sawon3{	// �ڽ� Ŭ����
	String name = "������";
	String displayInfoLocal(){
		String name = "�ֹμ�";
		return name;
	}
	String displayInfoThis(){
		String name = "�ֹμ�";
		return this.name;
	}
	String displayInfoSuper(){
		String name = "�ֹμ�";
		return super.name;
	}
}

public class SuperVariableTest {
	/**
	 * super�� �̿��� ���� ȣ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales3 sales3 = new Sales3();
		System.out.println("local.name = " + sales3.displayInfoLocal());
		System.out.println("this.name = " + sales3.displayInfoThis());
		System.out.println("super.name = " + sales3.displayInfoSuper());
	}
}
