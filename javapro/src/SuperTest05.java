class Point2D05 {			// �θ� Ŭ����
	protected int x = 10;
	protected int y = 20;

	public Point2D05() {	// �⺻ ������
		System.out.println("���� Ŭ������ Point2D ������ ȣ��");
	}
}

class Point3D05 extends Point2D05 {	// �ڽ� Ŭ����
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}

	public Point3D05(int a) {
		System.out.println("���� Ŭ������ Point3D ������ ȣ��");
	}
}

class SuperTest05 {
	public static void main(String[] args) {
		Point3D05 pt = new Point3D05(30);
		pt.print();		// �⺻ ������ ȣ��
	}
}