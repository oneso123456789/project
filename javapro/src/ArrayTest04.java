
public class ArrayTest04 {
	// 절대값 구하는 부분
	static int abs(int data) { //data=-50;
		if (data < 0)
			data = -data;
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		args[0] = "-50";
		
//			"-50"   --->  -50		
		int n = Integer.parseInt(args[0]);// n=-50
		System.out.println("절대값=" + abs(n));

	}

}
