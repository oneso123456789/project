class FinalMethod {
	String str = "Java";

	// public void setStr(String s) {
	// final ���̸� ���� Ŭ�������� �������̵��� �Ұ�.
	public final void setStr(String s) {
		str = s;
		System.out.println(str);
	}
}

class FinalEx extends FinalMethod {
	int a = 10; // final ���̸� �ؿ��� a�� ���� �Ұ�.

	public void setA(int a) {
		this.a = a;
	}

	public void setStr(String s) {
		str += s;
		System.out.println(str);
	}

}

public class FinalTest02 {
	public static void main(String[] args) {
		FinalEx ft = new FinalEx();
		ft.setA(100);
		ft.setStr("hi");// ���� Ŭ������ setStr�� ����.
		FinalMethod ft1 = new FinalMethod();
		ft1.setStr("hi");// �ڽ��� Ŭ������ setStr�� ����.
	}
}