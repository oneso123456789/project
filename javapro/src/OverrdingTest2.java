class OverridingParent2{
	int money = 20;
	void parentMethod(){
		System.out.println("parent method");
	}
}
class OverridingChild2 extends OverridingParent2{
	String money = "20��";
	void parentMethod(){	//�޼ҵ� �������̵�
		System.out.println("overridng method");
	}
}
public class OverrdingTest2 {
	/**
	 * ���� ������ �׽�Ʈ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingChild2 oc2 = new OverridingChild2();
		oc2.money = "30��";
		//oc2.money = 30;
		System.out.println("oc2.money = " + oc2.money);
	}
}
