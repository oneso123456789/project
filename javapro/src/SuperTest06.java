class Point2D06 {		// �θ� Ŭ����
	protected int x = 10;
	protected int y = 20;

	public Point2D06() {
		System.out.println("���� Ŭ������ Point2D ������ ȣ��");
	}

	public Point2D06(int xx, int yy) {
		x = xx;
		y = yy;
	}
}

class Point3D06 extends Point2D06 { // �ڽ� Ŭ����
	protected int z = 30;

	public void print() {
//		super(100,200);
		System.out.println(x + ", " + y + "," + z);
	}

	public Point3D06() {
		super(100,200); // �θ�Ŭ������ �����ڸ� ȣ��
		System.out.println("���� Ŭ������ Point3D ������ ȣ��");
//		super(100,200);
	
	}
}

class SuperTest06 {
	public static void main(String[] args) {
		Point3D06 pt = new Point3D06();
		pt.print();
	}
}