import java.util.Scanner;

public class Oper04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건 연산자
		// 변수 = (조건식) ? 값1 : 값2;
		int a, b;
		int max, min;
		
		System.out.println("정수 2개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);		
		a = sc.nextInt();	// a=10
		b = sc.nextInt();	// b=5	

		max = (a > b) ? a : b;
		min = (a < b) ? a : b;
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
