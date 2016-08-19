
public class Method02 {

	static void sum(int n) { // 사용자 정의 메소드
		int tot = 0;
		for (int i = 1; i <= n; i++)
			tot += i;
		System.out.println("1~" + n + "=" + tot);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(5);
		sum(10);
		sum(50);
		sum(100);
	}

}
