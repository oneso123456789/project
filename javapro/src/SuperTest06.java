class Point2D06 {		// 부모 클래스
	protected int x = 10;
	protected int y = 20;

	public Point2D06() {
		System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
	}

	public Point2D06(int xx, int yy) {
		x = xx;
		y = yy;
	}
}

class Point3D06 extends Point2D06 { // 자식 클래스
	protected int z = 30;

	public void print() {
//		super(100,200);
		System.out.println(x + ", " + y + "," + z);
	}

	public Point3D06() {
		super(100,200); // 부모클래스의 생성자를 호출
		System.out.println("서브 클래스인 Point3D 생성자 호출");
//		super(100,200);
	
	}
}

class SuperTest06 {
	public static void main(String[] args) {
		Point3D06 pt = new Point3D06();
		pt.print();
	}
}