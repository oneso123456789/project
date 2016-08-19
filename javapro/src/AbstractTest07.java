//�������̽�(IColor)�Ƿ� ���� ��� ����
interface IColor {
	int RED = 1; // ���(public static final �� �ν�)
	public static final int GREEN = 2; // ���
	public static final int BLUE = 3; // ���

	void setColor(int c); // �߻�޼��� (public abstract �� �ν�)

	public abstract int getColor(); // �߻�޼���
}

// Ŭ����(AbsColor)�̹Ƿ� ���� ��� �Ұ��� ���� ��Ӹ�,
abstract class AbsColor implements IColor {
	int color = GREEN; // ������ ���� �� �ֵ�.

	public void setColor(int c) { // ������ �޼��嵵 ���� �� �ִ�.
		color = c; // color=1;
	}
}

class SubClass07 extends AbsColor {
	public int getColor() {
		return color;
	}
}

class AbstractTest07 {
	public static void main(String[] args) {
		SubClass07 test = new SubClass07();
		test.setColor(IColor.RED);
		System.out.println(test.getColor());
	}
}