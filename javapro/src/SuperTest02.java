class Point02D {					// �θ� Ŭ����
	protected int x = 10;
	protected int y = 20;
}
class Point03D extends Point02D {  // �ڽ� Ŭ����
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z); // x�� y�� ��� �޾� ����ϴ� �������
	}
}

class SuperTest02 {
	public static void main(String[] args) {
		Point03D pt = new Point03D();
		pt.print();
	}
}