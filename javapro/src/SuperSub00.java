class Point2D {		// �θ� Ŭ����
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int new_X) {
		x = new_X;  // x=10
	}

	public int getY() {
		return y;
	}

	public void setY(int new_Y) {
		y = new_Y; // y=20
	}
}

class Point3D extends Point2D {	// �ڽ� Ŭ����
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int new_Z) {
		z = new_Z; //z=30;
	}
}
class SuperSub00 {
	public static void main(String[] args) {

		Point3D pt = new Point3D();
//		pt.x=100;
		pt.setX(10); // ��ӹ޾� ���
		pt.setY(20); // ��ӹ޾� ���
		pt.setZ(30); // �ڽ��� �� ���
		System.out.println(pt.getX()// ��ӹ޾� ���
				+ ", " + pt.getY()// ��ӹ޾� ���
				+ ", " + pt.getZ());// �ڽ��� �� ���
	}
}