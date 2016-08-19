class Point02D {					// 부모 클래스
	protected int x = 10;
	protected int y = 20;
}
class Point03D extends Point02D {  // 자식 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + ", " + z); // x와 y는 상속 받아 사용하는 멤버변수
	}
}

class SuperTest02 {
	public static void main(String[] args) {
		Point03D pt = new Point03D();
		pt.print();
	}
}