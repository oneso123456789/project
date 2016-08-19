class Point2DD {					// 부모 클래스
	private int x = 10; // private int x=10;
	protected int y = 20;
} 
class Point3DD extends Point2DD {  // 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}
}
class SuperSub04 {
	public static void main(String[] args) {
		Point3DD pt = new Point3DD();
		pt.print();
	}
}